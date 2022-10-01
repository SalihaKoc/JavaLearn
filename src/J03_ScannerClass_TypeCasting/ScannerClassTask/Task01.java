package J03_ScannerClass_TypeCasting.ScannerClassTask;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */
        Scanner not = new Scanner(System.in);
        System.out.print("Vize notonu giriniz : ");
        int vize= not.nextInt();
        System.out.print("Final notonu giriniz : ");
        int finall= not.nextInt();
        System.out.print("Proje notonu giriniz : ");
        int proje= not.nextInt();
        String notu= not.nextLine();
        System.out.println("Notunuz : " + ((vize*0.3)+(finall*0.5)+(proje*0.2)));
    }
}