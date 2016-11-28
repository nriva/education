package cadit.edu.io;

import java.io.*;
import java.util.*;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

import javax.security.auth.callback.TextInputCallback;

import cadit.edu.collection.*;

public class MainIO {
	
	// Static inner version
//	static class FilenameValidator implements FilenameFilter {
//		
//		private String acceptableExt = "";
//
//		@Override
//		public boolean accept(File dir, String name) {
//
//			return name.endsWith(acceptableExt);
//		}
//
//		/**
//		 * @param acceptableExt
//		 */
//		public FilenameValidator(String acceptableExt) {
//			this.acceptableExt = acceptableExt;
//		}
//
//	}	

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		//listFiles2(args[0]);
		
	
		try {
			useBytearrayStream();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	@SuppressWarnings("unused")
	private static void useFileClass()
	{
		
		File file = new File("c:\\temp\\testo.txt");
		
		System.out.println("Lunghezza: " + file.length());
		System.out.println("Data ultima modifica: " + new Date(file.lastModified()));
	}	
	
	@SuppressWarnings("unused")
	private static void listFiles(String extension)
	{
		File f = new File("c:\\temp");
		// Uncomment the above inner class definition to use it
		for(String filename: f.list(new FilenameValidator(extension)))
			System.out.println(filename);
	}
	
	/**
	 * Version with inner anonymous
	 * @param extension
	 */
	@SuppressWarnings("unused")
	private static void listFiles2(String extension)
	{
		final String ext = extension;
		File f = new File("c:\\temp");
		String[] filelist = f.list(new FilenameFilter() {

			  public boolean accept(File f, String s) { 
				  return s.endsWith(ext); 
			  }
		});
		for(String filename : filelist)
			System.out.println(filename);
	}
	
	

	/**
	 * Reads a file line by line and write it to console
	 */
	@SuppressWarnings("unused")
	private static void readLineByLine() {
		String filename = "c:\\temp\\testo.txt";
		
		
		if( (new File(filename)).exists())
		{
			
			try {
				BufferedReader reader = new BufferedReader(new FileReader(filename));
				String line;
			    while ((line = reader.readLine()) != null) {
			        System.out.println(line);
			    }
			    reader.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else
			System.out.println(filename + " non esiste");
	}
	
	
	// READERS
	@SuppressWarnings("unused")
	private static void useStringWriterReader() throws IOException {
		
		String filename = "c:\\temp\\testo.txt";
		String line;
		
 
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		StringWriter sw = new StringWriter();
		
		// Read from file and write to StringWriter
		
		while ((line = reader.readLine()) != null) {
		    sw.write(line);
		}
		reader.close();
		
		// Get
		String string = sw.toString();
		sw.close();
		
		StringReader sr = new StringReader(string);
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\temp\\output.txt"));
		int c;
		while((c = sr.read())!=-1)
			bw.write(c);
		bw.close();
		sr.close();
	}
	
	// Stream Usage	--> Binary
	@SuppressWarnings("unused")
	private static void useDataStream() throws IOException {
		
		int i = 20;
		boolean b = true;
		double d = 1.01;
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("c:\\temp\\output.txt"));
		dos.writeInt(i);
		dos.writeBoolean(b);
		dos.writeDouble(d);
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("c:\\temp\\output.txt"));
		int i2 = dis.readInt();
		boolean b2 = dis.readBoolean();
		double d2 = dis.readDouble();
		dis.close();
		
		assert i==i2 : "i==i2";
		assert b==b2 : "b==b2";
		assert d==d2 : "d!=d2";
	}
	
	//@SuppressWarnings("unused")
	private static void useBytearrayStream() throws IOException	{
		
		DataInputStream dis = new DataInputStream(new FileInputStream("c:\\temp\\cavajdemo.zip"));
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
		int b=0;
		while((b = dis.read())!=-1)
			baos.write(b);
		dis.close();
		
		// Reverse byte orders
		byte[] bytes = baos.toByteArray();
		byte[] bytes2 = new byte[bytes.length];
		for(int k=0;k<bytes.length;k++)
			bytes2[k]=bytes[bytes.length-k-1];

		
		ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("c:\\temp\\cavajdemo2.zip"));
		
		while(( b=bais.read() )!=-1)
			dos.write(b);
		dos.close();
		bais.close();
	}
	
	/**
	 * Reads from input console and write to a file.
	 */
	@SuppressWarnings("unused")
	private static void writeToFile()
	{
		
		String line="";
		
		BufferedReader in
		   = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("C:\\temp\\output.txt"));
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		try {
			while((line=in.readLine())!=null)
			{
				bw.write(line + "\r\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("unused")
	private static void checkSum(){
		String file = "c:\\temp\\output.txt";
		try{

			CheckedInputStream cis = null;
			long sizeOfFile = 0;

			cis = new CheckedInputStream(new FileInputStream(file), new CRC32());
				
			sizeOfFile = new File(file).length();

			byte[] buffer = new byte[100];
			while(cis.read(buffer)>=0){
				long checksum = cis.getChecksum().getValue();
				System.out.println(checksum + " " + sizeOfFile + " " + file);
			}
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}	
	
	@SuppressWarnings({ "unused", "unchecked" })
	private static void serialization() {
		List<Person> list = new ArrayList<Person>();
		List<Person> list2 = null;
		
		list.add(new Person("Paolino","Paperino","Paperopoli",68));
		list.add(new Person("Paperon","De Paperoni","Paperopoli",106));
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("esempio.dmp"));
			oos.writeObject(list);
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("esempio.dmp"));
			list2 = (List<Person>)ois.readObject();
			
			for(Person p : list2)
				System.out.println(p);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}	

}
