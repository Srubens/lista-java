public class Pessoa {

    String nome;
    String cpf;
    String sexo;
    String estadoCivil;
    float salario;
    int idade;

    public void showCliente(){
        System.out.println("Funcionário "+this.nome+" do sexo "+this.sexo+" idade "+this.idade+" e estado civil\n" +
                this.estadoCivil + " recebe "+this.salario+ " de salario;");
    }

}
