
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
		Scanner sc=new Scanner(System.in);
		
		int[] a=new int[5];
		int sum=0;
		
		System.out.println("Enter 5 values:");

		for(int i=0;i<5;i++){
		    a[i]=sc.nextInt();
		    sum=sum+a[i];
		}

		System.out.println("Sum of 5 values:"+sum);
	}
}
