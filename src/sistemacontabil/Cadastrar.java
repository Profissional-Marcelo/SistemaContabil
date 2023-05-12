
package sistemacontabil;
import java.util.Scanner;
public class Cadastrar{
  //Atributos
   Scanner leia = new Scanner(System.in);
   private float valor, trimestre;
   private String nome;
   private int cnpj, rt, tabelaSelecionada;
   private boolean sn = false, lp = false, lr = false, la = false;
   public boolean[] anexo = {false, false, false, false, false, false};
   public boolean[] tabela = {false, false, false, false, false, false};
   public String anx = "";
   public String tab = "";

    public void calculoSn(){
      
        //ANEXO 1
        if(anexo[0] == true && tabela[0]== true){
          System.out.println("Qual seu faturamento esse mês?");
          this.valor = leia.nextFloat();
          System.out.println("Valor da PGDAS esse mês é:" + this.valor*0.04);
                } else if(anexo[0] == true && tabela[1] == true){
               System.out.println("Qual seu faturamento esse mês?");
                    this.valor = leia.nextFloat();
          System.out.println("Valor da PGDAS esse mês é:" + this.valor*0.073);     
                } else if(anexo[0] == true && tabela[2] == true) {
          System.out.println("Qual seu faturamento esse mês?");
                    this.valor = leia.nextFloat();
          System.out.println("Valor da PGDAS esse mês é:" + this.valor*0.095); 
                } else if(anexo[0] == true && tabela[3] == true) {
            System.out.println("Qual seu faturamento esse mês?");
                    this.valor = leia.nextFloat();
          System.out.println("Valor da PGDAS esse mês é:" + this.valor*0.107);          
                     } else if (anexo[0] == true && tabela[4]){
          System.out.println("Qual seu faturamento esse mês?");
                    this.valor = leia.nextFloat();
          System.out.println("Valor da PGDAS esse mês é:" + this.valor*0.143);                 
                    } else if (anexo[0] == true && tabela[5] == true){
                        System.out.println("Qual seu faturamento esse mês?");
                    this.valor = leia.nextFloat(); 
          System.out.println("Valor da PGDAS esse mês é:" + this.valor*0.19);
                    }  else{
                        System.out.println("Ainda está indisponivel, aguarde as novas atualizações...");
                    }
        
        //ANEXO 2      
    }
    
    public void calculoLp(){
        if(this.lp == true){
            System.out.println("Qual seu faturamento esse mês?");
            this.valor = leia.nextFloat();
            System.out.println("Qual a soma de seu faturamento nos últimos três meses?");
            this.trimestre = leia.nextFloat();
            System.out.println("Seu resultado é:");
            System.out.println("PIS: R$ "+this.valor*0.0065);
            System.out.println("COFINS: R$ "+this.valor*0.03);
            System.out.println("CSS: R$ "+this.trimestre*0.09);
            System.out.println("IRPJ: R$ "+this.trimestre*0.15);
        }
    }
    
      
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getRt() {
        return rt;
    }

    public void setRt(int rt) {
        this.rt = rt;
    }

    public Scanner getLeia() {
        return leia;
    }

    public void setLeia(Scanner leia) {
        this.leia = leia;
    }

    public boolean getSn() {
        return sn;
    }

    public void setSn(boolean sn) {
        this.sn = sn;
    }

    public boolean getLp() {
        return lp;
    }

    public void setLp(boolean lp) {
        this.lp = lp;
    }

    public boolean getLr() {
        return lr;
    }

    public void setLr(boolean lr) {
        this.lr = lr;
    }

    public boolean getLa() {
        return la;
    }

    public void setLa(boolean la) {
        this.la = la;
    }

    public int getTabelaSelecionada() {
        return tabelaSelecionada;
    }

