import java.util.Scanner;
public class Main {

    public static void main(String[] agrs) {

        String nome;
        float nota1;
        float nota2;
        float result;

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o nome do aluno: ");
        nome = scan.next();
        scan.nextLine();

        System.out.println("Informe a primeira nota do aluno: ");
        nota1 = scan.nextFloat();
        scan.nextLine();

        System.out.println("Informe a segunda nota do aluno: ");
        nota2 = scan.nextFloat();
        scan.nextLine();

        result = (nota1 + nota2) / 2;
        System.out.println("O alundo " + nome);
        System.out.println("nota 1 do aluno " + nota1);
        System.out.println("nota 2 do aluno " + nota2);
        System.out.println("A media do aluno foi: " + result);

        if(result >= 7){
            System.out.println("O aluno foi aprovado " + result);
        }

    }

}
