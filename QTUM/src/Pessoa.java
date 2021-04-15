public class Pessoa {

    String nome;
    int numeroConta;
    float saldo;

    public void showCliente(){
        System.out.println("O cliente "+ this.nome +" da conta "+this.numeroConta+" tem o saldo de\n R$ " +
                this.saldo);
    }

}
