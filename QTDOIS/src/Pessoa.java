public class Pessoa {

    String nome;
    String cpf;
    String sexo;
    int idade;

    public void showCliente(){
        System.out.println("A aluno "+this.nome+" com cpf "+this.cpf+" do sexo "+this.sexo+" tem "+this.idade+"\n" +
                "anos");
    }

}
