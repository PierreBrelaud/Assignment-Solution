package ie.lyit.hotel;

import java.util.ArrayList;

import ie.lyit.serialize.CustomerSerializer;

public class EmailRepository implements Container{

		public String emails[] = {"email1@gmail.com" , "email2@gmail.com" ,"email3@gmail.com" , "email4@gmail.com"};

		
	   @Override
	   public Iterator getIterator() {
	      return new NameIterator();
	   }

	   private class NameIterator implements Iterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < emails.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return emails[index++];
	         }
	         return null;
	      }		
	   }

}
