package Arrray;

import java.util.Arrays;

public class Sumatoria_Media_y_Mediana {
    static double mediana(int[]ordenados){
        if (ordenados.length % 2 == 0){
            return (double)(ordenados[ordenados.length/2]+ordenados + ordenados[ordenados.length/2-1])/2;
        } else {
            return (double)(ordenados[ordenados.length/2]);
        }
    }

    public static void main(String[] args) {
        ///int suma =15.1+1.9///

        int [] numeros = { 88,68,94,100,83,78,84,91,77,89 };
        int [] ordenados = numeros;
        int sumatoria = 0;
        double media;
        double mmediana;

        mmediana = (double) sumatoria/ numeros.length;
        Arrays.sort(numeros);

        for (int i = 0;i<numeros.length;i++){
            sumatoria = numeros [i];
        }
        media = (double) sumatoria/numeros.length;
        mmediana=(ordenados[ordenados.length/2]+ordenados[ordenados.length/2-1])/2;


        System.out.println("Se sumaron "+numeros.length+ "Elementos");
        System.out.println("La sumatoria  es: "+ sumatoria);
        System.out.println(" Los elementos del arreglo ordenados son: "+Arrays.toString(ordenados));
        System.out.println("La media  es..."+ mmediana);
        System.out.println("La mediana  es: "+mmediana);
    }
}


