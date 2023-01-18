package com.openbootcamp;

public class JavaEjer2 {
    public static void main(String[] args){

        System.out.println("Precio sin IVA" + "=" + Precio());
        System.out.println("Precio con IVA" +  "=" + PrecioFinal());

    }

    static int Precio(){

        return 33;

    }
    static double PrecioIVA(){

        return 0.21;
    }

    static double PrecioFinal(){

        return Precio() * PrecioIVA() + Precio();
    }

}
