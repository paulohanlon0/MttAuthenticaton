package ie.mtt.mtttodo.auth.api.exception;

public class UserLockedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserLockedException() {
		super();
	}

	public UserLockedException(String message) {
		super(message);
	}

	public UserLockedException(Throwable cause) {
		super(cause);
	}

	public UserLockedException(String message, Throwable cause) {
		super(message, cause);
	}

}
