public enum StatusName {
  SWEETNESS("甘さ"),
  NUTRITION("栄養"),
  SMELL("匂い"),
  RESISTANCE("耐性"),
  PRODUCTIVITY("生産性");

  private final String name;

  private StatusName(String name){
    this.name = name;
  }

  public String toStoring() {
    return this.name;
  }
}
