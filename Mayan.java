class Mayan extends Language{

  Mayan(String name, int speakers){
    super(name, speakers, "Central America","verb-object-subject");
  }

  @Override
  public void getInfo(){
  System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + " The language follows the word order: " + wordOrder);
  System.out.println("Fun fact: Ki'che' is an ergative Language.");
}
}