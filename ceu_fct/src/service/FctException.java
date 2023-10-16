package service;

public class FctException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1389429515767091531L;

	public FctException() {
	}

	public FctException(String message) {
		super(message);

	}

	public FctException(Throwable cause) {
		super(cause);

	}

	public FctException(String message, Throwable cause) {
		super(message, cause);

	}

	public FctException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}
