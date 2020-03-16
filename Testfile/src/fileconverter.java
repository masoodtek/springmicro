import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class fileconverter {

	public String FileCon() {
		
		String body = new String();
		String mailbody =null;
		try {
			FileReader fr = new FileReader("D:\\New folder (4)\\email.text");
			BufferedReader bf = new BufferedReader(fr);
			String line = bf.readLine();
			StringBuffer sb= new StringBuffer();
			while (line != null) {
				sb.append(line);
				line = bf.readLine();
			}
			mailbody=sb.toString();
			mailbody =mailbody.replace("{name}", "masood");
			mailbody =mailbody.replace("{last}", "akhtar");
			mailbody =mailbody.replace("{email}", "alimasood@gmail.com");
			mailbody =mailbody.replace("{pazzword}", "ak47");
			bf.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return mailbody;

	}

	public static void main(String[] args) {
		fileconverter fc = new fileconverter();
		String fileCon = fc.FileCon();
		System.out.println(fileCon);
	}
}
