class ParentClass{
	private int amount2 = 1000;
	int amount1 = 10;
	public void mobile() {
		System.out.println("Button mobile..");
		System.out.println(amount2);
		purse();
	}
	private void purse() {
		System.out.println("purse accessed");
	}
}
class ChildClass extends ParentClass{
	public void mobile() {
		super.mobile();
		System.out.println("Touchscreen mobile..");
		System.out.println(amount1);
		//System.out.println(amount2);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		ParentClass pc = new ParentClass();
		pc.mobile();
		//pc.purse();
		System.out.println(pc.amount1);
		ChildClass cc = new ChildClass();
		cc.mobile();
		System.out.println(cc.amount1);
	}

}
