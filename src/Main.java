import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<Cuenta> cuentaPersonas = new ArrayList<>();

        System.out.println("Ingrese el nombre del titular: ");
        String nombreTitular = read.next();
        System.out.println("Ingrese el saldo de cuenta: ");
        double saldoCuenta = read.nextDouble();

        Cuenta persona = new Cuenta(nombreTitular, saldoCuenta);;
        cuentaPersonas.add(persona);

        int opc = 0;
        while(opc != 4){
            System.out.println("Ingrese una opcion a realizar: ");
            System.out.println("1. Para imprimir su cuenta en general, 2. Para Ingresar, 3. Para retirar, 4.Para salir: ");
            opc = read.nextInt();
            switch(opc) {
                case 1:
                    System.out.println(persona.Mostrar());
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a ingresar: ");
                    double ingreso = read.nextDouble();
                    persona.setIngreso(ingreso);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a retirar: ");
                    double retiro = read.nextDouble();
                    double saldoActual = persona.getSaldoDeCuenta();
                    if(saldoActual - retiro < 0){
                        System.out.println("Saldo insuficiente");
                    }  else {
                    persona.setRetiro(retiro);}
                    break;
                case 4:
                    System.out.println("Fin del programa :)...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
