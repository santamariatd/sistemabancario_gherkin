package co.com.sofka.appbancaria;

public class CuentaAhorros {
    private String id;
    private double saldo;

    public CuentaAhorros(String identificador) {
        this.id = identificador;
        this.saldo = 0;
    }

    public void setSaldo(double saldoDisponible) {
        this.saldo = saldoDisponible;
    }

    public double retirarDinero(double cantidad){
        if (cantidad < this.saldo){
            this.saldo = this.saldo - cantidad;
        }
        return this.saldo;
    }

    public double consignarDinero(double cantidad){
        this.saldo = this.saldo + cantidad;
        return this.saldo;
    }
}
