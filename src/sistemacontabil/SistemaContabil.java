/** OBSERVAÇÃO: 
 * (Esse texto foi escrito no dia 02/05/2023, quando o código estava em sua versão
 * 0.0.3)
 * Estou atualizando esse código uma vez por dia enquanto aplico cada aprendizado
 * de meus estudos sobre Java.
 * Atualmente esse código está em sua versão 0.0.3 e trabalharei para que ele
 * fique em sua melhor performance até a versão 9.9.9, Onde irei realizar um vídeo
 * mostrando o comparativo entre sua primeira e atual versão e finalmente irei parar
 * de atualizar. Irei me esforçar para que chegue em sua última versão melhor do que
 * nunca.
 */  

package sistemacontabil;
import java.util.Scanner;
public class SistemaContabil {
    public static void main(String[] args) {
        //Variaveis
        
        Scanner leia = new Scanner(System.in);
        int contador=0,opcao;
        
        //Codigo
    
        Cadastrar p1 = new Cadastrar();
        while(contador==0){
        System.out.println("===================================\nBem vindo ao seu software contábil!\n===================================\nDigite o número correspondente a operação desejada!\n0: Saír\n1: Cadastrar\n2: Calcular imposto\n===================================");
        
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
          
     
                           
  
