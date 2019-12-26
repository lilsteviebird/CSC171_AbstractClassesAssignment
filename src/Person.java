import java.util.*;
/*
Steven Li
31647656
Assignment 6
Lab Days: Tuesday, Thursday 9:40-10:55
I did not collaborate with anyone on this assignment

Class that defines a person who has a name, age, and a phone number;
 */
public abstract class Person{
	public int age;
	public String name;
	public int pNumber;
	
	public Person(int ageGiven, String nameGiven, int pNumber) {
		this.age = ageGiven;
		this.name = nameGiven;
		this.pNumber = pNumber;
	}

	public void setName(String nameGiven) {
		this.name = nameGiven;
	}
	public void setAge(int ageGiven) {
		this.age = ageGiven;
	}
	public void setpNumber(int pNumberGiven) {
		this.age = pNumberGiven;
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public int getpNumber() {
		return this.pNumber;
	}
	
	abstract public void greeting();

	
}
