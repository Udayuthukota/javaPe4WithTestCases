import com.company.OccuranceOfString;

public class FindName {

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
        if(inputString.matches(".* harry.*")) {
            return "Is Harry here ? true";
        }
        else {
            return "Harry here ? false";
        }
    }

}

    public static void main(String a[]){
        FindName m = new FindName();
        String s=m.findNameHarry("hello harry.");
        System.out.println(s);
    }
}
