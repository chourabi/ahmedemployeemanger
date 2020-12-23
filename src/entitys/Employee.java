package entitys;

public class Employee {
	
	String fullname;
	float salary;
	String addDate;
	int workingHours;
	int id;
	
	
	
	
	public Employee(String fullname, float salary, String addDate, int workingHours, int id) {
		super();
		this.fullname = fullname;
		this.salary = salary;
		this.addDate = addDate;
		this.workingHours = workingHours;
		this.id= id;
	}
	public Employee() {
		super();
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getAddDate() {
		return addDate;
	}
	public void setAddDate(String addDate) {
		this.addDate = addDate;
	}
	public int getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
