//********************************************************************
//  Book.java       Author: Josh Dean, Stephen McGuire
//
//  Represents a book. Used as the parent of a derived class to
//  demonstrate inheritance.
//********************************************************************
package quizzes;
public class Book {

   protected int pages = 1500;

     //  Pages mutator.
     public void setPages (int numPages)
   {
      pages = numPages;
   }

    //  Pages accessor.
      public int getPages ()
   {
      //  Code here
       
    return pages;   
       
   }
}
