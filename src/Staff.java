
public class Staff extends User {
	private long staffid;
	private int yearsOfExperience;
	private String description;
	private double salary;
	public long getStaffid() {
		return staffid;
	}
	public void setStaffid(long staffid) {
		this.staffid = staffid;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
