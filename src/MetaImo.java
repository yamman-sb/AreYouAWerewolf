import java.util.ArrayList;
import java.util.List;


/**
 * システムの都合上、育成するイモ娘の他にイモ娘のマスターデータが必要なのでMetaImoを作成
 * csvに保存するという方法も考えたが、結局は表示methodが必要になるので今は保留
 */
public enum MetaImo {
  KINTOKI("1","金時",
      86, 0,
      91, 20,
      83, 0,
      96, 10,
      94, 0),
  BENIAZUMA("2","紅あずま",
      93,   10,
      89,   20,
      100,  0,
      89,   0,
      79,   0),;

  private final String id; // 計算しないのでString
  // イモ娘の名前
  private final String name;

  // ステータス
  private final Status sweetness;
  private final Status nutrition;
  private final Status smell;
  private final Status resistance;
  private final Status productivity;

  private MetaImo(String id, String name,
             int sweetnessScore,    int sweetnessGrowthRate,
             int nutritionScore,    int nutritionGrowthRate,
             int smellScore,        int smellGrowthRate,
             int resistanceScore,   int resistanceGrowthRate,
             int productivityScore, int productivityGrowthRate) {
    this.id           = id;
    this.name         = name;
    this.sweetness    = new Status(StatusName.SWEETNESS.toStoring(),    sweetnessScore,     sweetnessGrowthRate);
    this.nutrition    = new Status(StatusName.NUTRITION.toStoring(),    nutritionScore,     nutritionGrowthRate);
    this.smell        = new Status(StatusName.SMELL.toStoring(),        smellScore,         smellGrowthRate);
    this.resistance   = new Status(StatusName.RESISTANCE.toStoring(),   resistanceScore,    resistanceGrowthRate);
    this.productivity = new Status(StatusName.PRODUCTIVITY.toStoring(), productivityScore,  productivityGrowthRate);
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

  /**
   * イモ娘の一覧を配列で返す
   * @return
   */
  public static List<String> getIndexNames() {
    List<String> names = new ArrayList<String>();
    for (MetaImo imo : MetaImo.values()) {
      names.add(imo.toString());
    }
    return names;
  }

  public static MetaImo searchId(String searchId) {
    for (MetaImo metaImo : MetaImo.values()) {
      if (metaImo.getId().equals(searchId)) {
        return metaImo;
      }
    }
    return null;
  }
}
