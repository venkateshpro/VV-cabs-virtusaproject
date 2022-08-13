package Exceptionhandling;

public class ExceptionHandler extends Exception {
	
	public ExceptionHandler(String msg) {
		super(msg);
	}
	
	@Override
	public String toString() {
		return "Currently No Cab is available for booking.\nPlease try again after few minutes.";
	}

}
