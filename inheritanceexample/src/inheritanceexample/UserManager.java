package inheritanceexample;

public class UserManager {
	public void login(User user) {
		System.out.println(user.getUserName() +" Olarak Giri� Yap�ld�");
	}
	public void logout(User user) {
		System.out.println("��k�� Yap�ld�.");
	}
	public void addComment(User user) {
		System.out.println("Yorum Yap�ld�.");
	}
}
