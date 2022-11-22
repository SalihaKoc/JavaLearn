package ProjeChallenge.ClaruswayStore;

import java.util.ArrayList;
import java.util.List;

public class Brand {

   private int id;

   private String name;

   private static List<Brand> brandList=new ArrayList<>();

   static {
       createBrands();
   }
    public Brand(int brandId, String brandName) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void createBrands() {

        //olusturulmus oldugumuz liste ekleme yapıldı
        //Brand objesi olmalıydı -> new Brand(1,"Cv");

        brandList.add(new Brand(1, "Samsung"));
        brandList.add(new Brand(2, "Lenova"));
        brandList.add(new Brand(3, "Apple"));
        brandList.add(new Brand(4, "Huawei"));
        brandList.add(new Brand(5, "HP"));
        brandList.add(new Brand(6, "Asus"));
        brandList.add(new Brand(7, "LG"));
        brandList.add(new Brand(8, "Monster"));
        brandList.add(new Brand(9, "Casper"));
    }

    public static void printBrand() {

        System.out.println("... Marka Listesi ...");
        //En temelde yapmak istedigim sey System.out.println(BrandName);

        for (Brand brand : brandList) {
          System.out.println(brand.getId() + " " + brand.getName());
        }
        System.out.println("---------------------------------");
    }

    public static Brand getBrand(int id) {

        for (Brand b : brandList) {
            if (id==b.getId()) {
                return b;
            }
        }
        return null;
    }

}
