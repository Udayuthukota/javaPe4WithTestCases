/*Write a program with the implementation of Regular Expression to find the presence of the name Harry in a string.
 Input: This is Harry.
 Output: Is Harry here ? true
 Input : This is Henry.
 Output: Is Harry here ? false
*/
package com.stackroute.pe4;
public class FindName
{
        public String findNameHarry(String inputStringOrg)
        {
            if(inputStringOrg==null|| inputStringOrg.equals(" "))
            {
            return null;
            }
            else
                {
                    String inputString=inputStringOrg.toLowerCase();   //conevrting string to lower case
                    if(inputString.matches(".* harry.*"))     //finding harry word using regex
                    {
                        return "Is Harry here ? true";
                    }
                    else
                        {
                        return "Harry here ? false";
                        }
                 }

       }
}
