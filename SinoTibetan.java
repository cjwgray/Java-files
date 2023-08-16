class SinoTibetan extends Language{

  SinoTibetan(String name, int speakers){
    super(name, speakers, "Asia","verb-object-subject");
    if(name.contains("Chinese")){
      wordOrder = "subject-verb-object";
    }
  }

}