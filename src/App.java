import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static String menu(){
        String str="";
        
        str+="1 - Criar\n";
        str+="2 - Andar\n";
        str+="3 - Verificar Revisão\n";
        str+="4 - Ver daddos\n";
        str+="0 - Sair\n";

        return str;
    }


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        //Carro[] carros = new Carro[2];
        ArrayList<Carro> carros = new ArrayList();
        Carro novoCarro = null;

        int pos = 0;

        String placa;
        int ano;
        String cor;
        String modelo;
        double kilometragem,distancia;

        int op,novo;

        do{
            System.out.println(menu());
            op = scan.nextInt();
            scan.nextLine();
            switch(op){
                case 1:
                    System.out.println("Digite a placa");
                    placa = scan.nextLine();
                    System.out.println("Digite o modelo:");
                    modelo = scan.nextLine();
                    System.out.println("Digite a cor:");
                    cor = scan.nextLine();
                    System.out.println("Digite o ano:");
                    ano = scan.nextInt();
                    System.out.println("Esse carro é novo? (1-sim, 0-não)");
                    novo = scan.nextInt();
                    if(novo == 0){
                        System.out.println("Digite a kilometragem:");
                        kilometragem = scan.nextDouble();

                        novoCarro = new Carro(placa,ano,cor,
                                         modelo,kilometragem);
                        carros.add(novoCarro);
                    }else{
                        novoCarro = new Carro(placa,ano,cor,modelo);
                    
                        carros.add(novoCarro);
                    }
                    
                    //carro.placa = placa;
                    //carro.ano = ano;
                    //carro.modelo = modelo;
                    //carro.kilometragem = kilometragem;
                    //carro.setCor(cor);

                    System.out.println("Carro criado com sucesso!");
                break;
                case 2:
                    
                    System.out.println("Digite uma placa:");
                    placa = scan.nextLine();

                    Carro busca = null;
                    for(int i=0;i<carros.size();i++){
                        Carro temp = carros.get(i);
                        //if(temp.getPlaca().equals(placa))
                        if(carros.get(i).getPlaca().equals(placa)){
                            busca = carros.get(i);
                        }
                    }

                    if(busca != null){
                        System.out.println("Digite uma distância:");
                        distancia = scan.nextDouble();
                        boolean ret = busca.andar(distancia);
                        if(ret){
                            System.out.println("O carro andou");
                        }else{
                            System.out.println("Distância inválida!!");
                        }
                    }else{
                        System.out.println("Carro não encontrado!");
                    }

                    
                break;
                case 3:
                    /*System.out.println("Verificando revisão");
                    boolean precisaRevisao = carro.verificaRevisao();
                    if(precisaRevisao){
                        System.out.println("Precisa revisar!!");
                    }else{
                        System.out.println("Não precisa revisar!!");
                    }*/
                break;
                case 4:
                    
                    for(int i=0;i<carros.size();i++){
                        Carro carro = carros.get(i);
                        if(carro != null){
                            System.out.println("Detalhes do carro");
                            System.out.println("Placa:"+carro.getPlaca());
                            System.out.println("Ano:"+carro.getAno());
                            System.out.println("Modelo:"+carro.getModelo());
                            System.out.println("Cor:"+carro.getCor());
                            System.out.println("Kilometragem:"+carro.getKilometragem());    
                        }
                    }
                break;
            }
        }while(op!=0);
    }
}