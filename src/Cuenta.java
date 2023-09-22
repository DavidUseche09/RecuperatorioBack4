public class Cuenta {
    private double saldoDeCuenta;
    private String nombreDelTitular;
    private long numeroDeCuenta;

    public Cuenta(String nombreDelTitular, double saldoDeCuenta){
    this.nombreDelTitular = nombreDelTitular;
    this.saldoDeCuenta = saldoDeCuenta;
    this.numeroDeCuenta = (long) (1000000000 + Math.random() * 9000000000L);
    }

    public String Mostrar(){
        return "Nombre del titular de la cuenta: " + this.nombreDelTitular + "\n Saldo de su cuenta: " + this.saldoDeCuenta + "\n Numero de cuenta: " + this.numeroDeCuenta;}

    public double getSaldoDeCuenta() {
        return saldoDeCuenta;
    }
    public void setSaldoDeCuenta(double saldoDeCuenta) {
        this.saldoDeCuenta = saldoDeCuenta;
    }

    public String getNombreDelTitular() {
        return nombreDelTitular;
    }
    public void setNombreDelTitular(String nombreDelTitular) {
        this.nombreDelTitular = nombreDelTitular;
    }

    public long getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
    public void setNumeroDeCuenta(long numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }
}
