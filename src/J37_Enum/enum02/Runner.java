package J37_Enum.enum02;

public class Runner {

    public static void main(String[] args) {

        User kullanici1=new User();
        kullanici1.name="Ebubekir Bey";

      //  kullanici1.role=0;
      //  kullanici1.status=2;

        kullanici1.yetki=Role.ADMIN;
        kullanici1.durum=Status.INACTIVE;

        User kullanici2=new User();
        kullanici2.name="Fatih Bey";
        kullanici2.yetki=Role.CUSTOMER;
        kullanici2.durum=Status.LOGIN;

        if (kullanici1.yetki==Role.ADMIN) {
            System.out.println("Agam mühür sende Süleyman da sensin sil de silelim..");
        }else System.out.println("Admin değil hava 1500, sefil customer..");

        if (kullanici2.yetki==Role.ADMIN) {
            System.out.println("Agam mühür sende Süleyman da sensin sil de silelim..");
        }else System.out.println("Admin değil hava 1500, sefil customer..");

    }

}
