class ParentClass1{
	ParentClass1(){
		System.out.println("supermethod running...");
	}
	public void parentMethod() {
		System.out.println("parentMethod....");
	}
}
class ChildClass1 extends ParentClass1{
	ChildClass1(){
		super();
	}
	public void parentMethod() {
		super.parentMethod();
		System.out.println("ChildMethod....");
	}
}
class GrandChildClass1 extends ChildClass1{
	
	public void parentMethod() {
		super.parentMethod();
//		System.out.println("ChildMethod....");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		ParentClass1 pc = new ParentClass1();
		pc.parentMethod();
		ChildClass1 cc = new ChildClass1();
		cc.parentMethod();
		GrandChildClass1 gcc = new GrandChildClass1();
		gcc.parentMethod();
	}

}
