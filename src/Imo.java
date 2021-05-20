import java.util.ArrayList;
import java.util.List;


public class Imo {
  private static int idIndex;
  private final String id; // 計算しないのでString
  // イモ娘の名前
  private final String name;

  // ステータス
  private final Status sweetness;
  private final Status nutrition;
  private final Status smell;
  private final Status resistance;
  private final Status productivity;

  /**
   * MetaImo意外にも因子がパラメータに関与するので、拡張性を高めるためにgetterを使っている
   * @param metaimo
   */
  public Imo(MetaImo metaimo) {
    this.id           = metaimo.getId() + String.valueOf(idIndex);
    this.name         = metaimo.getName();
    this.sweetness    = new Status(StatusName.SWEETNESS.toStoring(),
        metaimo.getSweetness().getSroce(),
        metaimo.getSweetness().getGrowthRate());
    this.nutrition    = new Status(StatusName.NUTRITION.toStoring(),
        metaimo.getNutrition().getSroce(),
        metaimo.getNutrition().getGrowthRate());
    this.smell        = new Status(StatusName.SMELL.toStoring(),
        metaimo.getSmell().getSroce(),
        metaimo.getSmell().getGrowthRate());
    this.resistance   = new Status(StatusName.RESISTANCE.toStoring(),
        metaimo.getResistance().getSroce(),
        metaimo.getResistance().getGrowthRate());
    this.productivity = new Status(StatusName.PRODUCTIVITY.toStoring(),
        metaimo.getProductivity().getSroce(),
        metaimo.getProductivity().getGrowthRate());

    idIndex++;
  }

  /**
   * 名前とステータスをstringの配列として返す
   * @return
   */
  public List<String> getNameAndStatusToString() {
    return List.of(name, sweetness.toString(), nutrition.toString(),
        smell.toString(), resistance.toString(), productivity.toString());
  }

  /**
   * イモ娘の名前を返す
   * @return
   */
  public String getName() {
    return this.name;
  }

  public String getId() {
    return this.id;
  }
}
