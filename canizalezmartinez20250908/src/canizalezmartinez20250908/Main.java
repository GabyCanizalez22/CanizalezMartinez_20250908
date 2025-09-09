/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package canizalezmartinez20250908;

/**
 *
 * @author UFG
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //TAMAÑO DEL ARREGLO
        int cantidad_elementos = 5;
        
        //CREACION E INSTANCIA ARREGLO DE NUMEROS DESORDENADOS
        int [] numeros_desordenados = new int [cantidad_elementos];
        
        //CREACION E INSTANCIA ARREGLO DE NUMEROS ORDENADOS
        int [] numeros_ordenados = new int [cantidad_elementos];
        
        //CREACION E INSTANCIA DEL OBEJTO DEL SCANNER
        Scanner scanner = new Scanner (System.in);
        
        //NOTIFICACION AL USUARIO PARA INDICAR QUE DEBE INGRESAR AVLORES ENTEROS
        System.out.println ("por favor ingrese "+ cantidad_elementos+"numeros enteros de manera desordenada");
        
        //SE RECORRE EL ARREGLO DE NUMEROS ENTEROS DESORDENADOS PQUE POR DEFECTO
        //TIENEN EL VALOR DE CERO
        for (int i = 0; i<numeros_desordenados.length; i++){
            
            //SE SOLICTA AL USUARIO EL INGRESO DE UN VALOR 
            System.out.print("Diguite el elemento " +(i+1)+": ");
            
            //SE DIGITA UN VALOR DESDE EL TECLADO DE TIPO ENTERO
            numeros_desordenados[i] = scanner.nextInt();
            
        }
        //SE IMPRIME UNA SALIDA AL USUARIO PARA MOSTRAR LO QUE SE HA DIGITADO 
        
        System.out.println("Usted digito los siguientes numeros");
        
        //SE RECORRE EL ARREHLO DE VALORES DIGITADOS
        for(int j=0; j<numeros_desordenados.length;j++){
            
            //SE IMPRIMEN LOS NUMEROS DIGITADOS POR EL USUARIO
            //ALMACENADOS EN EL ARREGLO DE NUMEROS DESORDENADOS
            System.out.print(numeros_desordenados[j]+ " ");
        }
        
        //HACEMOS SALTO DE LINEA
       System.out.println(); 
       
       //INVOCAMOS LA FUNCION PARA ORDENAR EL ARREGLO
       numeros_ordenados = ordenar (numeros_desordenados);
       //ordenar(numeros_desordenados);
       
       //IMPRIMIMOS LA SALIDA AL USUARIO
       System.out.println("Los numeros ordenados son: ");
       
       //SE RECORRE EL ARREGLO PARA OBTENR CADA VALOR 
       //DEL ARREGLO ORDENADO
       for (int k = 0; k< numeros_ordenados.length;k++){
           
           //SE IMPIRME EL VALOR DE CADA ELEMENTO
           System.out.print(numeros_ordenados[k]+ " ");
       }
       System.out.println();
    }
    
    //FUNCION PARA ORDENAR UN ARREGLO UNIDIMENSIONAL
    public static int [] ordenar (int[] arreglo){
        
        //SE RECORRE EL ARREGLO PARA EVALUAR CADA POSICION
        for (int i =0; i<arreglo.length-1; i++){
           // System.out.print(arreglo[i]);
            
           //SE RECORRE UN SEGUNDO RECORRIDO PARA PODER COMPARAR
           //LA POSICION ACTUAL CON LA POSICION SIGUIENTE
            for (int j= 0; j<arreglo.length -1 ; j++){
                
               // System.out.print(arreglo[j]);
               
               //SE EVALUA EL VALOR DE CADA ELEMETO 
               //EN EL ARREGLO
               if (arreglo [j]> arreglo[j+1]){
                   
                   //SI ES MAYOR DE CREA UNA VARIABLE PARA ALMACENAR EL VALOR
                   //DEL ELEMENTO MAYOR
                   int mayor = arreglo [j];
                   
                   //SE CAMBIA LA POSICION DEL ELEMENTO ACTUAL
                   arreglo[j] = arreglo[j+1];
                   
                   //SE INCREMENTA LA POSICION DEL SIGUIENTE ELEMENTO
                   //ASIGNADO EL VALOR MAYOR 
                   arreglo[j+1] = mayor;
                   
                   
               }
               
               
               
            }
            
            System.out.println();
        }
        
        return arreglo;
    }
   
    
}
