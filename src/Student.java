/*
Steven Li
31647656
Assignment 6
Lab Days: Tuesday, Thursday 9:40-10:55
I did not collaborate with anyone on this assignment

Class that extends Person as a Student
 */
public class Student extends Person{
	public int studentID;
	public School studentSchool = new School();
	public String major;
	
	public Student(int studentId, String schoolName, String type, String major, String name, int age, int pNumber) {
		super(age, name, pNumber);
		this.studentID = studentId;
		
		//Please excuse poor syntax, I just wanted to see if this would work
		studentSchool.setSchool(schoolName);
		studentSchool.setType(type);
		//this part^
		
		this.major = major;
		
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public void setStudentSchool(School school) {
		this.studentSchool = school;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public int getID() {
		return this.studentID;
	}
	public School getSchool() {
		return this.studentSchool;
	}
	public String getMajor() {
		return this.major;
	}
	
	@Override
	public void greeting() {
		if(this.major.equalsIgnoreCase("Com Sci")) {
			System.out.println("Greetings Earthlings");
		}else {
			System.out.println("hey");
		}
	}


}
