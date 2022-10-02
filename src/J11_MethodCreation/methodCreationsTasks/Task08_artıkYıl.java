package J11_MethodCreation.methodCreationsTasks;

import java.util.Scanner;

public class Task08_artıkYıl {

    public static void main(String[] args) {

    /* Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner scan = new Scanner(System.in);
        System.out.print("yıl giriniz : ");
        int yil = scan.nextInt();
        System.out.print(artikYil(yil));

    }
    public static boolean artikYil(int a){

        String yil= String.valueOf(a);
boolean flag = false;
        if (yil.endsWith("00")) {

            if (a%400==0) {
                flag =true;
            }
        } else {
            if (a%4==0){
                flag =true;
            }

            }
        return flag;
        }


    }
