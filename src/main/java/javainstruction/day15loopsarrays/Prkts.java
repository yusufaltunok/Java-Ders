package javainstruction.day15loopsarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Prkts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

/*
        char initials []=new char[3];

        initials[0]= 'a';
        initials[1]= 'k';
        initials[2]= 'v';


        int carpim = 1;

        for (int w : initials) {
            carpim = carpim * w;
        }
        System.out.println(carpim);

        //Example 3: Size verilen bir String array deki isimleri alfabetik sıraya koyduktan sonra
        // "F" ile başlayan isimlerden önceki isimleri console'a yazdırınız

        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";


        Arrays.sort(stdNames);

        for (String w : stdNames) {

            if (w.startsWith("F")) {
                continue;

            } else {
                System.out.println(w);
            }
        }
*/
        System.out.println("Please enter row number");
        int row = input.nextInt();

        for (int m=1; m<=row ; m++){
            for (int n=1; n<=m; n++){
                System.out.print(n + " ");
            }
            System.out.println();
        }

    }
}
