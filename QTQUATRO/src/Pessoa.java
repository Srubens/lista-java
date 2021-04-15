public class Pessoa {

    String nome;
    String sexo;
    int idade;
    String estadoSivil;
    float salario;

    public void showCliente(){
        System.out.println("Funcionário "+this.nome+" do sexo " + this.sexo+ " idade "+this.idade+" e estado civil\n" +
                " "+this.estadoSivil+" recebe R$"+this.salario+" de salario;");
    }

}
