package cadit.edu.enu;

public class EnumMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(MyEnum.CASE1.getValue1()==MyEnum.CASE2.getValue1());
		System.out.println(MyEnum.CASE1==MyEnum.valueOf("CASE1"));
		System.out.println(MyEnum.CASE1.getValue1()==MyEnum.CASE3.getValue1());
		
		System.out.println(MyEnum.CASE1.name());
		System.out.println(MyEnum.CASE1.toString());
		

	}

}
