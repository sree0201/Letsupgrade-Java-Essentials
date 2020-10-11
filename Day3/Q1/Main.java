import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    int sum=0,marks;
	    float p;
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter 5 subjects marks each of 100:");
	    
	    for(int i=0;i<5;i++){
	        marks=sc.nextInt();
	        sum=sum+marks;
	    }
	    p=sum/5;
	    
	    System.out.println("Percentage:"+p);
	    
	    if(p>=70){
	        System.out.println("A grade");
	    }
	    else if(p>=50){
	        System.out.println("B grade");
	    }
	    else if(p>=35){
	        System.out.println("C grade");
	    }
	    else{
	        System.out.println("Failed");
	    }
	        
	    
	}
}
