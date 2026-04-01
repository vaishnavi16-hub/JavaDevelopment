
public class AppCheck {

	public static void main(String[] args) {
		Instagram insta = new Instagram();
		System.out.println("Instagram user ... !");
		insta.loginAuto();
		insta.addStory();
		insta.createReels();
		insta.logout();

		//

		System.out.println("-----------------------------");

		Whatsaap app = new Whatsaap();
		System.out.println("WhatsApp  user ... !");
		app.loginAuto();
		app.addStatus();
		app.chatting();
		app.logout();
	}

}