package lesson3Example;

public class UserManager {
		public void add(User user) {
			System.out.println(user.name+ " eklendi.");
		}
		public void addMultiple(User[] users) {
			for (User user : users) {
				add(user);
			}
		}
	
}
