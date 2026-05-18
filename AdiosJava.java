import java.util.Scanner;

public class AdiosJava{

    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    public static double dividir(double num1, double num2){
        return num1/num2;
    }

    public static void main(String[] args) {
        int numero1, numero2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el numero 1: ");
        numero1 = scanner.nextInt();
        System.out.println("Escribe el numero 2: ");
        numero2 = scanner.nextInt();
        int resultado = numero1+ numero2;
        System.out.println("La suma es: " + resultado);

        System.out.println("****************************************");
        int resta = restar(numero1, numero2);
        System.out.println("La resta es: " + resta);

        //Clase persona
        Persona persona1;
        persona1 = new Persona("Alejandro", "Gomez", "Rodriguez");
        persona1.setEdad(21);
        persona1.setGenero('M');
        persona1.setTelefono("242 543 78 46");
        persona1.setDireccion("Avenida Juarez #42");

        System.out.println("Datos de la persona " + persona1.toString());

    }   

    public static int restar (int n1, int n2){
        return n1 -n2;
    }
}