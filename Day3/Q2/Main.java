
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		String name;
		int birth_date,birth_month,birth_year,sal,annualSal;
		double taxAmt;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter employee name-");
		name=sc.next();
		
		System.out.println("Enter date month and year-");
		birth_date=sc.nextInt();
		birth_month=sc.nextInt();
		birth_year=sc.nextInt();
		
		System.out.println("Enter monthly salary-");
		sal=sc.nextInt();
		
		annualSal=sal*12;
		
		if(annualSal>=500000){
		    taxAmt=0.2*annualSal;
		}
		else if(annualSal>=400000){
		    taxAmt=0.15*annualSal;
		}
		else if(annualSal>=300000){
		    taxAmt=0.1*annualSal;
		}
		else if(annualSal>=200000){
		    taxAmt=0.05*annualSal;
		}
		else{
		    taxAmt=0;
		}
		System.out.println("Name-"+name);
		System.out.println("Annual Salary-"+annualSal);
		System.out.println("Tax Amount-"+taxAmt);
		
		int current_date=11,current_month=10,current_year=2020;
		int month[] = { 31, 28, 31, 30, 31, 30, 31,  
                             31, 30, 31, 30, 31 };
                             
       
        if (birth_date > current_date) { 
            current_month = current_month - 1; 
            current_date = current_date + month[birth_month - 1]; 
        } 
  
        if (birth_month > current_month) { 
            current_year = current_year - 1; 
            current_month = current_month + 12; 
        } 
  
        int cal_date = current_date - birth_date; 
        int cal_month = current_month - birth_month; 
        int cal_year = current_year - birth_year; 
  
        System.out.print("Age- "); 
        System.out.println("Years: " + cal_year +" Months: " + cal_month + " Days: " +  cal_date);
		
	}
}
