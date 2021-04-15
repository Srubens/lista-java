import java.io.PrintStream;

public class Carro {

    int acecelerate = 0;
    boolean turnOn = false;

    public void accelerate(int acc){
        this.acecelerate += acc;
        System.out.println("O carro recebeu velocidade de " + this.acecelerate);
    }

    public void downshift(int downshift){
        this.acecelerate -= downshift;
        System.out.println("O carro reduziu velocidade " + this.acecelerate);
    }

    PrintStream myturnOn(){
        if(turnOn == false){
            this.turnOn = true;
        }else{
            this.turnOn = false;
        }
        return System.out.printf("O carro está ligado: Iniciar o movimento" + this.turnOn + "\n");
    }

    public void off(){
        this.acecelerate = 0;
        this.turnOn = false;
        System.out.println("O carro parou " + this.acecelerate);
    }

    public void showSpeed(){
        System.out.println("A velocidade do carro é " + this.acecelerate);
    }

}
