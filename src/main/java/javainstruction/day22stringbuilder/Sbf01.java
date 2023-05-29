package javainstruction.day22stringbuilder;

public class Sbf01 {
    public static void main(String[] args) {

   /*
        1-StringBuffer Java da String üreten bir Class tır.
        2-StringBuffer, StringBuilder a cok benzer, yani ikisi de "mutable" String üretir.
        3-StringBuffer, "multy-thread" dir ama StringBuilder "multy-thread" değildir.
        4-Java StringBuffer'ı, StringBuilder'dan önce oluşturdu.
        5-StringBuilder "multy-thread" olmadığı için StringBuffer'dan daha hızlı çalışır.
        6- 6)"multi-thread" yapilirken yapilan islerin siralamasi onem arzeder,
         yapilan isleri mantikli bir siraya koymak "synchronization" olarak adlandirilir.
          StringBuffer "multi-thread" oldugu icin ayni zamanda "synchronized" dir.

        3 tane String oluşturan Class öğrendik:
          1)immutable string lazimsa; String Class
          2)mutable string lazimsa; StringBuilder veya StringBuffer
                                  i)StringBuilder'i multi-thread gerekmezse kullaniriz
                                  ii)StringBuffer'i multi-thread gerekirse kullaniriz


    */

        StringBuffer sbf1 = new StringBuffer("Java");

    }
}
