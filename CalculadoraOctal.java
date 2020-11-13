
/**
 *  Representa a una calcualdora que hace sumas octales
 * 
 * @author - Saúl Layos Iriso
 * 
 */
public class CalculadoraOctal
{

    /**
     * sumar dos nºs supuestos en base 8 y con el mismo
     * nº de cifras
     * Asumimos positivos
     */
    public int sumarEnOctal(int n1, int n2) {
        int suma = 0;
        int acarreo = 0;
        int digito = 0;
        int m = 1;
        while(n1 != 0 || n2 != 0 || acarreo != 0)
        {
            digito = 0;
            digito = acarreo + (n1%10) + (n2%10);
            n1/= 10;
            n2/= 10;
            if(digito > 7) {
                acarreo = 1;
                digito %= 8;
            } else {
                acarreo = 0;
            }
            suma += digito * m;
            m *= 10;
        }
        return suma; 
    }
}
