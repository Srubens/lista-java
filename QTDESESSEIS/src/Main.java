import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("olá mundo");

        int media;

        Scanner scan = new Scanner(System.in);

        System.out.println("O aluno passou de ano? Digite 1 para aprovado 2 para reprovado");
        media = scan.nextInt();
        scan.nextLine();

        switch(media){
            case 1:
                System.out.println("Aluno aprovado! ");
                break;
            case 2:
                System.out.println("Aluno reprovado! ");
                break;
            default:
                System.out.println("Valor invalido :(");
        }
        

    }
}
