public class Cliente {

    String nome;
    String endereceo;
    String produto;

    public void showCliente(){
        System.out.println("O cliente "+this.nome+" solicitou o produto "+this.produto+" para o\n" +
                "endereço " + this.endereceo);
    }

}
