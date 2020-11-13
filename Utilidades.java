import java.util.Scanner;
/**
 *   Clase de utilidades
 *   Incluye métodos estáticos
 *   
 *   @author - Saúl Layos Iriso
 */
public class Utilidades
{
    /**
     * Dado un número n (asumimos positivo)
     * devueve true si está en octal false en otro caso
     * Un nº está en octal si cada una de sus cifras
     * es un valor entre 0 y 7
     * 
     * (usa bucles while)
     */
    public static boolean estaEnOctal(int n) {
       boolean octal = true;
       while (n != 0){
             int aux = n % 10;
            n = n / 10;
            
            if (aux >= 0 && aux < 8){
                octal = true;
            }else{
                octal = false;
            }
        }
       return octal;
    }

    /**
     * Dado un número n (asumimos positivo)
     * devuelve la cantidad de cifras que tiene
     * 
     * (usa bucles while)
     */
    public static int contarCifras(int n) {
        int cifras = 0;
        while (n != 0) {
            cifras++;
            n = n / 10;
        }

        return cifras;         
    }
}
