package ProjeChallenge.EmailCreation;

import java.util.Locale;
import java.util.Scanner;

public class EmailApp {
    /*
    İşe yeni başlayan arkadaşlarımızın kullanımı için arkadaşlara şirket maili ve şifresi create edilip verilmelidir.
    --> ** Bir sonraki sprintte create edilen bu mail otomatik olarak IT Manager, HR Manager, Team Lead e mail atılacaktır.
    Bunu göz önünde bulundurarak proglama yapınız.
    Nitelikler:
    firtsName: Çalışan İsmi
    lastName: Çalışan soyadı
    passWord: Çalışan şifresi
    department: Çalışılacak Departman
    email: Çalışan Email
    emailSuffix: Şirket Domaini (clarusway.com)
    mailBoxCapasity : 1000
    defaultpassWordLenght : 12
    Metotlar:
    Çalışanın adı ve soyadı alacak şekilde parametreli bir construcor create ediniz (firtsName,lastName)
    setDepartment fonks. creat ediniz. Bu fonk çalışanın departmanını setlemek için kullanılmalıdır. Şirket departmanları aşağıdaki tabloda belirtilmiştir. Çalışanın istihdam edileceği departman emailine eklenecektir.
    testautomation.
    fullstackdeveloper.
    salesforce.
    hiçbiri (Eğer çalışan yukarıda ki departmanlardan birinde istihdam edilmiyorsa mailine departman setlenmemelidir.)
    setRandomPassWord() password ün uzunluğunu alarak random bir şekilde password create edebilen bir fonk. olmalıdır.
    Kullanıcının passwordun de aşağıda belirtilmiş numeric, alphabetic ve speacil karakterler bulunabilir.
    ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi
    showInfo() çalışanın adı, soyadı, email, password unu konsolda gösterecek bir metot oluşturunuz.
     */

    String firstName;
    String lastName;
    String passWord;
    String department;
    String email;
    String emailSuffix ="clarusway.com"; //şirket domaini
    int mailBoxCapacity=1000;
    int defaultPasswordLenght=12;

    public EmailApp(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department=setDepartment();
       // System.out.println("Department = "+department);
        this.passWord=setRandomPassWord(defaultPasswordLenght);
       // System.out.println("passWord = " + passWord);

        email=firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + emailSuffix;
    }
    public String setDepartment() {

        System.out.print("Lütfen aşağıdaki departmanlardan herhangi birini seçiniz..\n"+
                         "\n1-Test Automation \n2-Full Stack Developer \n3-Salesforce \n0-Hiçbiri");
        Scanner scan=new Scanner(System.in);
        int options=scan.nextInt();
        if(options==1) {
            return "testautomation.";
        } else if (options==2) {
            return "fullstackdeveloper.";
        } else if (options==3) {
            return "salesforce.";
        }else return  "";
    }

    public String setRandomPassWord(int lenght) {

        String passWordSet="ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi";
        char[] passWord =new char[lenght];

        for (int i = 0; i < lenght; i++) {
            int random= (int) (Math.random()*passWordSet.length());
            passWord[i]=passWordSet.charAt(random);
        }
        return new String(passWord);
    }

    public String showInfo() {

        return "Ad-Soyad : "+firstName+" "+lastName+ "\n"+"Şirket Email : "+email+"\n"+"Kapasite : "+mailBoxCapacity+"\n"+"Password : "+passWord;
    }
}
