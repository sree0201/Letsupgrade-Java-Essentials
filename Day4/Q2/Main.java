
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
		Scanner sc=new Scanner(System.in);
		
		int[] a=new int[5];
		int flag=0;
		
		System.out.println("Enter 5 values:");

		for(int i=0;i<5;i++){
		    a[i]=sc.nextInt();
		}

		System.out.println("Odd values:");

		for(int i=0;i<5;i++){
		    if(a[i]%2!=0){
		        System.out.print(a[i]+" ");
			      flag=1;
		    }
		}
		if(flag==0){
		System.out.print("NULL");
		}
	}
}
