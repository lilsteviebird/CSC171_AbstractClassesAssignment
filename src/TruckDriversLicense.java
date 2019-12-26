/*
Steven Li
31647656
Assignment 6
Lab Days: Tuesday, Thursday 9:40-10:55
I did not collaborate with anyone on this assignment

Class that extends DriversLicense but adds a new value that this class is for Truck drivers
 */

public class TruckDriversLicense extends DriversLicense {

	public TruckDriversLicense(int num, String exp, String state) {
		super(num, exp, state);
	}

	@Override
	public String toString() {

		return "This is a Truckers license. The license number is: " + licenseNum + " It expires on: " + experiation
				+ " and it was issued by: " + state;
	}
	
}
