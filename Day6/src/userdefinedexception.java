
public class userdefinedexception extends Exception{
	String message;
	userdefinedexception() {
		// TODO Auto-generated constructor stub
		message="not applicable";
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "appication not applicable";
	}
	
}
