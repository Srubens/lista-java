import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Retangulo re = new Retangulo();
        System.out.println("Digite a largura do retangulo: ");
        re.largura = scan.nextInt();
        scan.nextLine();
        System.out.println("Digite a altura do retangulo: ");
        re.altura = scan.nextInt();
        scan.nextLine();
        /*re.largura = 15;
        re.altura = 2;*/
        re.areaTotal();

    }

}
