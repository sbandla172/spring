package basicloops;

import java.util.ArrayList;
import java.util.List;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Student student1 = new Student(1,"sATISH","A Street","555-555-5551", "jAVA");
		Student student2 = new Student(2,"DurgaMani", "B Street","555-555-5552" ,"jAVA");
		Student student3 = new Student(3,"Bondu", "c Street","555-555-5553","abv");
		List<Student> StudentList = new ArrayList<Student>();
		StudentList.add(student1);
		StudentList.add(student2);
		StudentList.add(student3);
		for(Student St : StudentList){
			System.out.println("list of Students" + St);
		}
		
		Employee employee1 = new Employee(1,"Nag", "12330 A Street","415-555-1314",111);
		Employee employee2 = new Employee(2,"sathi", "12330 B Street","415-555-1314",111);
		Employee employee3 = new Employee(3,"cherry", "12330 C Street","415-555-1333",111);
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(employee1);
		emplist.add(employee2);
		emplist.add(employee3);
		
		
		

		prof prof1 = new prof("Lee", " TEXAS","666-666-1414","JAVA PROG");
		prof prof2= new prof("Mani", "dALLAS","666-666-1414","AssistantProfessor");
		List<prof> proflist = new ArrayList<prof>();
		proflist.add(prof1);
		proflist.add(prof2);



        System.out.println(student1.toString());
        System.out.println(employee1.toString());
        System.out.println(prof1.toString());
       
        }
}
class Person{	
	String name;
	String address;
	String phoneNo;
	Person(String newName,String newAddress,String newPhoneNo){
		this.name=newName;
		this.address=newAddress;
		this.phoneNo=newPhoneNo;
	}
	public void setName(String newName){
		name = newName;
	}

	public String getName(){
		return name;
	}

	public void setAddress(String newAddress){
		address = newAddress;
	}

	public String getAddress(){
		return address;
	}
	public void setPhoneNo(String newPhoneno){
		phoneNo = newPhoneno;
	}

	public String getPhoneNo(){
		return phoneNo;
	}

	public String toString(){
		return "Name :"+getName()+" ::Adress :"+getAddress()+":: PhoneNO ::"+getPhoneNo();
	}
}
class Student extends Person{
	int id;
	String major;
	Student(int newId,String newName,String newAddress,String newPhoneNo,String newMajor){
		super(newName, newAddress, newPhoneNo);
		this.id=newId;
		this.major=newMajor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String toString(){
		return "Name :"+getName()+" ::Adress :"+getAddress()+":: PhoneNO ::"+getPhoneNo()+" Id :"+getId()+" Major :"+getMajor();
	}
}

class Employee extends Person{
	double salary;
	int empNo;

	Employee(int newEmpNo,String newName,String newAddress,String newPhoneNo,double newSalary){
		super(newName, newAddress, newPhoneNo);
		this.salary=newSalary;
		this.empNo=newEmpNo;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}


	public String toString(){
		return "Name :"+getName()+" ::Adress :"+getAddress()+":: PhoneNO ::"+getPhoneNo()+" Salary :"+getSalary()+" EmpNo :"+getEmpNo();
	}
}

class prof extends Person{
	
	String course;
	


	public prof(String newName, String newAddress, String newPhoneNo, String newCourse) {
		super(newName, newAddress, newPhoneNo);
		// TODO Auto-generated constructor stub
		this.course=newCourse;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "prof [course=" + getCourse() + ", name=" + getName() + ", phoneNo=" + getPhoneNo() + "]";
	}

}



	
