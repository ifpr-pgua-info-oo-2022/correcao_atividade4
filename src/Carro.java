public class Carro{

    //atributos
    String placa;
    int ano;
    String cor;
    String modelo;
    double kilometragem;

    //métodos
    boolean andar(double distancia){
        if(distancia > 0){
            kilometragem = kilometragem + distancia;
            return true;
        }
        return false;
    }

    boolean verificaRevisao(){
        if((kilometragem > 0) && (kilometragem%1000 == 0)){
            return true;
        }
        return false;
    }

}