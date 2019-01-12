package com.stackroute.pe4;
public class OccuranceOfChar
{
    public String occuranceOfCharInString(String charecterOrg,String inputStringOrg) //checking for occurence of a char in string
    {
        if(inputStringOrg==null)
        {
            return null;
        }
        else
            {
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
                }
                catch (Exception e) {
                    throw e;
                    //   System.out.println("Enter other character");
                }
        }
    }

}