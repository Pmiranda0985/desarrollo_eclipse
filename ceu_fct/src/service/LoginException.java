package service;

public class LoginException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4958977299051991421L;

	public LoginException() {
	}

	public LoginException(String message) {
		super(message);

	}

	public LoginException(Throwable cause) {
		super(cause);

	}

	public LoginException(String message, Throwable cause) {
		super(message, cause);

	}

	public LoginException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}
