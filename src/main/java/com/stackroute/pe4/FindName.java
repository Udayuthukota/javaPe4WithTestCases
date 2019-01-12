package com.stackroute.pe4;
public class FindName
{
        public String findNameHarry(String inputStringOrg)
        {

            if(inputStringOrg==null|| inputStringOrg==" ")
            {
            return null;
            }
            else
                {
                    String inputString=inputStringOrg.toLowerCase();
                    System.out.println(inputString);
                    if(inputString.matches(".* harry.*"))
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
