public class Main
{
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.display();
		
		Employee e2= new Employee();
		e2.display();
	}
}

class Employee{
    
    String name="Saurabh",city="Chennai";
    int age=23;
    
    public void display(){
        System.out.println("The name is "+name);
        System.out.println("The age is "+age);
        System.out.println("The city is "+city);
    }
}
