import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 標準入力から文字列を読み込むクラスです。
 * 
 * <p>
 * このクラスは、標準入力から文字列を読み込むためのメソッドを提供します。
 * </p>
 */
public class KeyIn {
  String buf = null;
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  /**
   * 標準入力から文字列を読み込みます。
   * 
   * @return 標準入力から読み込んだ文字列
   */
  public String readString() {
    try {
      buf = br.readLine();
    } catch (IOException e) {
      System.out.println(e);
      System.exit(1);
    }
    return buf;
  }

  /**
   * プロンプトメッセージを表示して、標準入力から文字列を読み込みます。
   * 
   * @param msg プロンプトメッセージ
   * @return 標準入力から読み込んだ文字列
   */
  public String readString(String msg) {
    System.out.print(msg + ">");
    return readString();
  }
}
