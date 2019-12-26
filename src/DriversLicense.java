import java.util.Calendar;
/*
Steven Li
31647656
Assignment 6
Lab Days: Tuesday, Thursday 9:40-10:55
I did not collaborate with anyone on this assignment

Drivers License class that extends license class that adds the value state
 */

public class DriversLicense extends License{
	
	public String state;
	
	public DriversLicense(int num, String exp, String state) {
		super(num, exp);
		this.state = state;
	}
	
	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

	public boolean equals(DriversLicense liGiven) {
		int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
		int year = Calendar.getInstance().get(Calendar.YEAR);
		System.out.println(year);
		String[] parts = this.experiation.split("/");
		String originalMonth = parts[0];
		int oM = Integer.parseInt(originalMonth);
		String originalYear = parts[1];
		int oY = Integer.parseInt(originalYear);

		
		String[] twoParts = liGiven.experiation.split("/");
		String compareMonth = twoParts[0];
		int cM = Integer.parseInt(compareMonth);
		String compareYear = twoParts[1];
		int cY = Integer.parseInt(compareYear);
	

		if(this.licenseNum == liGiven.licenseNum && oY > year && cY > year && liGiven.state.equalsIgnoreCase(this.state)) {
			return true;			
		}
		if(this.licenseNum == liGiven.licenseNum && oY == year && cY == year && liGiven.state.equalsIgnoreCase(this.state)) {
			if(oM < month && cM < month) {
				return true;
			}
		}

		return false;



	}

}
