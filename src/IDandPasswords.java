import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String, String> logininf = new HashMap<>();
	
	public IDandPasswords() {
		logininf.put("Bro", "Pizza");
		logininf.put("Brometheus", "PASSWORD");
		logininf.put("BroCode", "abc123");
	}
	
	protected HashMap getInfo() {
		return logininf;
	}

}
