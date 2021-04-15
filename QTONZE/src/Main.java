import java.util.Scanner;
public class Main {

    public static void main(String[] agrs) {

        float nota1;
        float nota2;
        float result;

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o primeiro valor ");
        nota1 = scan.nextFloat();
        scan.nextLine();

        System.out.println("Informe o segundo valor ");
        nota2 = scan.nextFloat();
        scan.nextLine();

        result = nota1 / nota2;
        System.out.println("nota 1 do aluno " + nota1);
        System.out.println("nota 2 do aluno " + nota2);
        System.out.println("A divisão de "+nota1+" por "+nota2+" é\n" +
                result);


    }

}
