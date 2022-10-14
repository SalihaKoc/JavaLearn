package javaForLife.CnytHcTasks;

import java.util.Arrays;

public class C02_SifirlarSaga {

    public static void main(String[] args) {

       //int[] a={0,0,1,0,3,0,12};
       //output > a={1,3,12,0,0,0,0} olacak şekilde sıfırları sağda sıfırdan büyük olanları solda olacak şekilde sıralayın

        int[] a={0,0,1,0,3,0,12};

        Arrays.sort(a);
        System.out.println("Sıralanmış = " + Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

                if (a[i] != 0) {
                    int yedek= a[j];
                    a[j]=a[i];
                    a[i]=yedek;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}