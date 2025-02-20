/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiónpeticiones;

import java.util.Scanner;

/**
 *
 * @author Etien & Ivan
 */
public class GestiónPeticiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rol = -1; 
        String user = null; 
        while(true){
            do{
            
            if(user == null){
                Scanner sc = new Scanner(System.in);
                System.out.print("Introduce el nombre de usuario: ");
                user = sc.nextLine();
                rol = modelo.Metodos.login(user);
            }
            if(rol == 0){
                System.out.println("Usuario o contraseña invalido");                  
            }else if(rol == 1){
                System.out.println("Has accedido como usuario");
                System.out.println();
                System.out.println("___________________________");
                
                int opu = modelo.Metodos.menuUsuario();
                
                if(opu == 1){
                    System.out.println();
                    boolean correcto = modelo.Metodos.escribirPeticion(user);
                    if(correcto){
                        System.out.println("Peticion insertada correctamente");
                    }else{
                        System.out.println("Ha ocurrido un error.");
                    }
                }else if(opu == 2){
                    System.out.println();
                    modelo.Metodos.verMisPeticiones(user);
                }else if(opu == 3){
                    user = null;
                    rol = 0;
                    System.out.println("Has cerrado sesion...");
                    System.out.println();
                }else if(opu == 4){
                    break;
                }else if(opu == 5){
                    System.out.println();
                    modelo.Metodos.verMisPeticiones(user);
                    modelo.Metodos.eliminarPeticionPropia();
                }
            
            }else if (rol == 2){
                System.out.println("Has accedido como administrador");
                System.out.println();
                System.out.println("___________________________");
                
                int opa = modelo.Metodos.menuAdministrador();
                if(opa == 1){
                    System.out.println();
                    modelo.Metodos.imprimirPeticiones();
                }else if(opa == 2){
                    System.out.println();
                    modelo.Metodos.eliminarTodasPeticiones();
                }else if(opa == 3){
                    System.out.println();
                    modelo.Metodos.imprimirPeticiones();
                    modelo.Metodos.eliminarPeticion();
                }else if(opa == 4){
                    user = null;
                    rol = 0;
                    System.out.println("Has cerrado sesion...");
                    System.out.println();
                }else if(opa == 5){
                    break;
                }
                
            }
            
        }while(rol == 0);
        }
    }
    
}
