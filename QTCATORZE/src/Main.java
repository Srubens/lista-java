public class Main {

    public static void main(String[] agrs) {

        Funcionario b1 = new Funcionario();
        b1.nome = "tagore";
        b1.salario = 1200;

        Funcionario b2 = new Funcionario();
        b2.nome = "taore";
        b2.salario = 2200;

        Funcionario b3 = new Funcionario();
        b3.nome = "didier";
        b3.salario = 3200;

        Funcionario.mediaSalario(b1.salario, b2.salario, b3.salario);

    }

}
