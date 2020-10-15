//********************************************************************
//  Words.java       Author: Josh Dean, Stephen McGuire
//
//  Demonstrates the use of an inherited method.
//********************************************************************
package quizzes;
public class Words {

   //-----------------------------------------------------------------
   //  Instantiates a derived class and invokes its inherited and
   //  local methods.
   //-----------------------------------------------------------------
   public static void main (String[] args) {
   
      Dictionary webster = new Dictionary();

      System.out.println ("Number of pages: " + webster.getPages());

      System.out.println ("Number of definitions: " +
                          webster.getDefinitions());

      System.out.println ("Definitions per page: " +
                          webster.computeRatio());
   }
   
   
}
