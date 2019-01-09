package com.company;

public class  Replacingchar {
    public String replaceChar(String inputStringOrg){
        if(inputStringOrg==null|| inputStringOrg.equals(" "))
        {
            return null;
        }
        else {

            String inputString = inputStringOrg.toLowerCase();
            inputString = inputString.replace("d", "f");
            inputString = inputString.replace("i", "t");
            return inputString;
        }
    }
    public static void main(String a[]){
        Replacingchar m = new Replacingchar();
        String x = m.replaceChar("uday");
        System.out.println(x);
    }
}