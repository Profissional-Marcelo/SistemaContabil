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
 * 4* Projeto fighterFADERGS
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
      SimplesNacional sn = new SimplesNacional();
      LucroPresumido lp = new LucroPresumido();
      
      
         //Menu
        while(contador == 0){
        System.out.println("=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=\nv 0.0.5");
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
                usuario.setRt(leia.nextInt());
                switch(usuario.getRt()){
                 case 1: 
                 sn.cadastroSN();
                 break;
                case 2:
                lp.cadastroLP();
                 break;
                 case 3:
                 System.out.println("Empresa registrada como Lucro Real!");
                 usuario.setLr(true);
                 break;
                 case 4:
                 System.out.println("Empresa registrada como Lucro Arbitrado!");
                 break;
                 default:
                System.out.println("Opção inválida!");
                 break;                                    }      
            break;    
            case 2:
                System.out.println("Serviço em manutenção, tente novamente mais tarde!");
                contador++;
            break;
            case 3:
                 if (sn.getSimplesNacional()){
                    sn.calculoSn();
                                             }
                 else if (lp.getLucroPresumido()){
                 lp.calculoLp();
                                             } 
                 else if (usuario.lr == true){
                 System.out.println("Serviço ainda indisponível, aguarde novas atualizações!");
                                             } 
                 else if (usuario.la == true){
                 System.out.println("Serviço ainda indisponível, aguarde novas atualizações!");
                                             }
                 else{
                     System.out.println("Você deve cadastrar sua conta primeiro!");
                                             }
                 contador++;                     
           break;
            case 4:
                contador++;
            break;
                    }

            }
        }
      
      }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    