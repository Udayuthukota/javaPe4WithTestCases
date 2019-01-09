package com.company;

import java.sql.SQLOutput;

public class OccuranceOfString
{
    public String occuranceOfCharInString(String charecterOrg,String inputStringOrg) //checking for occurence of a char in string
    {
        if(inputStringOrg==null)
        {
            return null;
        }else {
            String charecter = charecterOrg.toLowerCase();
            String inputString = inputStringOrg.toLowerCase();
            int result = 0;
            try {
                if (charecter.length() == 1 && charecter.matches("\\w+")) {  //checking if it is character ot not
                    result = inputString.length() - inputString.replace(charecter, "").length();
                    return Integer.toString(result);
                } else {
                    return "Enter other Character";
                }
            } catch (Exception e) {
                //   System.out.println("Enter other character");
            }
            return "Enter other charecter";
        }
    }
    public static void main(String args[]){
        OccuranceOfString m = new OccuranceOfString();
    String x = m.occuranceOfCharInString("0","java java");
        System.out.println(x);
    }
}