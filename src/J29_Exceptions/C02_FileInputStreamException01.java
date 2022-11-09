package J29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException01 {

    /*

   Dosya okuma/yazma işlemi bu işlemlerde hata olasılığı yüksek olduğundan hata kontrolü zorunlu tutuluyor.
   bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor. bu gibi surumlara karşılk gelen hatalara Checked Exception denir
   Özellikle IO(input output) işlemleri CHECKED EXCEPTİON dur.

  Bir kod yazilirken olasi exception'lar ongorulup
  exception olustugunda Java'nin ne yapmasini istedigimiz
  belirtilmelidir.

       1) FileNotFoundException, ustunde calisilicak bir dosyaya ulasma ile ilgili problemlerde
      kullanilir. Bir dosyaya ulasmada iki temel problem olabilir; a) Path yanlistir. b) Dosya silinmistir.

       2) IOException, input ve output ile alakali tum problemlerde kullanilir. IOException,
      FileNotFoundException'in yaptigi tum aksiyonları yapabilir dolayısıyla IOException kullanildiginda
      FileNotException'in kullanilmasina gerek yoktur. IOException FileNotFoundException
      Class'inin parent class Hz.Adem
       */
    //public static void main(String[] args) throws FileNotFoundException { //read() method öncesi child exception
    public static void main(String[] args) throws IOException { //Hz.Nuh IO islemleri en  parent class exc

        FileInputStream fis= new FileInputStream("C:\\Users\\acer\\IdeaProjects\\javaLearn\\src\\J29_Exceptions\\ebikGabı");
        //ilgili dosyaya ulasmak icin fis obj tanımlandı. parametre olarak ulasılacak dosya yolu(path) girildi
        //FileNotFoundException -> adres yanlissa kontrolu
        int k;

        while ((k=fis.read())!=-1){ //IOException -> evde yoksa kontrolu
            System.out.print((char)k); //k int ascii olan file degeri char icin casting -> type donsumu
        }
        System.out.println("sorun handle edildi devamke");
    }
}
