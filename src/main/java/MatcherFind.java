import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherFind {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        System.out.println(matcher(str1,str2));
    }
    public static String matcher(String inputString,String inputeWordTobeCheckhed){
        if(inputeWordTobeCheckhed==null||inputString==null)
        {
            return null;
        } else {
            Pattern ptr = Pattern.compile(inputeWordTobeCheckhed);
            Matcher mtch = ptr.matcher(inputString);
            String str = "";
            while (mtch.find()) {
                str = str + "Found at:" + mtch.start() + "-" + mtch.end() + "\n";

            }
            return str.trim();
        }
    }
}