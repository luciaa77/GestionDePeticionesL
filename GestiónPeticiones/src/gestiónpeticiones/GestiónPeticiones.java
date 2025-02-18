/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiónpeticiones;

/**
 *
 * @author Etien & Ivan
 */
public class GestiónPeticiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rol; 

        do{
            rol = modelo.Metodos.login();
            if(rol == 0){
                System.out.println("Usuario o contraseña invalido");                  
            }else if(rol == 1){
                System.out.println("Has accedido como usuario");
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
                }
                
            }
        }while(rol == 0);
    }
    
}
