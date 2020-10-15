//********************************************************************
//  Dictionary2.java       Author: Josh Dean, Stephen McGuire
//
//  Represents a dictionary, which is a book. Used to demonstrate
//  the use of the super reference.
//********************************************************************
package quizzes;
public class Dictionary2 extends Book2
{
   private int definitions;
   private int pages;
   //-----------------------------------------------------------------
   //  Constructor: Sets up the dictionary with the specified number
   //  of pages and definitions.
   //-----------------------------------------------------------------

    public Dictionary2(int numPages) {
        super(numPages);
    }
   
   public Dictionary2 (int numPages, int numDefinitions)
   {
      // Code in here
       pages = numPages; 
      definitions = numDefinitions;
   }
   //-----------------------------------------------------------------
   //  Prints a message using both local and inherited values.
   //-----------------------------------------------------------------
   public double computeRatio ()
   {
      return definitions/pages;
   }

   //----------------------------------------------------------------
   //  Definitions mutator.
   //----------------------------------------------------------------
   public void setDefinitions (int numDefinitions)
   {
      definitions = numDefinitions;
   }
   //----------------------------------------------------------------
   //  Definitions accessor.
   //----------------------------------------------------------------
   public int getDefinitions ()
   {
      return definitions;
   }

    public int getPages() {
        return pages;
    }
   
   
}
