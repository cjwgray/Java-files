class Language{
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

Language(String n, int ns, String rs, String wo){
  this.name = n;
  this.numSpeakers = ns;
  this.regionsSpoken = rs;
  this.wordOrder = wo;
}

public void getInfo(){
  System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + " The language follows the word order: " + wordOrder);
}
  public static void main(String[] args){

    Language english = new Language("English", 900, "half of Earth","subject-verb-object");
    english.getInfo();
    
    Mayan mayanLang = new Mayan("A mayan lang", 100);
    mayanLang.getInfo();
  }
}