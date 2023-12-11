/*
2.
Escribe un programa en Java que valide una contraseña. La contraseña debe cumplir con
las siguientes reglas:
- Tener al menos 8 caracteres de longitud.
- Contener al menos una letra mayúscula y una letra minúscula.
- Contener al menos un número.
- Contener al menos uno de los siguientes caracteres especiales: !, @, #, S, & *
 */
package com.mycompany.retojava;

import java.util.Scanner;

/**
 *
 * @author nicos
 */
public class Punto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mayuculasABC = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
        String minusculasabc = "abcdefghijklmnopqrstuvyxz";
        String numeros = "1234567890";
        String caracteres = "!@#S&*";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una contraseña cualquiera. ");
        String contraseña = scanner.nextLine();
        int validarMayu = 0;
        int validarMinu = 0;
        int validarNume = 0;
        int validarCara = 0;

        if (contraseña.length() < 8) {
            System.out.println("la contraseña ingresada debe tener al menos 8 caracteres");
        } else if (contraseña.length() >= 8) {
            for (int i = 0; i < contraseña.length(); i++) {
                for (int j = 0; j < mayuculasABC.length(); j++) {
                    // subContraseña = contraseña.charAt(i);
                    if (contraseña.charAt(i) == mayuculasABC.charAt(j)) {
                        System.out.println(contraseña.charAt(i) + " " + mayuculasABC.charAt(j) + " AHHHHH");
                        validarMayu = 1;
                    }
                    if (contraseña.charAt(i) == minusculasabc.charAt(j)) {
                        System.out.println(contraseña.charAt(i) + " " + minusculasabc.charAt(j) + "EHHH");
                        validarMinu = 1;
                    }

                }
                for (int l = 0; l < numeros.length(); l++) {
                    char numeroComparar = numeros.charAt(l);
                    if (contraseña.charAt(i) == numeroComparar) {
                        System.out.println(contraseña.charAt(i) + " " + numeroComparar + "EHHH");
                        validarNume = 1;
                    }
                }
                for (int n = 0; n < caracteres.length(); n++) {
                    char caracterComparar = caracteres.charAt(n);
                    if (contraseña.charAt(i) == caracterComparar) {
                        System.out.println(contraseña.charAt(i) + " " + caracterComparar + "EHHH");
                        validarCara = 1;
                    }
                }

            }

        }

        if (validarMayu == 1 && validarMinu == 1 && validarNume == 1 && validarCara == 1){
            System.out.println("Contraseña valida");
        }else if (validarMayu == 0 && contraseña.length() < 8){
            System.out.println("Contraseña invalida, debe tener almenos una letra mayucula");
        }
        else if (validarMinu == 0 && contraseña.length() < 8){
            System.out.println("Contraseña invalida, debe tener al menos una letra minuscula");
        }
        else if (validarNume == 0 && contraseña.length() < 8){
            System.out.println("Contraseña invalida, debe tener al menos un numero");
        }
        else if (validarCara == 0 && contraseña.length() < 8){
            System.out.println("Contraseña invalida, debe tener al menos un caracter especial");
        }
    }

}
