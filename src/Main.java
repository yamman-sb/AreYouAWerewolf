import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    /**
     * イモ娘のステータスを表示する
     */
    Consumer<ArrayList<String>> showStatus = (imoStatusArray) -> {
      for (Object imoStatus : imoStatusArray) {
        System.out.println(imoStatus);
      }
      System.out.println();};

    /**
     * メタイモ娘の一覧を返す
     */
    Runnable showIndexMetaimo = () -> {for (MetaImo metaImo : MetaImo.values()) {
      System.out.printf("%s:%s\n", metaImo.getId(), metaImo.getName()); }};

    /**
     * かずささんが話す
     */
    Consumer<String> speackKazusa = (text) -> {
      System.out.printf("かずさ「%s」\n", text);
    };


    // 育成するイモ娘を選択する
    speackKazusa.accept("育成するイモ娘を選択してください");

    ArrayList<String> kintokiStatus = new ArrayList<>(MetaImo.KINTOKI.getNameAndStatusToString());
    showStatus.accept(kintokiStatus);

    ArrayList<String> beniazumaStatus = new ArrayList<String>(MetaImo.KINTOKI.getNameAndStatusToString());
    showStatus.accept(beniazumaStatus);

    showIndexMetaimo.run();
    String  selectedId = scanner.nextLine();
    MetaImo traningMetaImo = MetaImo.searchId(selectedId);
    speackKazusa.accept(traningMetaImo.getName()+ "が選ばれました");



    // 因子を引き継ぐイモ娘を選択する

    // イモ娘の育成を行う


    // 育成したイモ娘の因子を決定する
  }
}
