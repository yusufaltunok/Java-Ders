package javainstruction.day30collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {

        // Example 1: öğrenci email adreslerini Naturel Order'da sıralanmış olarak depolayınız.

        // 1. Yol
        long t1 = System.nanoTime();
        TreeSet<String> emails = new TreeSet<>();
        emails.add("abc@gmail.com");
        emails.add("abd@gmail.com");
        emails.add("abe@gmail.com");
        emails.add("abf@gmail.com");
        emails.add("abg@gmail.com");
        emails.add("abh@gmail.com");
        emails.add("abi@gmail.com");
        emails.add("abj@gmail.com");
        emails.add("abk@gmail.com");
        emails.add("abl@gmail.com");
        System.out.println(emails);

        long t2 = System.nanoTime();

        // 2.Yol 1. yol yavaş çalışır hızlandırmak için aşağıdaki yolu kullanırız.


        HashSet<String> emailsHs = new HashSet<>();
        emailsHs.add("abc@gmail.com");
        emailsHs.add("abd@gmail.com");
        emailsHs.add("abe@gmail.com");
        emailsHs.add("abf@gmail.com");
        emailsHs.add("abg@gmail.com");
        emailsHs.add("abh@gmail.com");
        emailsHs.add("abi@gmail.com");
        emailsHs.add("abj@gmail.com");
        emailsHs.add("abk@gmail.com");
        emailsHs.add("abl@gmail.com");

        TreeSet<String> emailsHsTs = new TreeSet<>(emailsHs);
        System.out.println(emailsHsTs);

        long t3 = System.nanoTime();
        System.out.println(t2-t1); // treeSet'in calışma suresi 1865200 nano saniye 2733800
        System.out.println(t3-t2); // hashSet'in calışma suresi 101000 nano saniye 221700


    }
}
