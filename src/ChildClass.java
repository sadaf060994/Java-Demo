public class ChildClass extends ParentClass {
	
	public void getStringData() {
		System.out.println(name);
		
	}
	
	public void getData() {
		System.out.println("I m in Child Class");
		
	}
	

	public static void main(String[] args) {
		
		ChildClass cc= new ChildClass();
		cc.getStringData();
		cc.getData();
	}
	

}
