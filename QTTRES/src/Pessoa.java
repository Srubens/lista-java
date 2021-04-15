public class Pessoa {

    String nome;
    String produto;
    String endereco;

    public void showCliente(){
        System.out.println("O cliente "+this.nome+" solicitou o produto "+this.produto+" para o\n" +
                "endereço" + this.endereco);
    }

}
