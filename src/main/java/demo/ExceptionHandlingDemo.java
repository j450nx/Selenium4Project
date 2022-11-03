package demo;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
//		try {
//			System.out.println("Hello World!");
//			int i = 1/0;
//			System.out.println("Completed");
//			}
//		catch(Exception e) {
//			System.out.println("I am inside catch block");
//			System.out.println("Message is : " + e.getMessage());
//			System.out.println("Cause is : " + e.getCause());
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("I am inside finally block");
//		}
		try {
			demo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void demo() throws Exception {
		System.out.println("Hello World!");
		throw new ArithmeticException("Not valid operation");
//		int i = 1/0;
//		System.out.println("Completed");
	}
}
