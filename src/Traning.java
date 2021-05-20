import java.util.ArrayList;

public class Traning {

  private final Imo imo;

  public Traning(Imo imo) {
    this.imo = imo;
  }

  public void start() {

    ArrayList<String> traningImoStatus = new ArrayList<>(this.imo.getNameAndStatusToString());
    Show.showStatus(traningImoStatus);
  }
}
