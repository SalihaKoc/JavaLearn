package J18_Constructor;

public class C08_MyConstructor {

        int x=3;
        int y=5;

        public C08_MyConstructor() {
            x+=1; //ins variable +1 update edildi
            System.out.println("-x"+x);
        }

        public C08_MyConstructor(int i ){
            this(); //p'siz cons call edildi
            this.y = i; //conc. parametresi i değeri inst. variable y'ye atandı
            x+=y; //inst. y değeri inst. x değerine atandı
            System.out.println("-x"+x);

        }

        public C08_MyConstructor(int i, int i2) {
            this(3); //int p'li cons.  parametre 3 atanarak call edildi
            this.x -= 4; //inst. x variable -4  uodate edildi
            System.out.println("-x"+x);
        }

        public static void main(String[] args) {
            C08_MyConstructor mc1= new C08_MyConstructor(4,3); //2 int parametre 4 ve 3 atanarak cons. call edildi
        }
    }

