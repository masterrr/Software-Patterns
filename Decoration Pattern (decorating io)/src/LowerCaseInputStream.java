import java.io.*;

public class LowerCaseInputStream extends FilterReader {
	protected LowerCaseInputStream(Reader arg0) {
		super(arg0);
	}
	
	public int read() throws IOException {
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase((char)c));
	}
}
