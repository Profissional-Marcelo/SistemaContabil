/** OBSERVAÇÃO: 
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
 * DIA 20/05/2023
 *
 * VERSÃO ALPHA (Até versão 1.0.0)
 * 
 * VERSÃO BETA  (Até versão 2.0.0)
 * 
 * VERSÃO RC (Até versão 3.0.0)
 * 
 * VERSÃO RTM (Até versão 4.0.0)
 * 
 * VERSÃO GA (Até versão 9.9.9)
 * 
 * fim das atualizações, 
 * Espero que um dia chegue lá. :D
 * 
 * 
 * Metas:
 * 
 * 1º Concluir e deixar todos os regimes tributários completos, realizando cálculos do modelo federal
 * de maneira correta até a atualização 0.1.0 
 * 
 * 2º Implementar algumas diferenças de apuração de imposto devido a leis do estado, oque pode acarretar
 * em alguns descontos na apuração do imposto, para empresas de um determinado estado. Até a atualização 0.2.0
 * 
 * 3º Implementar ArrayLists para evoluir o software e fazer com que ele comece a armazenar dados, permitindo que o 
 * usuário possa por exemplo, excluir a conta cadastrada sem ter necessáriamente que fechar e reabrir o programa. 
 * Até a atualização 0.2.0
 * 
 * 4º Implementar banco de dados... Uma evolução do ArrayList, vai demandar bastante esforço e estudo, e é uma atualização
 * ainda mais futura que as outras, mas acredito que fique pronto até a atualização 0.4.0
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
        System.out.println("=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=\nv 0.0.6");
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    