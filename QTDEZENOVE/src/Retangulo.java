public class Retangulo {

    float altura;
    float largura;

    float showAltura(){
        return this.altura;
    }

    float showLargura(){
        return this.largura;
    }

    void areaTotal(){
        float area = this.altura * this.largura;
        System.out.println("O valor da area é "+area);
    }

}
