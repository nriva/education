package nrsoft.edu.basic;

public class MainMyPoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyPoint start = new MyPoint(0,0);
		MyPoint start2 = new MyPoint(0,0);
		MyPoint end = new MyPoint(10,5);
		
		MyPoint newPoint = end;
		newPoint.setX(100);
		
		if(start.equals(start2))
			System.out.println("Uguali");
		
		
//		start.setX(0);
//		start.setY(0);
//		
//		end.setX(10);
//		end.setY(5);
		
//		System.out.println("MyPoint(" + start.getX() + "," + start.getY() +  ")");
		
		System.out.println(start);
		System.out.println(end);
		System.out.println(newPoint);
		
		

	}

}
