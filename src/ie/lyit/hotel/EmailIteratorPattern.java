package ie.lyit.hotel;

import java.util.ArrayList;

public class EmailIteratorPattern {

   public static void main(String[] args) {
      EmailRepository emailsRepository = new EmailRepository();

      int i = 1;
      for(Iterator iter = emailsRepository.getIterator(); iter.hasNext();){
         String email = (String)iter.next();
         System.out.println("Email " + i + " : " + email);
         i++;
      } 	
   }
}
