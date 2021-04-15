import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        float diaUm;
        float diaDois;
        float tempo;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a temperatura do dia 1 ");
        diaUm = scan.nextFloat();
        scan.nextLine();
        System.out.println("Informe a temperatura do dia 2 ");
        diaDois = scan.nextFloat();
        scan.nextLine();

        if( diaUm < 20 && diaDois < 20 ){
            System.out.println("Vai chover ");
        }else if( diaUm < 20 && diaDois < 20 ){
            System.out.println("Não vai chover ");
        }else if( diaUm > 20 && diaDois < 20 ){
            System.out.println("Vai chover");
        }else if( diaUm > 20 && diaDois > 20 ){
            System.out.println("Vai chover ");
        }
        

        System.out.println("o valor do dia 1 foi " + diaUm);
        System.out.println("o valor do dia 2 foi " + diaDois);

    }

}
