public class CuentaBancaria {
    private String titular;
    private double saldo;

    public String getTitular(){
        return this.titular;
    }
    
    public void setTitular(String nuevoTitular){
        if (nuevoTitular!=null){
            this.titular = nuevoTitular;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double nuevoSaldo){
        if (nuevoSaldo>=0){
            this.saldo = nuevoSaldo;
        }
    }

    public void depositar(double monto){
        if (monto>0){
            this.saldo += monto;
            System.out.println("Deposito realizado exitosamente.");
        } else {
            System.out.println("Error al depositar: El monto es invalido.");
        }
    }

    public void retirar(double monto){
        if (monto<=saldo){
            this.saldo -= monto;
            System.out.println("Retiro realizado exitosamente.");
        } else {
            System.out.println("Error al retirar: Saldo insuficiente.");
        }
    }

    public void mostrarSaldo(){
        System.out.println("Su saldo actual es: "+this.saldo);
    }

    public CuentaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
}
