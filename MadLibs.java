public class MadLibs {
  /*
  Your description here
  */
  	public static void main(String[] args){
      /*This program generates a mad libbed story.
             Author: Laura
             D ate: 2/19/2049*/
      String name1 = "Clarence";
      String name2 = "Staci";
      String adjective1 = "good";
      String adjective2 = "bad";
      String adjective3 = "mad";
      String noun1 = "girl";
      String noun2 = "dogs";
      String noun3 = "cats";
      String noun4 = "bird";
      String noun5 = "ice";
      String noun6 = "robot";
      String place1 = "New York city";
      String verb1 = "look up";
      int number = 2174;

      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}