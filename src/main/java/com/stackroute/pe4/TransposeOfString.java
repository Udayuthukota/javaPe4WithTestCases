package com.stackroute.pe4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TransposeOfString
{
    public static String transpose(String inputStringOrg)
    {
        if(inputStringOrg==null|| inputStringOrg==" ")
        {
            return null;
        }
        else
            {
                String inputString=inputStringOrg.toLowerCase();
                String[] words = inputString.split(" ");
                String result = "";
                for (String item : words)
                {
                    StringBuffer sbf = new StringBuffer(item);
                    sbf.reverse();
                    result += sbf.toString() + " ";
                }
                return result.trim();
            }
    }

}