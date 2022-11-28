package InterviewChallenge.extra;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q08_ReadFileText {

        /*
 1)Create a text file inside this package
 2)Type the following text inside the text file
    Java is easy to learn.
    Learn Java, earn money?
    Java is easy if you study well.
    To learn Java, type codes.
 3)Type code to print every word is used how many times in the text.
        */

    public static void main(String[] args) throws IOException {

        Map<String,Integer> wordCounter=new HashMap<>();
        List<String> lines= Files.readAllLines(Paths.get("src/InterviewChallenge/extra/Q08_FileText"));

        for (String w:lines) {
            String [] words=w.split(" "); //her kelimeyi ayırır
            for (String m:words) {
                if (m.endsWith(",") || m.endsWith(".") || m.endsWith("?")) {

                    m=m.substring(0,m.length()-1);
                }
                if (!wordCounter.containsKey(m)) { //önceden bakılan kelime yoksa o kelime sayısına 1 de
                    wordCounter.put(m,1);
                }else {
                    wordCounter.put(m,wordCounter.get(m)+1); //onceden saydigimiz bir kelime varsa sayisini 1 artir
                }
            }
        }
        System.out.println(wordCounter);
    }
}
