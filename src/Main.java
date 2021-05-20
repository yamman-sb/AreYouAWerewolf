import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
  public static void main(String[] args){

    /**
     * イモ娘のステータスを表示する
     */
    Consumer<ArrayList<String>> showStatus = new Consumer<ArrayList<String>>() {
      @Override
      public void accept(ArrayList arrayList) {
        for (Object index : arrayList) {
          System.out.println(index);
        }
        System.out.println();
      }
    };

    ArrayList<String> kintokiStatus = new ArrayList<>(MetaImo.KINTOKI.getNameAndStatusToString());
    showStatus.accept(kintokiStatus);

    ArrayList<String> beniazumaStatus = new ArrayList<String>(MetaImo.KINTOKI.getNameAndStatusToString());
    showStatus.accept(beniazumaStatus);
  }

  // 育成するイモ娘を選択する

  // 因子を引き継ぐイモ娘を選択する

  // イモ娘の育成を行う

  // 育成したイモ娘の因子を決定する
}
