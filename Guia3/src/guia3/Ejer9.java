/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir 
del bucle y mostrar el mensaje "Se capturó el numero cero".  El programa deberá calcular y
mostrar el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.

 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author cmartinez
 */
public class Ejer9 {
       public static void main(String[] args) {
        // TODO code application logic here
        
        int suma =0;
        for (int i=1; i<= 20;i++){
           Scanner leer = new Scanner(System.in);
           System.out.println("Ingrese un nro " +i+" por favor");
           int num = leer.nextInt();
           if (num ==0){
               System.out.println("LA suma de los nros ingresados es: "+ suma);
               break;
           }else{
              if (num > 0){
                suma = suma + num;
                
               } 
           }
           
        }       
        
    }
    
}
