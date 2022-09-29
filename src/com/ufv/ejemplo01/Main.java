package com.ufv.ejemplo01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        p.setNombre( sc.nextLine() );
        System.out.println("Escribe tus apellidos: ");
        p.setApellidos( sc.nextLine() );
        System.out.println("Escribe tu dni sin letra: ");
        p.setDnisinletra(sc.nextInt() );
        System.out.println("Escribe tu edad: ");
        p.setEdad(sc.nextInt() );

        System.out.print("Buenos días: " + p.getNombre());
        System.out.print(" " + p.getApellidos() + " con dni: " + p.getDnisinletra());
        System.out.print(" y edad: " + p.getEdad() );
    }
}
