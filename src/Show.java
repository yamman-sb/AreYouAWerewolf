import java.util.ArrayList;
import java.util.function.Consumer;

public class Show {
  /**
   * イモ娘のステータスを表示する
   */
  public static void showStatus(ArrayList<String> imoStatusArray) {
    for (Object imoStatus : imoStatusArray) {
      System.out.println(imoStatus);
    }
    System.out.println();
  }
  /**
   * メタイモ娘の一覧を返す
   */
  public static void showIndexMetaimo() {
    for (MetaImo metaImo : MetaImo.values()) {
      System.out.printf("%s:%s\n", metaImo.getId(), metaImo.getName());
    }
  }

  /**
   * かずささんが話す
   */
  public static void  speackKazusa(String text) {
    System.out.printf("かずさ「%s」\n", text);

  }
}
