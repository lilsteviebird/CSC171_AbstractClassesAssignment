/*
Steven Li
31647656
Assignment 6
Lab Days: Tuesday, Thursday 9:40-10:55
I did not collaborate with anyone on this assignment

Class that defines School 
 */
public class School {
	public String schoolName;
	public String type;
	
	public School(String schoolName, String type) {
		this.schoolName = schoolName;
		this.type = type;
	}
	public School() {
		
	}
	public String getSchool() {
		return this.schoolName;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setSchool(String schoolName) {
		this.schoolName = schoolName;
	}
	public void setType(String type) {
		this.type = type;
	}
}
