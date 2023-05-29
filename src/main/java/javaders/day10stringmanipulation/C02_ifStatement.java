package javaders.day10stringmanipulation;

import java.util.Scanner;
import java.util.Stack;

public class C02_ifStatement {
    public static void main(String[] args) {

    //Kullanıcı gün ismini girsin kod günü yazsın

    Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz\n " +
                "1 ==> Pazar 2 ==>Pazartesi  " +
                "3 ==>Sali  4==>Carsamba\n" +
                "5==> Persembe  6 ==>Cuma " +
                " 7 ==>Cumartesi");

        byte gunNo = input.nextByte();

        if(gunNo ==1){
            System.out.println("Pazar");
        }else if(gunNo==2){
            System.out.println("Pazartesi");
        }else if(gunNo==3){
            System.out.println("Sali");
        }else if(gunNo==4){
            System.out.println("Carsamba");
        } else if (gunNo == 5) {
            System.out.println("Persembe");
        }else if (gunNo==6){
            System.out.println("Cuma");
        }else if(gunNo==7){
            System.out.println("Cumartesi");
        }else{
            System.out.println("Lutfen gecerli bir rakam giriniz." +
                    "\"1 ==> Pazar " +
                    "2 ==>Pazartesi   +\n" +
                    "3 ==>Sali  4==>Carsamba\n +\n" +
                    "5==> Persembe  6 ==>Cuma  +\n" +
                    "7\" ==>Cumartesi");
        }

    }//main

}//class
