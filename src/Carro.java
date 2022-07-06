public class Carro{

    //atributos
    private String placa;
    private int ano;
    private String cor;
    private String modelo;
    private double kilometragem;

    public Carro(String placa, int ano, String cor,
                 String modelo, double kilometragem){

        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
        this.modelo = modelo;
        this.kilometragem = kilometragem;
    }

    public Carro(String placa, int ano, 
                 String cor, String modelo){
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
        this.modelo = modelo;
        this.kilometragem = 0.0;
    }

    public Carro(int ano, String cor, String modelo){
        this.cor = cor;
        this.ano = ano;
        this.modelo = modelo;
        this.kilometragem = 0;
        this.placa = "";
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

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

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public double getKilometragem() {
        return kilometragem;
    }

}