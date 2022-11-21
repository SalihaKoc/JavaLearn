package J33_Interface.task01;

public class DikDortgen implements Sekil {


    @Override
    public int cevre(int... boyut) {
        if (boyut.length==1){ //varargs girilen parametre 1 tane ise kare cevre hesapla
            return boyut[0]*4;
        }else //varargs girilen parametre 1 tane degilde dikdortgen cevre
        return (boyut[0]+boyut[1]) * 2;
    }

    @Override
    public int alan(int... boyut) {
        if (boyut.length==1){
            return boyut[0]*boyut[0];
        }else
            return boyut[0]+boyut[1];
    }
}
