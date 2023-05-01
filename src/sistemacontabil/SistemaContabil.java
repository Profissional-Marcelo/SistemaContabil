package sistemacontabil;
import java.util.Scanner;
public class SistemaContabil {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int contador=0,opcao,rt,sair;
        //Variaveis
        
        //Codigo
        while(contador==0){
        System.out.println("-----------------------------------");
        System.out.println("Bem vindo ao seu software contábil!");
        System.out.println("-----------------------------------");
        System.out.println("0 - Para sair\n1 - Para calcular seu imposto");
        //Tela inicial
        opcao = leia.nextInt();
        switch(opcao){
            case 0: 
            contador++;
            break;
            case 1:
                System.out.println("Ok, vamos começar!\nQual regime tributário da empresa?\n1-Simples Nacional\n2-Lucro Presumido\n3-Lucro Real");
                rt = leia.nextInt();
                switch(rt){
                    case 1:
                              System.out.println("Sistema ainda indisponivel... Pressione 0- Para saír ");    
                        sair = leia.nextInt();
                        if(sair==0){
                        contador++;}
                    break;
                    case 2:
                        LucroPresumido lpps = new LucroPresumido();
                        System.out.println("Então você é um prestador de serviços de regime Lucro Presumido?");
                        lpps.calculops();
                    case 3:
                        System.out.println("Sistema ainda indisponivel... Pressione 0- Para saír ");    
                        sair = leia.nextInt();
                        if(sair==0){
                        contador++;}
                          }
            break;   
        }
     }
        
    }
}