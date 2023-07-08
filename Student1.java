package demoPackage;

public class Student1 {
	private String Name;
	private int rollNo;
	private String stream;
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public String getName()
	{
		return this.Name;
	}
	public void setrollNo(int rollNo)
	{
		this.rollNo=rollNo;
	}
	public int getrollNo(int rollNo)
	{
		return this.rollNo;
	}
	public void setStream(String stream)
	{
		this.stream=stream;
	}
	public String getStream()
	{
		return this.stream;
	}
	@Override
	public String toString() {
		return "Student1 [Name=" + Name + ", rollNo=" + rollNo + ", stream=" + stream + "]";
	}
	

}
