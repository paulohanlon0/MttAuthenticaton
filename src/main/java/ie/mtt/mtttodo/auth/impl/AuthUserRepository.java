package ie.mtt.mtttodo.auth.impl;


import java.util.Map;
import java.util.Hashtable;
import ie.mtt.mtttodo.auth.api.AuthUser;

public class AuthUserRepository {
	
	@SuppressWarnings("serial")
	public static Map<String, String> AuthUserCredentials =  new Hashtable<String, String>() {{
		put("test", "abc123");
		put("admin", "password1");
		put("john", "password1");
	}};
	
	@SuppressWarnings("serial")
	public static Map<String, AuthUser> AuthUsers = new Hashtable<String, AuthUser>() {{
		put("test", new AuthUser(1, "Test", "User"));
		put("admin", new AuthUser(2, "Admin", "User"));
	}};
}
