package demoPackage;

public class UsageOfJavaBean {
	public static void main(String[] args) {
		Student1 s1=new Student1();
		//initialize variables
		s1.setName("vinay");
		s1.setrollNo(10);
		s1.setStream("Ece");
		System.out.println("Student Information: ");
		System.out.print("Name :"+ s1.getName()+",RollNo :"+ s1.getrollNo(0)+",Stream :"+ s1.getStream() );
		System.out.println("helloworld");
	}
     

} 
