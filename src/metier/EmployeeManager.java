package metier;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import entitys.Employee;

public class EmployeeManager {
	
	private ArrayList<Employee> employees;
	private SingletonConnection con;
	
	public ArrayList<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}


	public EmployeeManager(){
		con = new SingletonConnection();
		employees = new ArrayList<Employee>();
		updateMainEmployeesList();
	}
	
	
	void updateMainEmployeesList(){
		this.employees.clear();
		
		try{
			Statement stmt = con.getConnection().createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM `employeestable`");
			
			while (rs.next()) {
				String fullname = rs.getString("fullname");
				String adddate = rs.getString("adddate");
				float salary = rs.getFloat("salary");
				int id = rs.getInt("id");
				
				Employee tmp = new Employee();
				tmp.setSalary(salary);
				tmp.setFullname(fullname);
				tmp.setAddDate(adddate);
				tmp.setId(id);
				
				this.employees.add(tmp);
				
			}
			
			
			showEmployeesInConsole();
			
			
		}catch(SQLException e){
			System.out.println(e);
		}
		
		
	}
	
	
	public void addNewEmployee(String fullname,float salary,String adddate){
		try{
			// create a Statement from the connection
			Statement statement = con.getConnection().createStatement();

			// insert the data
			statement.executeUpdate("INSERT INTO `employeestable`( `fullname`, `adddate`, `salary`) VALUES ('"+fullname+"','"+adddate+"',"+salary+")");                                             
			updateMainEmployeesList();
		}catch(SQLException e){
			System.out.println(e);
		}
	}
	
	
	
	void showEmployeesInConsole(){
		for(Employee e: employees){
			System.out.print(e.getFullname());
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
