package exceptions;

@SuppressWarnings("serial")
public class MyCustomException extends Exception {

	public MyCustomException(String message) {
		super(message);
	}
}
