
package com.company;
import java.util.*;
public class SortArray
    {
        public ArrayList<String> sortingAnStringArray(String inputStringToBeSorted)
        {
            if(inputStringToBeSorted==null||inputStringToBeSorted==" ") {
                return null;
            }
            else {
                String[] myArray = inputStringToBeSorted.split(" ");
                ArrayList<String> list = new ArrayList<String>();
                for (int i = 0; i < myArray.length; i++) {
                    list.add(myArray[i]);
                }
                Collections.sort(list);
                System.out.print(list);
                return list;
            }
        }
    public static void main(String[] args) {
        String inputString = " ";
        SortArray sortArray=new SortArray();
        ArrayList<String > list=new ArrayList<String>();
        list=sortArray.sortingAnStringArray(inputString);



    }
}