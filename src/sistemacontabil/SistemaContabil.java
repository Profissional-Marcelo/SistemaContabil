   package sistemacontabil;
import java.util.Scanner;
public class SistemaContabil {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int contador=0,opcao;
        //Variaveis
        
        //Codigo
         Cadastrar p1 = new Cadastrar();
        while(contador==0){
        System.out.println("===================================");
        System.out.println("Bem vindo ao seu software contábil!");
        System.out.println("===================================");
        System.out.println("0 - Para sair\n1 - Cadastrar\n2 - Para calcular seu imposto");
        //Tela inicial
        opcao = leia.nextInt();
        switch(opcao){
            case 0: 
            contador++;
            break;
            case 1:
                p1.cadastrar();
            break;
            case 2:
                p1.calcular();
            break;    
                }
           }
        }
    }
          
     
                           
  
