package J25_Encapsulation.task03;

public class Runner {
/*
 Bmı classfields -> name, age, weight,height: encapsulated
getBMI() method -> bmi=weight/(height*height) returb type olmalı
 getStatus() method -> bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez return type
 runner class obj ile dataları print eden code create ediniz
  */
    public static void main(String[] args) {

        BMI obj1=new BMI("saliha",30,65,1.61);
        System.out.println("BMI : "+obj1.getName()+" "+obj1.getBMI()+" "+obj1.getStatus());

    }

}

class BMI {

   private String name;
   private int age;
   private double weight;
   private double height;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public double getBMI () {

        double bmi=weight/(height*height);
        return bmi;
    }

    public String getStatus() {
        if (getBMI()<18.5) {
            return "zayıf";
        }else if (getBMI()<25) {
            return "normal";
        } else if (getBMI()<30) {
            return "kilolu";
        }else return "obez";
    }


}