    public void setTabelaSelecionada(int tabelaSelecionada) {
        this.tabelaSelecionada = tabelaSelecionada;
    }
    
    
        public void registro() {
            if (sn == true){
               calculoSn();
            }
            else if (lp == true){
                calculoLp();
            } else if (lr == true){
              System.out.println("Serviço ainda indisponível, aguarde novas atualizações!");
            } else if (la == true){
                System.out.println("Serviço ainda indisponível, aguarde novas atualizações!");
            }
        }
    
    
         public void cadastrar(){
         System.out.println("=== Bem vindo ao software contábil (v 0.0.4) ===");
         System.out.println("Para iniciar o cadastro escreva o nome da sua empresa!");
         setNome(leia.nextLine());
         System.out.println("Digite seu CNPJ");
         setCnpj(leia.nextInt());
         System.out.println("=== Informe o regime tributário da empresa! ===");
         System.out.println("|1| Simples Nacional");
         System.out.println("|2| Lucro Presumido");
         System.out.println("|3| Lucro Real");
         System.out.println("|4| Lucro Arbitrado");
            setRt(leia.nextInt());
         switch(getRt()){
             case 1: 
                 setSn(true);
                 System.out.println("=== Informe o anexo correspondente a sua empresa: ===");
                 System.out.println("|1| Anexo I");
                 System.out.println("|2| Anexo II");
                 System.out.println("|3| Anexo III");
                 System.out.println("|4| Anexo IV");
                 System.out.println("|5| Anexo V");
                int anexoSelecionado = leia.nextInt();
            switch(anexoSelecionado) {
                case 1:
                    anexo[0] = true;
                        System.out.println("Qual seu faturamento total dos últimos doze meses?");
                        System.out.println("1- Até R$ 180.000,00\n2- Até R$ 360.000,00\n3- Até R$720.000,00\n 4- Até R$ 1.800.000,00\n 5- Até R$ 3.600.000,00\n 6- R$ 4.800.000,00");   
                            tabelaSelecionada = leia.nextInt();
                            switch(tabelaSelecionada){
                                case 1:    
                            System.out.println("Empresa criada!\nAnexo: I\nTabela: I");
                            tabela[0] = true;
                            this.anx = "1";
                            this.tab = "1";
                            break;
                                case 2:
                                    System.out.println("Empresa criada!\nAnexo: I\nTabela: II");
                                  tabela[1] = true; 
                                  this.anx = "1";
                                  this.tab = "2";
                                break;
                                case 3: 
                                    System.out.println("Empresa criada!\nAnexo: I\nTabela: III");
                                   tabela[2] = true;
                                   this.anx = "1";
                                   this.tab = "3";
                                break;
                                case 4:
                                    System.out.println("Empresa Criada!\nAnexo: I\nTabela: IV");
                                    tabela[3] = true;
                                    this.anx = "1";
                                    this.tab = "4";
                                break;
                                case 5:
                                     System.out.println("Empresa Criada!\nAnexo: I\nTabela: V");
                                     tabela[4] = true;
                                    this.anx = "1";
                                    this.tab = "5";
                                case 6: 
                                    System.out.println("Empresa Criada!\nAnexo: I\nTabela: VI");
                                    tabela[5] = true;
                                    this.anx = "1";
                                    this.tab = "6";
                                break;
                            }
                    break;
                case 2:
                    anexo[1] = true;
                        System.out.println("Qual seu faturamento total dos últimos doze meses?");
                        System.out.println("1- Até R$ 180.000,00\n2- Até R$ 360.000,00\n3- Até R$720.000,00\n 4- Até R$ 1.800.000,00\n 5- Até R$ 3.600.000,00\n 6- R$ 4.800.000,00");
                          tabelaSelecionada = leia.nextInt();
                          switch(tabelaSelecionada){
                                case 1:    
                            System.out.println("Empresa criada!\nAnexo: II\nTabela: I");
                            tabela[0] = true;
                            this.anx = "2";
                            this.tab = "1";
                            break;
                                case 2:
                                    System.out.println("Empresa criada!\nAnexo: II\nTabela: II");
                                  tabela[1] = true; 
                                  this.anx = "2";
                                  this.tab = "2";
                                break;
                                case 3: 
                                    System.out.println("Empresa criada!\nAnexo: II\nTabela: III");
                                   tabela[2] = true;
                                   this.anx = "2";
                                   this.tab = "3";
                                break;
                                case 4:
                                    System.out.println("Empresa Criada!\nAnexo: II\nTabela: IV");
                                    tabela[3] = true;
                                    this.anx = "2";
                                    this.tab = "4";
                                break;
                                case 5:
                                     System.out.println("Empresa Criada!\nAnexo: II\nTabela: V");
                                     tabela[4] = true;
                                    this.anx = "2";
                                    this.tab = "5";
                                case 6: 
                                    System.out.println("Empresa Criada!\nAnexo: II\nTabela: VI");
                                    tabela[5] = true;
                                    this.anx = "2";
                                    this.tab = "6";
                                break;
                            }
                    break;
                case 3:
                    anexo[2] = true;
                        System.out.println("Qual seu faturamento total dos últimos doze meses?");
                        System.out.println("1- Até R$ 180.000,00\n2- Até R$ 360.000,00\n3- Até R$720.000,00\n 4- Até R$ 1.800.000,00\n 5- Até R$ 3.600.000,00\n 6- R$ 4.800.000,00");
                        tabelaSelecionada = leia.nextInt();
                        switch(tabelaSelecionada){
                                case 1:    
                            System.out.println("Empresa criada!\nAnexo: III\nTabela: I");
                            tabela[0] = true;
                            this.anx = "3";
                            this.tab = "1";
                            break;
                                case 2:
                                    System.out.println("Empresa criada!\nAnexo: III\nTabela: II");
                                  tabela[1] = true; 
                                  this.anx = "3";
                                  this.tab = "2";
                                break;
                                case 3: 
                                    System.out.println("Empresa criada!\nAnexo: III\nTabela: III");
                                   tabela[2] = true;
                                   this.anx = "3";
                                   this.tab = "3";
                                break;
                                case 4:
                                    System.out.println("Empresa Criada!\nAnexo: III\nTabela: IV");
                                    tabela[3] = true;
                                    this.anx = "3";
                                    this.tab = "4";
                                break;
                                case 5:
                                     System.out.println("Empresa Criada!\nAnexo: III\nTabela: V");
                                     tabela[4] = true;
                                    this.anx = "3";
                                    this.tab = "5";
                                case 6: 
                                    System.out.println("Empresa Criada!\nAnexo: III\nTabela: VI");
                                    tabela[5] = true;
                                    this.anx = "3";
                                    this.tab = "6";
                                break;
                            }
                        break;
                case 4:
                    anexo[3] = true;
                        System.out.println("Qual seu faturamento total dos últimos doze meses?");
                        System.out.println("1- Até R$ 180.000,00\n2- Até R$ 360.000,00\n3- Até R$720.000,00\n 4- Até R$ 1.800.000,00\n 5- Até R$ 3.600.000,00\n 6- R$ 4.800.000,00");
                        tabelaSelecionada = leia.nextInt();
                        switch(tabelaSelecionada){
                                case 1:    
                            System.out.println("Empresa criada!\nAnexo: IV\nTabela: I");
                            tabela[0] = true;
                            this.anx = "4";
                            this.tab = "1";
                            break;
                                case 2:
                                    System.out.println("Empresa criada!\nAnexo: IV\nTabela: II");
                                  tabela[1] = true; 
                                  this.anx = "4";
                                  this.tab = "2";
                                break;
                                case 3: 
                                    System.out.println("Empresa criada!\nAnexo: IV\nTabela: III");
                                   tabela[2] = true;
                                   this.anx = "4";
                                   this.tab = "3";
                                break;
                                case 4:
                                    System.out.println("Empresa Criada!\nAnexo: IV\nTabela: IV");
                                    tabela[3] = true;
                                    this.anx = "4";
                                    this.tab = "4";
                                break;
                                case 5:
                                     System.out.println("Empresa Criada!\nAnexo: IV\nTabela: V");
                                     tabela[4] = true;
                                    this.anx = "4";
                                    this.tab = "5";
                                case 6: 
                                    System.out.println("Empresa Criada!\nAnexo: IV\nTabela: VI");
                                    tabela[5] = true;
                                    this.anx = "4";
                                    this.tab = "6";
                                break;
                            }
                        break;
                case 5:
                    anexo[4] = true;
                        System.out.println("Qual seu faturamento total dos últimos doze meses?");
                        System.out.println("1- Até R$ 180.000,00\n2- Até R$ 360.000,00\n3- Até R$720.000,00\n 4- Até R$ 1.800.000,00\n 5- Até R$ 3.600.000,00\n 6- R$ 4.800.000,00");
                    tabelaSelecionada = leia.nextInt();
                    switch(tabelaSelecionada){
                                case 1:    
                            System.out.println("Empresa criada!\nAnexo: V\nTabela: I");
                            tabela[0] = true;
                            this.anx = "5";
                            this.tab = "1";
                            break;
                                case 2:
                                    System.out.println("Empresa criada!\nAnexo: V\nTabela: II");
                                  tabela[1] = true; 
                                  this.anx = "5";
                                  this.tab = "2";
                                break;
                                case 3: 
                                    System.out.println("Empresa criada!\nAnexo: V\nTabela: III");
                                   tabela[2] = true;
                                   this.anx = "5";
                                   this.tab = "3";
                                break;
                                case 4:
                                    System.out.println("Empresa Criada!\nAnexo: V\nTabela: IV");
                                    tabela[3] = true;
                                    this.anx = "5";
                                    this.tab = "4";
                                break;
                                case 5:
                                     System.out.println("Empresa Criada!\nAnexo: V\nTabela: V");
                                     tabela[4] = true;
                                    this.anx = "5";
                                    this.tab = "5";
                                case 6: 
                                    System.out.println("Empresa Criada!\nAnexo: V\nTabela: VI");
                                    tabela[5] = true;
                                    this.anx = "5";
                                    this.tab = "6";
                                break;
                            }
                        break;
                default:
                    System.out.println("Anexo inválido!");
                    tabelaSelecionada = leia.nextInt();
                    break;
                                    }
             break;
             case 2:
                 System.out.println("Empresa registrada como Lucro Presumido!");
                 setLp(true);
            break;
             case 3:
                 System.out.println("Empresa registrada como Lucro Real!");
                 setLr(true);
            break;
             case 4:
                 System.out.println("Empresa registrada como Lucro Arbitrado!");
             break;
             default:
                System.out.println("Opção inválida!");
                break;
         }      
         
         
         
         
         
         
         
         
         
         
         
     }
         
         
         
    
} 
    

        
        
        
    
    

    
