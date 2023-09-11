package Mobile.Mb01;

import java.util.Random;

public class Abc
{
   public static String main(String[] args) throws Exception
   {
	    String alphabet = "abcdefghijklmnopqrstuvwxyz";
	    StringBuilder sb = new StringBuilder();
	    Random random = new Random();
	    int length = 7;
	    for(int i = 0; i < length; i++) {
	      int index = random.nextInt(alphabet.length());
	      char randomChar = alphabet.charAt(index);
	      sb.append(randomChar);
	    }
	    String randomString = sb.toString();
	    return randomString;
	  }
   }

