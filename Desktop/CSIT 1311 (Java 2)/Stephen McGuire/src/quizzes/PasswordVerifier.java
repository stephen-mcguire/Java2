
package quizzes;

/**
 * Description of program here
 * @author Stephen McGuire && Christian Grabeel
 */
public class PasswordVerifier {

// Constant for minimum password length
   public static final int MIN_PASSWORD_LENGTH = 8;
   
   PasswordVerifier test1 = new PasswordVerifier();
   String str = new String();
   
   
   
   /**
        isValid method
    */
   public static boolean isValid(String str) {
      boolean status = false; // Validity status
      
      if (PasswordVerifier.hasDigit(str) && PasswordVerifier.hasLowerCase(str) 
              && PasswordVerifier.hasUpperCase(str) && str.length() >= MIN_PASSWORD_LENGTH)
      {
          status = true;
      }
      
      
      
      //if ()
    //Check to see if password is valid(contains one digit, one lowercase, one uppercase
    // may use if statement
      return status;
   }

   /**
        hasUpperCase method
    */
   private static boolean hasUpperCase(String str)
   {
      boolean status = false; // Validity status

   // check to see if password contains at least one uppercase
   // may use a loop to check each character
   
   for (int i = 0; i < str.length(); i++) {
       
       if (Character.isUpperCase(str.charAt(i))) {
           
           status = true;
           
       }
       
    }
   return status;
   }
   /**
        hasLowerCase method
    */
   private static boolean hasLowerCase(String str)
   {
      boolean status = false; // Validity status

     //check to see if password contains at least one lowercase
    //may use a loop to check each character 
    
    for (int i = 0; i < str.length(); i++) {
       
       if (Character.isLowerCase(str.charAt(i))) {
           
           status = true;
        }   
     
    }
    return status;
   }
   /**
        hasDigit method
    */
   private static boolean hasDigit(String str)
   {
      boolean status = false; // Validity status

    //check to see if password contains at least one digit
   //may use a loop to check each character 
   
   for (int i = 0; i < str.length(); i++) {
       
       if (Character.isDigit(str.charAt(i))) {
           
           
           
           status = true;
        }   
     
    }
   
      return status;
   }

}



