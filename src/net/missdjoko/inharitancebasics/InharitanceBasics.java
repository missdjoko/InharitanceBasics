package net.missdjoko.inharitancebasics;

/**
 * Created by Miss_ on 31.01.2016.
 */

class A{
    int i,j;
    void aclass(){
        System.out.println(i+", "+ j);
    }
}

class B extends A{
    int k;
    void showk(){
        System.out.println(k);
    }

    void summ(){
        System.out.println("i+j+k= " +( i + j + k));
    }
}

public class InharitanceBasics {
    public static void main(String[] args) {
        A superOb= new A();
        B subOb = new B();

        superOb.i=10;
        superOb.j=15;
        System.out.println("soderzhimoe ob'ekta superOb: ");
        superOb.aclass();

        subOb.i=2;
        subOb.j=3;
        subOb.k=25;
        System.out.println("soderzhimoe ob'ekta subOb:");
        subOb.showk();
        subOb.aclass();

        System.out.println("summa i,j,k v ob'ekte subOb ");
        subOb.summ();


    }
}

