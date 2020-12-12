
import static java.lang.System.err;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;

public class MyLoginIn {
	static ArrayList<User> list = new ArrayList<User>(); // Array to store User data

	public static void main(String[] args) {
		LoadUser(); // Load user data from file
		Application.launch(AccountLogin.class, args); // Run javafx Application
	}

	public static void LoadUser() {
		try {
			String path = System.getProperty("user.dir");
			File file = new File(path + "\\src\\user.txt");
			
            if(!file.exists()){
                file.createNewFile();
            }
            
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split("\\s+");
				list.add(new User(data[0], data[1]));
			}
			reader.close();
		} catch (IOException e) {
			err.println("Can not find user.txt");
			e.printStackTrace();
		}
	}
	
	// rewrite user date into the file
	public static void reLoadUser() {
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			String path = System.getProperty("user.dir");
			File file = new File(path + "\\src\\user.txt");
			fw = new FileWriter(file, false);
			bw = new BufferedWriter(fw);
	
			for (int i = 0; i < list.size(); i++) {
				bw.write(list.get(i).getUsername() + "\t" + list.get(i).getPassword());
				if(i+1 < list.size()) {
					bw.write("\n");
				}
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {
			err.println("can not rewrite");
			e.printStackTrace();
		}
	}

	public static void addUser(User user) {
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			String path = System.getProperty("user.dir");
			File file = new File(path + "\\src\\user.txt");
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			
			bw.write("\n" + user.getUsername() + "\t" + user.getPassword());
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			err.println("can not rewrite");
			e.printStackTrace();
		}
	}

	public static boolean findUser(String account, String pwd) {
		return list.contains(new User(account, pwd));
	}

	public static User findAccount(String account) {
		for (User u : list)
			if (u.getUsername().equalsIgnoreCase(account))
				return u;
		return null;
	}

	public static User newUser() {
		User user = list.get(list.size() - 1);
		return new User(Integer.parseInt(user.getUsername()) + 1 + "", "");
	}

	public static void addNewUser(User user) {
		list.add(user);
		addUser(user);
		LoadUser();
	}

	public static void changPassword(User user) {
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getUsername() == user.getUsername()) {
				list.get(i).setPassword(user.getPassword());
			}
		}
		
		
		reLoadUser();
	}
}
