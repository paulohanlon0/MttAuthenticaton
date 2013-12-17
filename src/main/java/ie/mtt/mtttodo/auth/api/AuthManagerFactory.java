package ie.mtt.mtttodo.auth.api;

import ie.mtt.mtttodo.auth.impl.AuthManagerImpl;

public class AuthManagerFactory {
	
	private AuthManagerFactory() {
	}

	public static IAuthManager getAuthManager() {
		return new AuthManagerImpl();
	}
}
