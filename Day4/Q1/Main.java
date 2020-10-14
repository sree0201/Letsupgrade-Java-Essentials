
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Avenger[] a=new Avenger[5];
		
		for (int i=0; i<5;i++){
		    a[i]=new Avenger();
		    a[i].getDetails();
		}
		for (int i=0; i<5;i++){
		    a[i].displayDetails();
		} 
		
	}
}

class Avenger{
    String name,weapon,planet,power;
    int age;
    
    Scanner sc=new Scanner(System.in);
    
    void getDetails(){
        System.out.println("Enter name-");
        name=sc.next();
        System.out.println("Enter age-");
        age=sc.nextInt();
        System.out.println("Enter weapon-");
        weapon=sc.next();
        System.out.println("Enter power-");
        power=sc.next();
        System.out.println("Enter planet-");
        planet=sc.next();
    }
    
    void displayDetails(){
        System.out.println("Name-"+name);
        System.out.println("Age-"+age);
        System.out.println("Weapon-"+weapon);
        System.out.println("Power-"+power);
        System.out.println("Planet-"+planet);
    }
}
