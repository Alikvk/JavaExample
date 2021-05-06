package inheritanceexample;

public class UserManager {
	public void login(User user) {
		System.out.println(user.getUserName() +" Olarak Giriþ Yapýldý");
	}
	public void logout(User user) {
		System.out.println("Çýkýþ Yapýldý.");
	}
	public void addComment(User user) {
		System.out.println("Yorum Yapýldý.");
	}
}
