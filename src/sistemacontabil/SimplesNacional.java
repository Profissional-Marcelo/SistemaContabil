package sistemacontabil;


public class SimplesNacional extends TabelaSN{


   public String anx = "";
   public float valor;
   
   public void cadastroSN(){
       cadastroTAB();
       System.out.println("Empresa criada!");
   }
        public void calculoSn(){
        //ANEXO 1
        if(anexos[0] == true && tabela[0]== true){
          System.out.println("Qual seu faturamento esse mês?");
          this.valor = leia.nextFloat();
          System.out.println("Valor da PGDAS esse mês é:" + this.valor*0.04);
                } else if(anexos[0] == true && tabela[1] == true){
               System.out.println("Qual seu faturamento esse mês?");
                    this.valor = leia.nextFloat();
          System.out.println("Valor da PGDAS esse mês é:" + this.valor*0.073);     
                } else if(anexos[0] == true && tabela[2] == true) {
          System.out.println("Qual seu faturamento esse mês?");
                    this.valor = leia.nextFloat();
          System.out.println("Valor da PGDAS esse mês é:" + this.valor*0.095); 
                } else if(anexos[0] == true && tabela[3] == true) {
            System.out.println("Qual seu faturamento esse mês?");
                    this.valor = leia.nextFloat();
          System.out.println("Valor da PGDAS esse mês é:" + this.valor*0.107);          
                     } else if (anexos[0] == true && tabela[4]){
          System.out.println("Qual seu faturamento esse mês?");
                    this.valor = leia.nextFloat();
          System.out.println("Valor da PGDAS esse mês é:" + this.valor*0.143);                 
                    } else if (anexos[0] == true && tabela[5] == true){
                        System.out.println("Qual seu faturamento esse mês?");
                    this.valor = leia.nextFloat(); 
          System.out.println("Valor da PGDAS esse mês é:" + this.valor*0.19);
                    }  else{
                        System.out.println("Ainda está indisponivel, aguarde as novas atualizações...");
                    }
        
           
    }
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

