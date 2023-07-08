package demoPackage;

public class OfficeRegistration {
	public static void main(String[] args) {
		Employee1 e1=new Employee1();
		e1.setId(23);
		e1.setName("vinay");
		e1.setDeptNo(1);
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getId());
		System.out.println(e1); //to call toString implicitly
		System.out.println(e1.toString());  // to call toString explicitly
		String s=new String("vinay");
		System.out.println(s);
	
	}

	

}
