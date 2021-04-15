public class Main {

    public static void main(String[] args){

        Carro c = new Carro();
        c.myturnOn();
        c.accelerate(10);
        c.accelerate(10);
        c.downshift(15);
        System.out.println("Sua velocidade atual" + c.acecelerate);
        c.off();
        c.showSpeed();
        System.out.println(c.turnOn);

    }

}
