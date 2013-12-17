package ie.mtt.mtttodo.auth.impl;

import static org.junit.Assert.*;
import org.junit.Test;
import ie.mtt.mtttodo.auth.api.AuthCredentials;
import ie.mtt.mtttodo.auth.api.AuthUser;
import ie.mtt.mtttodo.auth.api.IAuthManager;
import ie.mtt.mtttodo.auth.api.AuthManagerFactory;
import ie.mtt.mtttodo.auth.api.exception.InvalidAuthException;
import ie.mtt.mtttodo.auth.api.exception.UserLockedException;

public class AuthManagerImplTest {
	@Test
	public void authoriseUser_ValidUser() {
		AuthCredentials credentials = new AuthCredentials("test", "abc123");
		IAuthManager manager = AuthManagerFactory.getAuthManager();
		try {
			AuthUser user = manager.authorise(credentials);
			assertEquals("Invalid Internal ID", 1, user.getInternalId());
			assertEquals("Invalid First Name", "Test", user.getFirstName());
			assertEquals("Invalid Surname", "User",  user.getSurname());
		} catch(Exception _ex) {
			fail("Unexpected Exception thrown: " + _ex.getMessage());
		}
	}

	@Test
	public void authoriseUser_InvalidUser() {
		Throwable e = null;
		AuthCredentials credentials = new AuthCredentials("invalidtest", "abc123");
		IAuthManager manager = AuthManagerFactory.getAuthManager();
		try {
			AuthUser user = manager.authorise(credentials);
		} catch(Throwable _ex) {
			e = _ex;
		}
		assertTrue(e instanceof InvalidAuthException);
	}
	
	@Test
	public void authoriseUser_InvalidPassword() {
		Throwable e = null;
		AuthCredentials credentials = new AuthCredentials("test", "invalid");
		IAuthManager manager = AuthManagerFactory.getAuthManager();
		try {
			AuthUser user = manager.authorise(credentials);
		} catch(Throwable _ex) {
			e = _ex;
		}
		assertTrue(e instanceof InvalidAuthException);
	}
	
	@Test
	public void authoriseUser_LockedUser() {
		Throwable e = null;
		AuthCredentials credentials = new AuthCredentials("john", "password1");
		IAuthManager manager = AuthManagerFactory.getAuthManager();
		try {
			AuthUser user = manager.authorise(credentials);
		} catch(Throwable _ex) {
			e = _ex;
		}
		assertTrue(e instanceof UserLockedException);
	}
}
