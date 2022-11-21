package ProjeChallenge.LaptopStore;

import java.net.DatagramSocket;
import java.util.ArrayList;

public class PriceOneLaptop {

    public int getPrice(int laptopId) {

        Data pPrice= new Data();

        ArrayList<String> pc=new ArrayList<>();

        int totalAmount=Calculation.getSize(pc)+Calculation.getCPU(pc)+Calculation.getRam(pc)+Calculation.getColor(pc);

        return totalAmount;
    }
}
