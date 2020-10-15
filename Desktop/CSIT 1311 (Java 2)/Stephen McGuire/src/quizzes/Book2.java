//********************************************************************
//  Book2.java       Author: Josh Dean, Stephen McGuire
//
//  Represents a book. Used as the parent of a derived class to
//  demonstrate inheritance and the use of the super reference.
//********************************************************************
package quizzes;
public class Book2
{
   protected int pages;
   //----------------------------------------------------------------
   //  Constructor: Sets up the book with the specified number of
   //  pages.
   //----------------------------------------------------------------

    public Book2() {
    }
   
   
   public Book2 (int numPages)
   {
    //set up constructor code here
       
   }
   //----------------------------------------------------------------
   //  Pages mutator.
   //----------------------------------------------------------------
   public void setPages (int numPages)
   {
      pages = numPages;
   }

   //----------------------------------------------------------------
   //  Pages accessor.
   //----------------------------------------------------------------
   public int getPages ()
   {
      return pages;
   }
}
