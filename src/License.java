
import java.util.*;
/*
Steven Li
31647656
Assignment 6
Lab Days: Tuesday, Thursday 9:40-10:55
I did not collaborate with anyone on this assignment

Class that makes defines a license that has a license number and an experation date
 */

public class License {
	public int licenseNum;
	public String experiation;

	public License(int licenseNum, String experiation) {
		this.licenseNum = licenseNum;
		this.experiation = experiation;
	}
	
	public String toString() {
		return "The license number is: " + licenseNum + " It expires on: " + experiation;
	}

	public int getNum() {
		return this.licenseNum;
	}
	public String getExp() {
		return this.experiation;
	}

	public void setNum(int num ) {
		this.licenseNum = num;
	}
	public void setExp(String exp) {
		this.experiation = exp;
	}
	
	//checks if license is past today's date
	public boolean experired() {
		int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
		int year = Calendar.getInstance().get(Calendar.YEAR);
		String[] parts = this.experiation.split("/");
		String originalMonth = parts[0];
		int oM = Integer.parseInt(originalMonth);
		String originalYear = parts[1];
		int oY = Integer.parseInt(originalYear);
		
		if(oY < year) {
			return true;
		}
		if(oY == year && oM < month) {
			return true;
		}
		return false;
	}

	//Compares the date to the experiation date and sees if license is still viable and license number of licenses

	public boolean equals(License liGiven) {
		int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
		int year = Calendar.getInstance().get(Calendar.YEAR);
		System.out.println(year);
		
		//splits the string into two strings and then converts them into integers
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
	

		if(this.licenseNum == liGiven.licenseNum && oY > year && cY > year) {
			return true;			
		}
		if(this.licenseNum == liGiven.licenseNum && oY == year && cY == year) {
			if(oM < month && cM < month) {
				return true;
			}
		}

		return false;



	}




}
