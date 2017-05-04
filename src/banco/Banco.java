
package banco;
import java.util.Scanner;

/**
 *
 * @author Manuel Dzul
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double totalCuenta;

        // Creamos la cuenta
        Cuenta Cuenta1;
        Cuenta1 = new Cuenta(11111,0);
         int entrada = 0;         
         int  usuario = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("introdusca la operacion a realizar:");
        System.out.println("opcion 1 para consultar saldo");
        System.out.println("opcion 2 para depositar ");
        System.out.println("opcion 3 para retirar ");
               
        usuario = sc.nextInt();
        
        if (usuario == 1){
           // Consultamos el saldo
        totalCuenta = Cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta + " $");
            
        }else if (usuario == 2){
            // hacemos un ingreso en la cuenta
            System.out.println("Cuando desea depositar");
            double ingreso = sc.nextInt();
            System.out.println("Se ingresan en la cuenta: " + ingreso + " $");
              Cuenta1.depositar(ingreso); 
              totalCuenta = Cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta + " $");
        
        }else if (usuario == 3){
            //hacemos un retiro de la cuenta
            System.out.println("cuanto desea retirar:");
            double ingreso = sc.nextInt();
            
            
            System.out.println("se retiro de la cuenta:" + ingreso + " $" );
            Cuenta1.retirar(ingreso);
            totalCuenta = Cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta + " $");      
            
            
        }
  }
    
}
