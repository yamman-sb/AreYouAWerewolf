import java.util.List;

public class Imo {

  // イモ娘の名前
  private final String name;

  // ステータス
  private final Status sweetness;
  private final Status nutrition;
  private final Status smell;
  private final Status resistance;
  private final Status productivity;


  public Imo(String name,
             int sweetnessScore,    int sweetnessGrowthRate,
             int nutritionScore,    int nutritionGrowthRate,
             int smellScore,        int smellGrowthRate,
             int resistanceScore,   int resistanceGrowthRate,
             int productivityScore, int productivityGrowthRate) {
    this.name         = name;
    this.sweetness    = new Status("甘さ",  sweetnessScore,     sweetnessGrowthRate);
    this.nutrition    = new Status("栄養",  nutritionScore,     nutritionGrowthRate);
    this.smell        = new Status("匂い",  smellScore,         smellGrowthRate);
    this.resistance   = new Status("耐性",  resistanceScore,    resistanceGrowthRate);
    this.productivity = new Status("生産性", productivityScore,  productivityGrowthRate);
  }

  /**
   * 名前とステータスをstringの配列として返す
   * @return
   */
  public List<String> getNameAndStatusToString() {
    return List.of(name, sweetness.toString(), nutrition.toString(),
        smell.toString(), resistance.toString(), productivity.toString());
  }

  public class Status {
    private final String  name;       // 表示名
    private final int     score;      // 能力値
    private final int     growthRate; // 成長率(%だが正確性を保ちたいのでintで保存する)

    public Status(String name, int score, int growthRate) {
      this.name       = name;
      this.score      = score;
      this.growthRate = growthRate;
    }

    public String toString() {
      return name + " : " + score;
    }

    public int getSroce() {
      return score;
    }

    public int getGrowthRate() {
      return growthRate;
    }
  }
}
