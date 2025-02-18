/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Scanner;

/**
 *
 * @author Etien & Ivan
 */
public class Metodos {
    
    public static String[] peticiones = new String[100]; 

    //Funcion login, devuelve 0 si contraseña o user sonn incorrectos
    //Devuelve 1 si accedes como usuario normal
    //Devuelve 2 si accedemos como administrador.
    public static int login() {
        int rol = 0;
        Scanner sc = new Scanner(System.in);
        String usuario_administrador = "lucia@";
        String contraseña_administrador = "holaque123";
        String usuarioInicial = "adrian3";
        String contraseñaInicial = "adios456";

        System.out.print("Nombre de usuario: ");
        String usuario = sc.nextLine();
        if (usuario.equals(usuario_administrador)) {
            System.out.print("password: ");
            String password = sc.nextLine();
            if (password.equals(contraseña_administrador)) {
                rol = 2;
            }
        } else if (usuario.equals(usuarioInicial)) {
            System.out.print("password: ");
            String password = sc.nextLine();
            if (password.equals(contraseñaInicial)) {
                rol = 1;
            }
        }
        return rol;
    }
    
    

    public static int menuAdministrador() {
        int opcion;
        do {
            System.out.println();
            System.out.println("1. Ver todas las peticiones");
            System.out.println("2. Eliminar todas las peticiones");
            System.out.println("3. Ver una petición");
            System.out.println("4. Eliminar una peticion");
            System.out.println("5. Contestar una petición");
            System.out.print("Introduce una opcion: ");
            Scanner teclado = new Scanner(System.in);
            opcion = teclado.nextInt();
            teclado.nextLine();
            if(opcion > 5 || opcion < 1){
                System.out.println("Opcion no encontrada.");
            }
        } while (opcion > 5 || opcion < 1);
        return opcion;

    }
    
    public static int menuUsuario() {
        int opcion;
        do {
            System.out.println();
            System.out.println("1. Pedir una petición");
            System.out.println("2. Ver mis peticiones");
            System.out.print("Introduce una opcion: ");
            Scanner teclado = new Scanner(System.in);
            opcion = teclado.nextInt();
            teclado.nextLine();
            if(opcion > 2 || opcion < 1){
                System.out.println("Opcion no encontrada.");
            }
        } while (opcion > 2 || opcion < 1);
        return opcion;

    }
    
    public static boolean escribirPeticion (){
        boolean correcto = false; 
        Scanner teclado = new Scanner (System.in);
        String pet;
        pet = teclado.nextLine();
        
        for(int i = 0; i<peticiones.length; i++){
            if(peticiones[i] == null){
                peticiones[i] = pet; 
                correcto = true; 
            }
        }
        return correcto; 
    }
    
    public static void imprimirPeticiones(){
        int contador = 1;
        for (int i = 0; i<peticiones.length;i++){
            if(peticiones[i] != null){
                System.out.println(contador + ". " + peticiones[i]);
                contador++; 
            }
        }
        if(contador == 1){
            System.out.println("No hay peticiones");
        }
    }
    
    public static void eliminarTodasPeticiones(){
        int contador = 1;
        for (int i = 0; i<peticiones.length;i++){
            if(peticiones[i] != null){
                peticiones[i] = null; 
                contador++; 
            }
        }
        if(contador == 1){
            System.out.println("No hay peticiones");
        }
    }
    
    public static void eliminarPeticion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que peticion quieres borrar?");
        int posicion = sc.nextInt();
        sc.nextLine();
        peticiones[posicion] = null;
        
    }

}
