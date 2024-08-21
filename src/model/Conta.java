public class Conta {
    //atributos
    public String conta;
    public String agencia;
    public double saldo;
    public String nomeCliente;

    //metodos
    public boolean sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double deposito){
        saldo += deposito;
    }

    public void imprimir(){
        System.out.println("---------------------------");
        System.out.println("Conta:         " + conta);
        System.out.println("Agencia:       " + agencia);
        System.out.println("Saldo:         " + saldo);
        System.out.println("Nome Cliente:  " + nomeCliente);
        System.out.println("---------------------------");


    }
}


