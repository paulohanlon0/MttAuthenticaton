package ie.mtt.mtttodo.auth.api;

import ie.mtt.mtttodo.auth.api.exception.InvalidAuthException;
import ie.mtt.mtttodo.auth.api.exception.UserLockedException;

public interface IAuthManager {
	public AuthUser authorise(AuthCredentials credentials) throws InvalidAuthException, UserLockedException;
}
