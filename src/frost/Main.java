package frost;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] mass = new int[5];
        int temp = 0;
        mass[0] = 2;
        mass[1] = 1;
        mass[2] = 3;
        mass[3] = 5;
        mass[4] = 1;
       for(int j = 0; j < mass.length; j++) {
           for (int i = 0; i < mass.length; i++) {
               if ((i + 1) >= mass.length) {
                   break;
               }
               if (mass[i] > mass[i + 1]) {
                   temp = mass[i];
                   mass[i] = mass[i + 1];
                   mass[i + 1] = temp;

               }
           }
       }

       // for (int j = 0; j < 5; j++){
          //  mass[j] = mass[temp];

        //}
        System.out.println(Arrays.toString(mass));

    }
}
