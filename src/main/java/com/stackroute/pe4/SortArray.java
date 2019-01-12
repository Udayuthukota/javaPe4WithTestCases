/*
  Write a program that sets up a String variable containing a paragraph of text of your choice.
a. Extract the words from the text and sort them into alphabetical order.
 */
package com.stackroute.pe4;
import java.util.*;
public class SortArray
    {
        public ArrayList<String> sortingAnStringArray(String inputStringToBeSorted)
        {
            if(inputStringToBeSorted==null||inputStringToBeSorted==" ")
            {
                return null;
            }
            else
                {
                String[] myArray = inputStringToBeSorted.split(" "); //using regular exprestion to split string
                ArrayList<String> list = new ArrayList<String>();
                for (int i = 0; i < myArray.length; i++)
                  {
                    list.add(myArray[i]);
                  }
                  Collections.sort(list);   //sorting a list based on first character
                  return list;
               }
        }
}