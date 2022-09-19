import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User implements Serializable {
	private String num;
	private String name;
	private String pn;
	private String email;

	public User(String num, String name, String pn, String email) {
		super();
		this.num = num;
		this.name = name;
		this.pn = pn;
		this.email = email;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPN() {
		return pn;
	}

	public void setPN(int pN) {
		pn = pn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "전화번호는" + pn;
	}

}

public class PhoneNum2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		ObjectOutputStream oos = null;
		List<User> list = new ArrayList<>();
		User u;
		try {
			do {
				oos = new ObjectOutputStream(new FileOutputStream("d:\\filetest\\User.txt"));

				System.out.println("번호뭐예요?");
				String num = input.nextLine();
				System.out.println("이름이뭐예요?");
				String name = input.nextLine();
				System.out.println("전화번호뭐예요?");
				String pn = input.nextLine();
				System.out.println("이메일이뭐예요?");
				String email = input.nextLine();
				System.out.println("더 추가? 1.예 2.아뇨");
				n = input.nextInt();
				input.nextLine();

				oos.writeObject(new User(num, name, pn, email));
				u = new User(num, name, pn, email);
				list.add(u);

				oos.flush();
			} while (n == 1);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("몇번???");
		int n2 = input.nextInt();
		User kk = null;

		for (int i = 0; i < list.size(); i++) {
			if (String.valueOf(n2).equals(list.get(i).getNum())) {
				kk = list.get(i);
				break;
			}
		}
		if (kk != null) {
			ObjectInputStream ois = null;

			try {
				ois = new ObjectInputStream(new FileInputStream("d:\\filetest\\User.txt"));

				u = (User) ois.readObject();
				System.out.println(u);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				if (ois != null) {
					try {
						ois.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		} else {
			System.out.println("없는 사람");
		}
	}
}
