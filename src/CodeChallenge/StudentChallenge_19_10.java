package CodeChallenge;

public class StudentChallenge_19_10 {

    public static void main(String[] args) {

        //Verilen String değerinin  içerdiği karakter sayılarını yazdıran code create edin

        String str = "gfdsuıpg43 y+%%h&ks +&djljscs#şsd£ +45#3346";

        //logic
        //1. aşama verilen bütün karakterleri gezeceğim için for loopa ihtiyacım.
        //2. karakter sayısını almak için bizlere değeri 0 olan bir int değer girmem lazım.
        //3. str ifadesindeki her karakterden sadece 1 adet içeren bir String gerekiyor. (benzersizStr)

        String benzersizStr = "";

        for (int i = 0; i < str.length(); i++) {

           if (!benzersizStr.contains("" + str.charAt(i))) {
               benzersizStr += "" + str.charAt(i);

           }
            //Ternary ile ->> benzersizStr+= (!benzersizStr.contains(""+str.charAt(i)) ? ""+str.charAt(i) : "");
    }
            System.out.println(benzersizStr); // gfdsuıp43 y+%h&kjlc#ş£5

            for (int j = 0; j < benzersizStr.length(); j++) {
                int sayac=0;
                for (int k = 0; k < str.length(); k++) {
                    if (benzersizStr.charAt(j)==str.charAt(k)) {
                        sayac++;
                    }
                }
                System.out.println("Karakter -> " + benzersizStr.charAt(j) + " = " + sayac);
            }
        }
    }
