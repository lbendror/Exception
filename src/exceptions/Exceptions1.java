package exceptions;

public class Exceptions1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		func1();
	}
	
	public static void func1() throws Exception{
		func2(1);
	}
	
/*	public static void func2() throws Exception{
		throw new Exception ("This is very bad!");
	}
*/
	
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
