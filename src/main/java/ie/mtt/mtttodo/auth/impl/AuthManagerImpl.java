package ie.mtt.mtttodo.auth.impl;

import ie.mtt.mtttodo.auth.api.AuthCredentials;
import ie.mtt.mtttodo.auth.api.AuthUser;
import ie.mtt.mtttodo.auth.api.IAuthManager;
import ie.mtt.mtttodo.auth.api.exception.InvalidAuthException;
import ie.mtt.mtttodo.auth.api.exception.UserLockedException;

public class AuthManagerImpl implements IAuthManager{
	public AuthUser authorise(AuthCredentials credentials) throws InvalidAuthException, UserLockedException {
		if(credentials.getPassword().equals(AuthUserRepository.AuthUserCredentials.get(credentials.getUsername()))) {
			AuthUser user = AuthUserRepository.AuthUsers.get(credentials.getUsername());
			if(user != null) {
				return user;
			}
			throw new UserLockedException();
		}
		throw new InvalidAuthException();
	}
}
