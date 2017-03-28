/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.equipox.proyectoparcial2.p4;
import java.util.Scanner;
/**
 *
 * @author Aldape
 */
public class SPP2EquipoXProyectoParcial2P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        /*
        EquipoX:
            *Ana Silvia Aldape Felizardo
            *Maximiliano Turrubiates González
            *Roxana Reyes Córdova
            *Juan Pablo Castillo Luna 
        */
        
        Scanner kb= new Scanner(System.in);
        double prom =promedio();
            System.out.println("El promedio de la matriz es: "+prom);
        vMaximo();
        vMinimo();
        sumaD();
        sumaDebajo();
        sumaEncima();
    }
    public static double promedio(){
     double promedio;
     int suma=0,cont=0;
        int [][]arreglo={{1,2,3,4},
                        {8,7,6,5},
                        {9,10,11,12},
                        {16,15,14,13}};
        for (int i=0;i<arreglo.length;i++){
              for(int j=0; j<arreglo[i].length;j++){
                suma=suma+arreglo[i][j];
                cont++;
        }
    }
        promedio= suma/cont;
        return promedio; 
    }
    
    public static void vMaximo(){
        int [][]arreglo={{1,2,3,4},
                                 {8,7,6,5},
                                 {9,10,11,12},
                                 {16,15,14,13}};
        int arregloM=arreglo[0][0];
        for (int i=0;i<arreglo.length;i++){
            for(int j=0;j<arreglo[i].length;j++){
                if(arregloM<arreglo[i][j]){
                    arregloM=arreglo[i][j];
                }
            }
        }
        System.out.println("El valor mayor es: "+ arregloM);
    }
    
    public static void vMinimo(){
        int [][]arreglo={{1,2,3,4},
                                 {8,7,6,5},
                                 {9,10,5,12},
                                 {16,15,14,13}};
        int arreglom=arreglo[0][0];
        for (int i=0;i<arreglo.length;i++){
            for(int j=0;j<arreglo[i].length;j++){
                if(arreglom>arreglo[i][j]){
                    arreglom=arreglo[i][j];
                }
            }
        }
        System.out.println("El valor menor es: "+arreglom);
    }
    
    public static void sumaD(){
     int suma=0;
        int [][]arreglo={{1,2,3,4},
                                 {8,7,6,5},
                                 {9,10,11,12},
                                 {16,15,14,13}};
        for (int i=0;i<arreglo.length;i++){
            suma=suma+arreglo[i][i];
        }
        System.out.println("La suma de la diagonal es: "+suma);
    }
    
    public static void sumaDebajo(){
        int suma=0;
        int[][] arreglo={{1,2,3,4},
                                 {8,7,6,5},
                                 {9,10,11,12},
                                 {16,15,14,13}};
        for (int i=1;i<arreglo.length;i++){
            for(int j=0;j<i;j++){
                suma =suma+arreglo[i][j];
            }
        }System.out.println("La suma de los números por debajo de la diagonal es: "+suma);
    }
    
    public static void sumaEncima(){
        int suma=0;
        int[][] arreglo={{1,2,3,4},
                                 {8,7,6,5},
                                 {9,10,11,12},
                                 {16,15,14,13}};
        for(int j=0;j<arreglo.length;j++){
            for(int i=j-1;i>=0;i--){
                suma=suma+arreglo[i][j];
            }
        }
        System.out.println("La suma de los números sobre la diagonal es: "+suma);
    }
}
