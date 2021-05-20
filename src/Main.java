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


    // 育成するイモ娘を選択する
    Show.speackKazusa("育成するイモ娘を選択してください");

    ArrayList<String> kintokiStatus = new ArrayList<>(MetaImo.KINTOKI.getNameAndStatusToString());
    Show.showStatus(kintokiStatus);

    ArrayList<String> beniazumaStatus = new ArrayList<String>(MetaImo.KINTOKI.getNameAndStatusToString());
    Show.showStatus(beniazumaStatus);

    Show.showIndexMetaimo();
    MetaImo traningMetaImo = null;
    while (traningMetaImo == null){
      String  selectedId = scanner.nextLine();
      traningMetaImo = MetaImo.searchId(selectedId);
    }

    Show.speackKazusa(traningMetaImo.getName()+ "が選ばれました");

    // 因子を引き継ぐイモ娘を選択する

    // イモ娘の育成を行う
    Imo traningImo = new Imo(traningMetaImo);
    Growing traning = new Growing(traningImo);
    traning.start();

    // 育成したイモ娘の因子を決定する
  }
}
