import java.util.Scanner;
/**
 * Modela el interfaz para interactuar con el usuario
 * @author - Saúl Layos Iriso
 */
public class IUTexto
{
    private Scanner teclado;
    private CalculadoraOctal calculadora;
    private PintorFiguras pintor;

    /**
     * Constructor  
     */
    public IUTexto(CalculadoraOctal calculadora, PintorFiguras pintor)
    {
        this.teclado = new Scanner(System.in);
        this.calculadora = calculadora;
        this.pintor = pintor;
    }

    /**
     * Controla la lógica de la aplicación
     */
    public void iniciar()
    {
        hacerSumasOctales();
        dibujarFiguras();

    }

    /**
     *  - borrar la pantalla
     *  - pedir al usuario un par de números
     *  - si los números no están en octal mostrar un mensaje
     *  - si los números no tienen el mismo número de cifras mostrar un mensaje
     *  - si son correctos calcular su suma octal y mostrar el resultado en pantalla
     *  - los pasos anteriores se repiten mientras el usuario quiera (pulsa 'S' o 's')
     *  
     */
    private void hacerSumasOctales()
    {
        char repetir = 'S';
        do{
            boolean flagOctal = true;
            boolean flagCifras = true;

            Pantalla.borrarPantalla();

            System.out.println("Dame numero1: ");
            int num1 = teclado.nextInt();
            System.out.println("Dame numero2: ");
            int num2 = teclado.nextInt();
           
            if(Utilidades.estaEnOctal(num1) == false || Utilidades.estaEnOctal(num2) == false){
                System.out.println("No son octales\n");
                flagOctal = false;

            }else if(Utilidades.contarCifras(num1) != Utilidades.contarCifras(num2)){
                System.out.println("No tienen el mismo nº de cifras\n");
                flagCifras = false;

            }

            if(flagOctal == true && flagCifras == true){
                int resultado = calculadora.sumarEnOctal(num1, num2);
                System.out.println("El resultado de la suma es: "+ resultado +"\n");
            }

            System.out.println("Deseas repetir la ejecucion? (S|s)");
            repetir = teclado.next().charAt(0);

        }while(repetir == 'S' || repetir == 's');
    }

    /**
     *  Pide al usuario un valor de altura, 
     *  valida que sea correcto (un valor entre 1 y 10)
     *  y muestra la figura en pantalla
     */

    private void dibujarFiguras()
    {
        System.out.println("Altura de la figura?(1-10)");
        int n = teclado.nextInt();
        while (n < 1 || n > 10) {
            System.out.println("Error, Altura de la figura?(1-10)");
            n = teclado.nextInt();
        }
        pintor.dibujarFigura(n);
    }
}
    