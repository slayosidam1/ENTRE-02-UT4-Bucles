
/**
 *  Clase que dibuja una figura 
 * 
 * @author - Saúl Layos Iriso
 *  
 */
public class PintorFiguras
{
    private static final int ANCHO_BLOQUE = 4;
    private static final char ESPACIO = ' ';
    private static final char CAR1 = 'B';
    private static final char CAR2 = '=';

    /**
     * Dibuja una figura (ver enunciado) de altura
     * indicada (se asume la altura un valor correcto)
     * 
     * (usa bucles for)
     */
    public  void dibujarFigura(int altura) {
        for (int i = 1; i <= altura ; i ++){
            escribirEspacios(ESPACIO, (altura-i)*2);
            for(int j = 1; j<=i ; j++){
                if(j % 2 != 0){
                    escribirEspacios(CAR1, ANCHO_BLOQUE);
                }else if (j % 2 == 0){
                    escribirEspacios(CAR2, ANCHO_BLOQUE);
                }
                
            }
            System.out.println();
        }
        
    }

    /**
     * Método privado de ayuda que escribe n espacios en la misma línea
     */
    private  void escribirEspacios(char caracter, int n) {
        for (int contador = 1; contador <= n; contador++) {
            System.out.print(caracter);
        }
    }
}
