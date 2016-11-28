package cadit.edu.innerclasses;

public class MainInner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ContainerClass container = new ContainerClass();
		container.member = 10;
		ContainerClass.InnerClass inner = container.new InnerClass();
		inner.incrementContainerMember();
		System.out.println(container.member);
		
		DerivedContainerClass derivedContainer = new DerivedContainerClass();
		derivedContainer.member = 20;
		DerivedContainerClass.InnerClass derivedContainerInner = derivedContainer.new InnerClass();
		derivedContainerInner.incrementContainerMember();
		System.out.println(derivedContainer.member);		
		
		
		
		ContainerClassWithStaticInner.member = 30;
		ContainerClassWithStaticInner.InnerClass staticInner =new ContainerClassWithStaticInner.InnerClass();
		staticInner.incrementContainerMember();
		System.out.println(ContainerClassWithStaticInner.member);
		
//		DerivedContainerClassWithStaticInner.member = 30;
		DerivedContainerClassWithStaticInner.InnerClass derivedContainerStaticInner =new DerivedContainerClassWithStaticInner.InnerClass();
		derivedContainerStaticInner.incrementContainerMember();
		System.out.println(DerivedContainerClassWithStaticInner.member);		
	}

}