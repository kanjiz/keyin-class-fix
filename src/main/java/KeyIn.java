import java.io.*;

public class KeyIn {
  String buf = null;
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public String readString() {
    try {
      buf = br.readLine();
    } catch (IOException e) {
      System.out.println(e);
      System.exit(1);
    }
    return buf;
  }

  public String readString(String msg) {
    System.out.print(msg + ">");
    return readString();
  }
}
