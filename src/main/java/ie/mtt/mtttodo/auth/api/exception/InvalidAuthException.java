package ie.mtt.mtttodo.auth.api.exception;

public class InvalidAuthException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAuthException() {
		super();
	}

	public InvalidAuthException(String message) {
		super(message);
	}

	public InvalidAuthException(Throwable cause) {
		super(cause);
	}

	public InvalidAuthException(String message, Throwable cause) {
		super(message, cause);
	}

}
