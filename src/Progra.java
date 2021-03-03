import javax.swing.*;
import java.util.Scanner;

public class Progra {
    public static void main(String[] arg) {
        Scanner op = new Scanner(System.in);
        int option;
        System.out.println("1. Tamaño de cadena ");
        System.out.println("2. Subcadena ");
        System.out.println("3. Comparacion de palabras ");
        System.out.println("4. Comparacion de Tamaño ");
        System.out.println("5. Seleccionar uno");
        option = op.nextInt();
        switch (option){
            case 1:
                System.out.println("1. Tamaño de cadena");
                String cadena= "Esto me estresa";
                int longi=cadena.length();
                System.out.println("tamaño : "+longi);
                break;
            case 2:
                System.out.println("2. Subcadena");
                String chain= "pero lo estoy lograre";
                int pos = chain.indexOf("logrando");
                System.out.println("posicion :" +pos);
                String Premarital =chain.substring(0, pos);
                System.out.println("" + Premarital);
                break;

            case 3:
                System.out.println("3. Compracion de Tamaño");
                String cadena1;
                String cadena2;

                cadena1 = "logre";
                cadena2 = "logro";
                if  (cadena1.equals("logre")){
                    System.out.println("Correcto");
                } else{
                    if  (cadena1.equals("logro"))
                    System.out.println("Incorrecto");
                    break;
                }



            }


       }
   }