import static com.google.common.truth.Truth.assertThat;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * {@link KeyIn}クラスのテストを行います。
 * 
 * <p>
 * このクラスは、{@link KeyIn}クラスの各メソッドが正しく動作するかをテストします。
 * </p>
 */
@DisplayName("KeyInクラスのテスト")
class KeyInTest {
  private final InputStream originalSystemIn = System.in;
  private final String testStringToInput = "テスト文字列です。\n";
  private ByteArrayInputStream testIn;

  @BeforeEach
  public void setUp() {
    testIn = new ByteArrayInputStream(testStringToInput.getBytes());
    System.setIn(testIn);
  }

  @AfterEach
  public void tearDown() {
    System.setIn(originalSystemIn);
  }

  /**
   * {@link KeyIn#readString()}メソッドが、標準入力から文字列を読み込むことをテストします。
   * 
   * <p>
   * このテストでは、標準入力に「テスト文字列です。」という文字列を入力しています。
   * </p>
   */
  @DisplayName("readString()メソッドは、標準入力から文字列を読み込む")
  @Test
  void testReadString() {
    KeyIn keyIn = new KeyIn();
    String result = keyIn.readString();
    assertThat(result).isEqualTo("テスト文字列です。");
  }

  /**
   * {@link KeyIn#readString(String)}メソッドが、プロンプトメッセージを表示して、標準入力から文字列を読み込むことをテストします。
   * 
   * <p>
   * このテストでは、標準入力に「テスト文字列です。」という文字列を入力しています。
   * </p>
   */
  @DisplayName("readString(String)メソッドは、プロンプトメッセージを表示して、標準入力から文字列を読み込む")
  @Test
  void testReadStringWithPrompt() {
    KeyIn keyIn = new KeyIn();
    String result = keyIn.readString("文字列を入力してください");
    assertThat(result).isEqualTo("テスト文字列です。");
  }
}
