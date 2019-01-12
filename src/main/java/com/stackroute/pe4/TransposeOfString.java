/*Write a program to transpose the given string.
        Input String : a quick brown fox jumps over the lazy dog
        Output String: a  kciuq  nworb  xof  spmuj  revo  eht  yzal  god
*/
package com.stackroute.pe4;
public class TransposeOfString
{
    public static String transpose(String inputStringOrg)
    {
        if(inputStringOrg==null|| inputStringOrg.equals(" "))
        {
            return null;
        }
        else
            {
                String inputString=inputStringOrg.toLowerCase(); //converting input string to lower case
                String[] words = inputString.split(" ");
                String result = "";
                for (String eachItem : words)
                {
                    StringBuffer bufferToStoreItemValue= new StringBuffer(eachItem);
                    bufferToStoreItemValue.reverse();
                    result =result+bufferToStoreItemValue.toString() + " ";
                }
                return result.trim();
            }
    }

}