import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Engineer e[]=new Engineer[3];
		
		for(int i=0;i<3;i++){
		    e[i]=new Engineer();
    		e[i].getDetails();
		}
		
		for(int i=0;i<3;i++){
		    e[i].putDetails();
		}
    		
		Doctor d[]=new Doctor[3];
		
		for(int i=0;i<3;i++){
		    d[i]=new Doctor();
    		d[i].getDetails();
		}
		
		for(int i=0;i<3;i++){
		    d[i].putDetails();
		}

        
        Pilot p[]=new Pilot[3];
        
        for(int i=0;i<3;i++){
		    p[i]=new Pilot();
    		p[i].getDetails();
		}
		
		for(int i=0;i<3;i++){
		    p[i].putDetails();
		}
        
	}
}
class Employee{
    
    Scanner sc=new Scanner(System.in);
    
    String name,designation;
    int age,salary;
    
    void getDetails(){
        System.out.println("Enter name:");
        name=sc.nextLine();
        
        System.out.println("Enter age:");
        age=sc.nextInt();
        
        System.out.println("Enter salary:");
        salary=sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("Enter designation:");
        designation=sc.nextLine();
    }
    void putDetails(){
        System.out.println("Name: "+name+" Age: "+age+" Salary: "+salary+" Designation: "+designation);
    }
}
class Doctor extends Employee{
    String clinicName,Specialities;
    
    void getDetails(){
        System.out.println("Enter name:");
        name=sc.next();
        
        System.out.println("Enter age:");
        age=sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("Enter your clinic name");
        clinicName=sc.nextLine();
        
        System.out.println("Enter your specialities");
        Specialities=sc.nextLine();
    }
    void putDetails(){
        System.out.println("Name: "+name+" Age: "+age+" Clinic : "+clinicName+" Specialities: "+Specialities);
    }
}
class Engineer extends Employee{
    String companyName;
    
    void getDetails(){
        
        super.getDetails();
        
        System.out.println("Enter company name:");
        companyName=sc.nextLine();
    }
    void putDetails(){
        
        super.putDetails();
        
        System.out.println(" Company Name: "+companyName);
    }
}
class Pilot extends Employee{
    String trainingInst;
    
    void getDetails(){
        
        super.getDetails();
        
        System.out.println("Enter your training institute-");
        trainingInst=sc.nextLine();
    }
    void putDetails(){
        
        super.putDetails();
        
        System.out.println(" Training Institute: "+trainingInst);
    }
}
