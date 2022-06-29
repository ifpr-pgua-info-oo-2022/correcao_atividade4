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

        Carro carro = null;

        String placa;
        int ano;
        String cor;
        String modelo;
        double kilometragem,distancia;

        int op;

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
                    System.out.println("Digite a kilometragem:");
                    kilometragem = scan.nextDouble();

                    carro = new Carro();
                    
                    carro.placa = placa;
                    carro.ano = ano;
                    carro.modelo = modelo;
                    carro.kilometragem = kilometragem;
                    carro.cor = cor;

                    System.out.println("Carro criado com sucesso!");
                break;
                case 2:
                    System.out.println("Digite uma distância:");
                    distancia = scan.nextDouble();
                    boolean ret = carro.andar(distancia);
                    if(ret){
                        System.out.println("O carro andou");
                    }else{
                        System.out.println("Distância inválida!!");
                    }
                break;
                case 3:
                    System.out.println("Verificando revisão");
                    boolean precisaRevisao = carro.verificaRevisao();
                    if(precisaRevisao){
                        System.out.println("Precisa revisar!!");
                    }else{
                        System.out.println("Não precisa revisar!!");
                    }
                break;
                case 4:
                    System.out.println("Detalhes do carro");
                    System.out.println("Placa:"+carro.placa);
                    System.out.println("Ano:"+carro.ano);
                    System.out.println("Modelo:"+carro.modelo);
                    System.out.println("Cor:"+carro.cor);
                    System.out.println("Kilometragem:"+carro.kilometragem);
                break;
            }
        }while(op!=0);
    }
}
