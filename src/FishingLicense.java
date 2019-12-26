/*
Steven Li
31647656
Assignment 6
Lab Days: Tuesday, Thursday 9:40-10:55
I did not collaborate with anyone on this assignment

Drivers License class that extends license class that adds the value state
 */

public class FishingLicense extends License {
	
	String typeFish;
	public FishingLicense(int num, String exp, String typeFish) {
		super(num, exp);
		this.typeFish = typeFish;
	}
	
	@Override
	public String toString() {
		return "The license number is: " + licenseNum + " It expires on: " + experiation
				+ "and you may only catch " + typeFish + " kind of fish";
	}
	
	public String getTypeFish() {
		return typeFish;
	}
	public void setTypeFish(String typeFish) {
		this.typeFish = typeFish;
	}
	
}
