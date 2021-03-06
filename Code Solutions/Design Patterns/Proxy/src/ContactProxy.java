/**
 * Proxy to manage contact info updates
 * @author Nitinkumar Gove
 *
 */
public class ContactProxy implements ProfileProxy {

	Profile profile;
	
	public ContactProxy(){
		this.profile = new Profile();
	}
	
	@Override
	public void updateUsername(String username, String password) {
		
		if(getPassword().equalsIgnoreCase(password)){
			profile.setUsername(username);
			System.out.println("Username Updated");
		}
		else{
			System.out.println("Unauthorized Access Blocked");
		}
	}
	
	public void getUsername(String password){
		if(profile.getPassword().equalsIgnoreCase(password)){
			System.out.println("Updated Password - " + profile.getPassword());
		}
	}

	@Override
	public void updatePassword(String newpassword, String currentpassword) {
		// do nothing		
	}

	@Override
	public void updateEmailId(String emailid, String password) {
		if(getPassword().equalsIgnoreCase(password)){
			profile.setEmailid(emailid);
			System.out.println("Email Id Updated");
		}
		else{
			System.out.println("Unauthorized Access Blocked");
		}
	}
	
	public String getPassword(){
		return "abc123LMN";
	}

}
