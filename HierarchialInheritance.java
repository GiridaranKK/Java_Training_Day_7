class ParentClass{
	ParentClass() {
		System.out.println("ConstructorA running....");
	}
	public void A1() {
		System.out.println("A1 running...");
	}
	
}
class ChildClass1 extends ParentClass{
	ChildClass1(){
		System.out.println("ConstructorB running....");
	}
}
class ChildClass2 extends ParentClass{
	
}
public class HierarchialInheritance {

	public static void main(String[] args) {
		ParentClass pc = new ParentClass();
		pc.A1();
		ChildClass1 cc1 = new ChildClass1();
		cc1.A1();
		ChildClass2 cc2 = new ChildClass2();
		cc2.A1();
	}

}
