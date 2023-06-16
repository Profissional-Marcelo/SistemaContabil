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
import java.util.ArrayList;
import java.util.Scanner;
public class SistemaContabil {
    public static void main(String[] args) {
        //Scanner
        Scanner ss = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        
        // Variáveis
        boolean sairMenuPrincipal = true;
        String senha, cnpj, nome;
        int rt, anexo, tabela, atividade;
        double receita, recDoze, recTri;
        
        // Array list
        ArrayList<SimplesNacional> clientesn = new ArrayList();
        ArrayList<LucroPresumido> clientelp = new ArrayList();
        ArrayList<LucroReal> clientelr = new ArrayList();
        
        do{
            //Menu Principal
            System.out.println("###############\nV - 0.0.7"); 
            System.out.println("1 - Simples Nacional");
            System.out.println("2 - Lucro Presumido");
            System.out.println("3 - Lucro Real");
            System.out.println("4 - Saír");
            int menu = sn.nextInt();
            switch(menu) {
                case 1: 
                    System.out.println("Você já tem cadastro?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");
                    int opcaocadastro = sn.nextInt();
               
                    if(opcaocadastro == 1){
                        //Verificador de clientes
                        if (clientesn.isEmpty() == true){
                            System.out.println("===========================");
                            System.out.println("Não há clientes cadastrados");
                            System.out.println("===========================");
                        break;
                        }
                        
                        boolean sairMenuSn = true;
                        boolean sairPainelSn = true;
                        do {
                            System.out.println("Informe o cnpj da empresa:");
                            cnpj = ss.nextLine();
                            System.out.println("Informe a senha da empresa");
                            senha = ss.nextLine();
                            for (SimplesNacional x : clientesn){
                             if (cnpj.equals(x.getCnpj()) && senha.equals(x.getSenha())) {
                                 System.out.println("Painel aberto para a empresa:" + x.getNome());
                                do {
                                    System.out.println("====== Painel da empresa" + x.getNome() + "=====");
                                    System.out.println("1 - Calcular imposto"); 
                                    System.out.println("2 - Fechar painel");
                                    int resp = sn.nextInt();
                                    
                                    switch (resp) {
                                        case 1:
                                           for(SimplesNacional s: clientesn){
                                               s.calcularImposto();
                                           }
                                        break;
                                        case 2:
                                        sairPainelSn = false;
                                        sairMenuSn = false;
                                        break;
                                        default:
                                        break;
                                    }
                                }while(sairPainelSn == true);
                             } else {
                                 System.out.println("CNPJ ou senha inválidos ou não cadastrado");
                                 System.out.println("Quer tentar novamente? 1 - Sim\n2- Não");
                                 int resp = sn.nextInt();
                                 switch(resp) {
                                     case 1:
                                         sairMenuSn = true;
                                     break;
                                     case 2: 
                                         sairMenuSn = false;
                                     break;
                                     default:
                                         System.out.println("Opção inválida");
                                     break;
                                 }
                             }
                            }
                        }while (sairMenuSn == true);
                    }else if(opcaocadastro == 2){
                        //Cadastro de empresa SN
                        rt = 1;
                    System.out.println("Nome:");
                    nome = ss.nextLine();
                    System.out.println("CNPJ");
                    cnpj = ss.nextLine();
                    System.out.println("Receita:");
                    receita = sn.nextDouble();
                            System.out.println("###Informe o anexo correspondente a sua empresa:###");
                            System.out.println("|1| Anexo I");
                            System.out.println("|2| Anexo II");
                            System.out.println("|3| Anexo III");
                            System.out.println("|4| Anexo IV");
                            System.out.println("|5| Anexo V");
                            System.out.println("");
                            System.out.println("=====================================================");
                            System.out.println("Anexo I: empresas de comércio (lojas em geral)");
                            System.out.println("");
                            System.out.println("Anexo II: fábricas/indústrias e empresas industriais");
                            System.out.println("");
                            System.out.println("Anexo III: empresas que oferecem serviços de instalação,");
                            System.out.println("de reparos e de manutenção. Consideram-se neste anexo ainda,");
                            System.out.println("agências de viagens, escritórios de contabilidade, academias,");
                            System.out.println("laboratórios, empresas de medicina e odontologia.");
                            System.out.println("");
                            System.out.println("Anexo IV:  empresas que fornecem serviço de limpeza,");
                            System.out.println("vigilância, obras, construção de imóveis, serviços advocatícios");
                            System.out.println("");
                            System.out.println("Anexo V: empresas que fornecem serviço de auditoria,");
                            System.out.println(" jornalismo, tecnologia, publicidade, engenharia, entre outros");
                            System.out.println("=====================================================");
                            anexo = sn.nextInt();
                           int a = 0;
                            while(a == 0){
                                if(anexo > 0 && anexo<6){
                              a = 1;   
                            } else {
                                    System.out.println("Resposta incorreta! Tente novamente");
                                    anexo = sn.nextInt();
                                }
                            }
                             System.out.println("Escreva seu faturamento nos últimos doze meses de empresa:");
                             recDoze = sn.nextDouble();
                             tabela = 0;
                             
                             if(recDoze <= 180000.00){
                                 tabela = 1;
                                 System.out.println("Sua empresa foi cadastrada como tabela:" + tabela);
                             
                             } else if(recDoze > 180000.00 && recDoze <=360000.00){
                                 tabela = 2;
                                System.out.println("Sua empresa foi cadastrada como tabela:" + tabela);
                             } else if(recDoze > 360000.00 && recDoze <= 720000.00){
                                 tabela = 3;
                                 System.out.println("Sua empresa foi cadastrada como tabela:" + tabela);
                             } else if(recDoze > 720000.00 && recDoze <=1800000.00){
                                  tabela = 4;
                                  System.out.println("Sua empresa foi cadastrada como tabela:" + tabela);
                             } else if(recDoze > 1800000.00 && recDoze <=3600000.00){
                                 tabela = 5;
                                 System.out.println("Sua empresa foi cadastrada como tabela:" + tabela);
                             } else if (recDoze >= 3600000.00){
                                 tabela = 6;
                                  System.out.println("Sua empresa foi cadastrada como tabela:" + tabela);
                             }
                             System.out.println("Crie sua senha:");
                             senha = ss.nextLine();
                             // Criando objeto da empresaSN
                             SimplesNacional sn1 = new SimplesNacional(nome, cnpj, receita, rt, senha, anexo, tabela, recDoze);
                             //Adicionando ao arrayList
                             clientesn.add(sn1);    
                                           }else{
                        System.out.println("Opção inválida, digite uma opção válida.");
                    }
                 break;
                case 2: 
                       System.out.println("Você já tem cadastro?");
                    System.out.println("[1] - Sim");
                    System.out.println("[2] - Não");
                    opcaocadastro = sn.nextInt();  
                    
                            if(opcaocadastro == 2){
                                //cadastro LucroPresumido
                                rt = 2;
                                System.out.println("Nome:");
                                  nome = ss.nextLine();
                                 System.out.println("CNPJ");
                                  cnpj = ss.nextLine();
                                 System.out.println("Receita:");
                                 receita = sn.nextDouble();
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
                 int escolha = sn.nextInt();
                 atividade = 10000;
                 switch (escolha){
                     case 0:
                          System.out.println("Empresa cadastrada como atividade 0!");
                          atividade = 0;
                     break;
                     case 1: 
                          System.out.println("Empresa cadastrada como atividade 1!");
                          atividade = 1;
                     break;
                     case 2:
                          System.out.println("Empresa cadastrada como atividade 2!");
                          atividade = 2;
                     break;
                     case 3:
                          System.out.println("Empresa cadastrada como atividade 3!");
                          atividade = 3;
                     break;
                     case 4: 
                          System.out.println("Empresa cadastrada como atividade 4!");
                          atividade = 4;
                     break;
                     case 5:
                          System.out.println("Empresa cadastrada como atividade 5!");
                          atividade = 5;
                     break;
                     case 6:
                          System.out.println("Empresa cadastrada como atividade 6!");
                          atividade = 6;
                     break;
                     case 7:
                          System.out.println("Empresa cadastrada como atividade 7!");
                         atividade = 7;
                     break;
                     case 8:
                          System.out.println("Empresa cadastrada como atividade 8!");
                          atividade = 8;
                     break;
                     case 9:
                          System.out.println("Empresa cadastrada como atividade 9!");
                          atividade = 9;
                     break;
                     default:
                         System.out.println("Opção inválida!");
                     break;
                 }
                 System.out.println("Informe sua receita nos últimos três meses");
                 recTri = sn.nextDouble();
                 System.out.println("Crie sua senha:");
                             senha = ss.nextLine();
                 
                 // Criando objeto de empresa LucroPresumido
                 LucroPresumido lp1 = new LucroPresumido(nome, cnpj, receita, rt, senha, atividade, recTri);
                 
                 // Adicionando no ArrayList do LucroPreusmido
                 clientelp.add(lp1);
                 
                            }else if(opcaocadastro == 1){
                                if(clientelp.isEmpty() == true){
                                  System.out.println("================================");
                            System.out.println("Nao há clientes cadastrados.");
                            System.out.println("================================");
                            break;
                        }  
                        
                        boolean sairPainelLp = true;
                        boolean sairMenuLp = true;
                        do {
                            System.out.println("Informe o cnpj:");
                            cnpj = ss.nextLine();
                            System.out.println("Informe a senha:");
                            senha = ss.nextLine();
                           
                            for (LucroPresumido x : clientelp){
                                
                                if (cnpj.equals(x.getCnpj()) && senha.equals(x.getSenha())){
                                    System.out.println("Painel da empresa" + x.getNome());
                             do {
                                 System.out.println("Painel de" + x.getNome());
                                 System.out.println("1 - Calcular imposto");
                                 System.out.println("2 - Fechar painel");
                                 int resp = sn.nextInt();
                                 switch(resp) {
                                     case 1:
                                           for(LucroPresumido l: clientelp){
                                               l.calcularImposto();
                                           }
                                     break;
                                     case 2:
                                         sairPainelLp = false;
                                         sairMenuLp = false;
                                     break;
                                     default:
                                         System.out.println("Opção inválida tente novamente");
                                     break;
                                 }
                                 
                             } while (sairPainelLp == true);
                             
                             } else {
                                    System.out.println("Usuário e senha inválidos!");
                                    System.out.println("Quer tentar novamente?\n1-Sim\n2-Não");
                                    int resp = sn.nextInt();
                                    switch(resp) {
                                        case 1:
                                            sairMenuLp = true;
                                        break;
                                        case 2:
                                            sairMenuLp = false;
                                        break;
                                        default:
                                            System.out.println("Opção inválida.");
                                        break;
                                    }
                                }   
                            }
                    } while (sairMenuLp == true);
            }
            break;
                case 3:
                break;
                case 4: 
                    System.out.println("Fechando o programa...");
                    sairMenuPrincipal = false;
                break;
                default:
                 break;
            }
    
        }while (sairMenuPrincipal == true);  
        
        
                    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    