package basicloops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class TestEmployee {
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Employee e1=new Employee(1,"satish",19,1000);
	Employee e2=new Employee(2,"Durga",22,1400);
	Employee e3=new Employee(3,"bond",2,121);
	List<Employee> emplist = new ArrayList<Employee>();
	emplist.add(e2);
	emplist.add(e1);
	emplist.add(e3);
	
	Collections.sort(emplist);
	
	System.out.println("Movies after sorting : ");
    for (Employee e: emplist)
    {
        System.out.println(e.getName() + " " +
                           e.getId() + " " +
                           e.getSalary());
    }
}

}






class Employe implements Comparable<Employee> {

	
	private int id;
    private String name;
    private int age;
    private long salary;
    
    
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employe(int id, String name, int age, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}


	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public long getSalary() {
		return salary;
	}


	public void setSalary(long salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	 

	@Override
	public int compareTo(Employee e1) {
		// TODO Auto-generated method stub
		if(this.id < e1.id) {
			return 1;
		}else { 
			return -1;
		}
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, id, name, salary);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name) && salary == other.salary;
	}
 	
	
}
