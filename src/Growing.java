import java.util.ArrayList;

public class Growing {

  private final Imo imo;

  public Growing(Imo imo) {
    this.imo = imo;
  }

  public void start() {
    System.out.println("---- 育成開始！ ----");

    ArrayList<String> traningImoStatus = new ArrayList<>(this.imo.getNameAndStatusToString());
    Show.showStatus(traningImoStatus);

    // 育成メニューを選択する
    //
  }
}
