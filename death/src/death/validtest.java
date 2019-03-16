package death;

import java.util.HashMap;

public class validtest {
	
	HashMap map;
	public validtest() {
		map = new HashMap();
		map.put("ahmed", "1234");
		
	}
	
	public boolean valid(String name , String pass) {
		
		boolean key = false;
		
		String obj = (String) map.get(name);
		
		if (obj != null) {
			key = obj.equals(pass);
		}
		
		return key;
	}
	

}
