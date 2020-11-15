package Day06b;

public class Method2_Retrun {

	public static void main(String[] args) {
	
		//My_Office_Address();
		
		int total = Sum();
		System.out.println(total);
		
		String x1 = MyDetails();
		System.out.println(x1);
		
		System.out.println(MyDetails());
		
	}
	
	public static int Sum() {
		System.out.println(" SUM - Return type method");
		int x = 5;
		int y = 10;
		int z = x + y;		
		return z;
	}
	
	public static String MyDetails() {		
		String x = " I am learning Selenium Java , lab lab lab ..";
		return x;		
	}	
	// Non- return type Method
	public static void My_Office_Address() {
		 String y = "I work remotely";
		
	}
}
