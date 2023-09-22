import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cuenta> cuentaPersonas = new ArrayList<>();
        Cuenta person1 = new Cuenta("Diego Lopez", 500);
        cuentaPersonas.add(person1);

        for (int i = 0; i<cuentaPersonas.size(); i++){
            System.out.println(cuentaPersonas.get(i).Mostrar());
        }
    }
}