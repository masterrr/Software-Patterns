import java.io.*;

public class Main {
	public static void main(String[] args) {
		String str = "This is a TEST strinG.";
		InputStream stream = new ByteArrayInputStream(str.getBytes());
		try {
			Reader br = new LowerCaseInputStream(new BufferedReader(new InputStreamReader(stream)));
			int line;
			while ((line = br.read()) >= 0) {
				System.out.print((char)line);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
