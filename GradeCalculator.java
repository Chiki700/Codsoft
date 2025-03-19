package Scanner;

import java.util.Scanner;

public class GradeCalculator {
	

	
	public static void main(String[]args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter marks in each subject out of 100");
	    System.out.println("Subject 1:");
		int m=s.nextInt();
		System.out.println("Subject 2:");
		int p=s.nextInt();
		System.out.println("Subject 3:");
		int j=s.nextInt();
		System.out.println("Subject 4:");
		int e=s.nextInt();
		System.out.println("Subject 5:");
		int l=s.nextInt();
		int sum= m+p+j+e+l;
		
		System.out.println("The total no. is 500");
		float averagepercentage=sum/5;
		char Grade = 80;
		if(averagepercentage>=90) {
		  Grade='O'; 	
		}
		else if(averagepercentage>=80 && averagepercentage<90) {
			 Grade='E';
			
		}
		else if(averagepercentage>=70 && averagepercentage<80) {
			 Grade='A';

		
		
	}
		else if(averagepercentage>=60 && averagepercentage<70) {
			 Grade='B';
			
					}
		else if(averagepercentage>=50 && averagepercentage<60) {
			 Grade='C';
			
		}
		else if(averagepercentage>=40 && averagepercentage<50) {
			 Grade='D';
		}
		else if(averagepercentage<40) {
			 Grade='F';
		}
		System.out.println("Your total mark is:"+sum);
		System.out.println("Your average percentage is:"+averagepercentage);
		System.out.println("Grade:"+Grade);
		
		
}
}
