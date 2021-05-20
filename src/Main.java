import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
  public static void main(String[] args){

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
        1,10,
        1,  10,
        1,  0,
        1,  0,
        1,  10);
    ArrayList<String> kintokiStatus = new ArrayList<>(kintoki.getStatusToString());
    showStatus.accept(kintokiStatus);

    Imo beniazuma = new Imo("紅あずま",
        1,10,
        1,  10,
        1,  0,
        1,  0,
        1,  10);

    ArrayList<String> beniazumaStatus = new ArrayList<String>(beniazuma.getStatusToString());
    showStatus.accept(beniazumaStatus);
  }
}
