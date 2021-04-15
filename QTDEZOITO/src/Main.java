import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        int age;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        age = scan.nextInt();
        scan.nextLine();

        if( age > 40 ){
            System.out.println("Você está no grupo de risco cuidado!");
        }else{
            System.out.println("Você não está no grupo de risco.");
        }

    }

}
