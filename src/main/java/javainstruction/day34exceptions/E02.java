package javainstruction.day34exceptions;

public class E02 {
    public static void main(String[] args) {

        String a[] ={"A","V","A","J"};

        System.out.println(getElement(a,3));//A
        System.out.println(getElement(a,1));//A
        System.out.println(getElement(a,4));//J
        System.out.println(getElement(a,2));//V

        System.out.println(getElement(a,6));//ArrayIndexOutOfBoundsException Index 5 out of bounds for length 4
                                                        // Array de olmayan index hatası index 5, 4 elemanlı bir yerde olmaz
    }

    // Bir String array'den istenilen bir elemanı sırası ile alan method olusturunuz.

    public static String getElement (String [] a,int numOfElement) {

        String result ="";
        try{
           result = a[numOfElement-1];

        }catch (ArrayIndexOutOfBoundsException e){//ArrayIndexOutOfBoundsException array işlemlerinde olmayan index kullanıldığında atılır
            if(numOfElement-1<0){
                return a[0];
            }else {
                result =a[a.length-1];
            }

        }
            return result;
        // varolmayan buyuk bir index girildiğinde oluşacak hatayı giderdik ve son index i aldık.
        // varolmayan kucuk bir index girildiğinde oluşacak hatayı giderdik ve ilk index i aldık.
    }


}
