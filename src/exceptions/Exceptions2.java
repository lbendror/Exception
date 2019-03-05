package exceptions;

public class Exceptions2 {

	public static void main(String[] args) {
		func1();
	}

	public static void func1() {
		func2(1);
	}
	
	public static void func2(int tryNumber) {
		
		try {
			
			if (tryNumber == 1) {
				throw new Exception("This is very bad!");
			}
			else {
				System.out.println("Success!");
			}
			
		}
		catch (NullPointerException ex) {
			
		}
		catch (Exception e) {
			func2(tryNumber++);
		}
		finally {
			System.out.println("This is done anyway!");
		}
	}
}
