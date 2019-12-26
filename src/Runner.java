/*
Steven Li
31647656
Assignment 6
Lab Days: Tuesday, Thursday 9:40-10:55
I did not collaborate with anyone on this assignment

Class that makes runs other classes
 */
public class Runner {
	public static void main(String[] args) {
		
//		//tests student, school, person, classes
//		Student s = new Student(12, "Rochester", "Private", "Com Sci", "Steven", 19, 8242629);
//		
//		Student b = new Student(13, "RIT", "Public", "Language Arts", "Ryan", 22, 4567878);
//		
//		b.setMajor("Com Sci");
//	
//	
//		b.greeting();
//		s.greeting();
		
		//tests license classes
		
		License a = new License(123, "1/2020");
		License b = new License(123, "10/2020");
		
		//tests equals
		if(a.equals(b)) {
			System.out.println("They are equal!");
		}else {
			System.out.println("Not equal!");

		}
		
		if(a.experired()) {
			System.out.println("get a new license");
		}else {
			System.out.println("It's all good");
		}
		
		
		DriversLicense g = new DriversLicense(123, "2/2030", "Vermont");
		DriversLicense p = new DriversLicense(123, "8/2080", "Vermont");
		
		if(g.equals(p)) {
			System.out.println("They are equal!");
		}else {
			System.out.println("Not equal!");

		}

		TruckDriversLicense h = new TruckDriversLicense(123, "1/2020", "Vermont");
		
		System.out.println(h.toString());
		
		FishingLicense f = new FishingLicense(123,"2/5050", "Saltwater");
		System.out.println(f.toString());


	}
}
