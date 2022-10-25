package javaForLife;

final public class Student { //baska class'lar bizim class'ımızı alt class yapamasın diye

   final private String name;
   final private int id;

   public String getName() {
       return name;
   }

   public int getId() {
       return id;
   }


    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

}