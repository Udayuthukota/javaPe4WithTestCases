package com.stackroute.pe4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherFind
{
    public static String matcher(String inputString,String inputeWordTobeCheckhed)
    {
        if(inputeWordTobeCheckhed==null||inputString==null)
        {
            return null;
        } else {
            Pattern ptr = Pattern.compile(inputeWordTobeCheckhed);
            Matcher mtch = ptr.matcher(inputString);
            String output = "";
            while (mtch.find())
            {
                output = output + "Found at:" + mtch.start() + "-" + mtch.end() + "\n";

            }
            return output.trim();
        }
    }
}