import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        float vinte = 0;
        float trinta = 0;
        float cinquenta = 0;
        float salario;
        int opc;
        int i = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("informe seu salario: ");
        salario = scan.nextFloat();
        scan.nextLine();
        System.out.println(salario);

        do {

            System.out.println("Informe 1 para 50%, 2 para 30% e 3 para 20%: ");
            opc = scan.nextInt();
            scan.nextLine();

            switch (opc) {
                case 1:
                    cinquenta = (1000 / 100) * 50;
                    break;
                case 2:
                    trinta = (1000 / 100) * 30;
                    break;
                case 3:
                    vinte = (1000 / 100) * 20;
                    break;
            }
            i++;
        }while(i != 3);

        System.out.println("Formatação de saída: O seu salário é R$"+ salario +". Você deve usar R$"+ vinte +" para as\n" +
                "necessidades. Deve usar R$"+ trinta +" para seus desejos pessoais. E R$"+ cinquenta +" para\n" +
                "investimento ou pagar as dívidas;");




    }
}
