public class Imo {
  private final Status sweetness;

  public Imo(int sweetnessScore, int sweetnessGrowthRate) {
    this.sweetness = new Status("甘さ", sweetnessScore, sweetnessGrowthRate);
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
      return name;
    }

    public int getSroce() {
      return score;
    }

    public int getGrowthRate() {
      return growthRate;
    }
  }
}
