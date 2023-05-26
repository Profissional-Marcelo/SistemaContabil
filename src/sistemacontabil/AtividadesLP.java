
package sistemacontabil;

import java.util.Scanner;

public class AtividadesLP {
    public boolean[] atividades = {false, false, false, false, false, false, false, false, false, false};
        public boolean lucroPresumido = false;
        public int escolha;
        Scanner leia = new Scanner(System.in);
        
    public boolean getLucroPresumido() {
        return lucroPresumido;
    }

    public void setLucroPresumido(boolean lucroPresumido) {
        this.lucroPresumido = lucroPresumido;
    }

    public void cadastroATV(){
        setLucroPresumido(true);
                 System.out.println("=== Informe a atividade correspondente a sua empresa: ===");
                 System.out.println("|0| Revenda de combustíveis e gás natural");
                 System.out.println("|1| Transporte de cargas");
                 System.out.println("|2| Atividades imobiliárias");
                 System.out.println("|3| Industrialização para terceiros com recebimento do material");
                 System.out.println("|4| Demais atividades não especificadas que não sejam prestação de serviço");
                 System.out.println("|5| Transporte que não seja de cargas e serviços em geral");
                 System.out.println("|6| Serviços profissionais que exijam formação técnica ou acadêmica – como advocacia e engenharia");
                 System.out.println("|7| Intermediação de negócios");
                 System.out.println("|8| Administração de bens móveis ou imóveis, locação ou cessão desses mesmos bens");
                 System.out.println("|9| Construção civil e serviços em geral");
                 escolha = leia.nextInt();
                 switch (escolha){
                     case 0:
                          System.out.println("Empresa cadastrada como atividade 0!");
                          atividades [0] = true;
                     break;
                     case 1: 
                          System.out.println("Empresa cadastrada como atividade 1!");
                          atividades [1] = true;
                     break;
                     case 2:
                          System.out.println("Empresa cadastrada como atividade 2!");
                          atividades [2] = true;
                     break;
                     case 3:
                          System.out.println("Empresa cadastrada como atividade 3!");
                          atividades [3] = true;
                     break;
                     case 4: 
                          System.out.println("Empresa cadastrada como atividade 4!");
                          atividades [4] = true;
                     break;
                     case 5:
                          System.out.println("Empresa cadastrada como atividade 5!");
                          atividades [5] = true;
                     break;
                     case 6:
                          System.out.println("Empresa cadastrada como atividade 6!");
                          atividades [6] = true;
                     break;
                     case 7:
                          System.out.println("Empresa cadastrada como atividade 7!");
                         atividades [7] = true;
                     break;
                     case 8:
                          System.out.println("Empresa cadastrada como atividade 8!");
                          atividades[8] = true;
                     break;
                     case 9:
                          System.out.println("Empresa cadastrada como atividade 9!");
                          atividades[9] = true;
                     break;
                     default:
                         System.out.println("Opção inválida!");
                     break;
                 }
                 }
        

    


















}
