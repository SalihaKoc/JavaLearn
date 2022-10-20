package javaForLife.staticKeyword;

public class Clarusway1 {

   static int id=1000;
   int idKsi=0;
   public Clarusway1(){
       idKsi=++id;
   }

    public void idAta() {
        id++;
        System.out.println(id);
    }

    public static void main(String[] args) {

        Clarusway1 hardy = new Clarusway1();
        System.out.println("id = " + id);
        Clarusway1 jack = new Clarusway1();
       // hardy.idAta();
       // jack.idAta();
       //System.out.println("hardy.id = " + hardy.id); //1002
       //System.out.println("jack.id = " + jack.id); //1002

        System.out.println(id);
        System.out.println("hardy.idKsi = " + hardy.idKsi);
        System.out.println("jack.idKsi = " + jack.idKsi);

    }
}