package com.stackroute.pe4;

public class  Replacingchar {
    public String replaceChar(String inputStringOrg){
        if(inputStringOrg==null|| inputStringOrg.equals(" "))
        {
            return null;
        }
        else
            {

            String inputString = inputStringOrg.toLowerCase();
            inputString = inputString.replace("d", "f"); //replacing character
            inputString = inputString.replace("i", "t");
            return inputString;
            }
    }

}