import java.lang.reflect.Array;
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

    Imo kintoki = new Imo("金時",
        86,  0,
        91,  20,
        83,  0,
        96,  10,
        94,  0);
    ArrayList<String> kintokiStatus = new ArrayList<>(kintoki.getNameAndStatusToString());
    showStatus.accept(kintokiStatus);

    Imo beniazuma = new Imo("紅あずま",
        93,  10,
        89,  20,
        100,  0,
        89,  0,
        79,  0);

    ArrayList<String> beniazumaStatus = new ArrayList<String>(beniazuma.getNameAndStatusToString());
    showStatus.accept(beniazumaStatus);
  }
}
