package cadit.edu.io;

import java.io.File;
import java.io.FilenameFilter;

public class FilenameValidator implements FilenameFilter {
	
	private String acceptableExt = "";

	public boolean accept(File dir, String name) {

		return name.endsWith(acceptableExt);
	}

	/**
	 * @param acceptableExt
	 */
	public FilenameValidator(String acceptableExt) {
		this.acceptableExt = acceptableExt;
	}

}
