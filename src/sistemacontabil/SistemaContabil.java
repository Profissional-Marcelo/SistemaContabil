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
 * 
 * 
 * DIA 03/05/2023: MUDANÇA
 * * A partir de agora o projeto só vai atualizar de 7 em 7 dias porém as atualizações
 * serão muito maiores.
 * Também estarei iniciando na data de estreia desse novo processo meu terceiro e quarto projeto
 * contando com eles temos;
 * 1* Projeto Portifolio
 * 2* Projeto SistemaContabil
 * 3* Projeto SOSAnimal
 * 4* Projeto FADERGSfighter
 * 5* Projeto politizei
 * 
 * 
 * 
 */  

package sistemacontabil;
import java.util.Scanner;
public class SistemaContabil {
    public static void main(String[] args) {
     //Introdução   
     Scanner leia = new Scanner(System.in);
      int contador=0, menu;
      Cadastrar usuario = new Cadastrar();
      
      
         //Menu
        while(contador == 0){
        System.out.println("=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=\nv 0.0.4");
        System.out.println("Bem vindo ao seu software de Sistema Contábil!");
        System.out.println("|1| Cadastrar conta");
        System.out.println("|2| Visualizar cadastro");
        System.out.println("|3| Calcular imposto");
        System.out.println("|4| Saír");
        System.out.println("=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=");
        
            
        
        menu = leia.nextInt();
            switch(menu){
            case 1:
                usuario.cadastrar();
            break;    
            case 2:
                System.out.println("Serviço em manutenção, tente novamente mais tarde!");
                contador++;
            break;
            case 3:
                 usuario.registro();
                 contador++;                     
           break;
            case 4:
                contador++;
            break;
                    }
        
      
      
      
      
      
            }
        }
      
      }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    