/*Write a program to find out the multiple occurrences of the given word in a string using Matcher methods.
 Input : She sells seashells by the seashore
 Given word: se
 Output :
        Found at: 4 - 6
        Found at: 10 - 12
       Found at: 27 - 29
       */
package com.stackroute.pe4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
   public class MatcherFind
   {
       public static String matcher(String inputString,String inputeWordTobeCheckhed)
           {
                if(inputeWordTobeCheckhed==null||inputString==null)
                {
                    return null;
                }
                else
                    {
                    Pattern patterngGenerated = Pattern.compile(inputeWordTobeCheckhed); //using compile in regex to generate a pattern
                    Matcher mtch = patterngGenerated.matcher(inputString); //finding given input in the above generated pattern
                    String output = "";
                        while (mtch.find())
                        {
                        output = output +"Found at:" + mtch.start() + "-" + mtch.end() + "\n";

                        }
                        return output.trim();
                    }
    }
}