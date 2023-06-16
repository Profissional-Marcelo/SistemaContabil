/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacontabil;

/**
 *
 * @author conta
 */
public final class SimplesNacional extends Empresa {
    private int anexo, tabela;
    private double recDoze;

    public int getAnexo() {
        return anexo;
    }

    public void setAnexo(int anexo) {
        this.anexo = anexo;
    }

    public int getTabela() {
        return tabela;
    }

    public void setTabela(int tabela) {
        this.tabela = tabela;
    }

    public double getRecDoze() {
        return recDoze;
    }

    public void setRecDoze(double recDoze) {
        this.recDoze = recDoze;
    }
    
    
    
    public SimplesNacional(String nome, String cnpj, double receita, int rt, String senha, int anexo, int tabela, double recDoze) {
        super(nome, cnpj, receita, rt, senha);
        setAnexo(anexo);
        setTabela(tabela);
        setRecDoze(recDoze);
        
    }

    @Override
    public void calcularImposto() {
            if(anexo == 1 && tabela == 1){
          System.out.println("Valor da PGDAS esse mês é:" + getReceita()*0.04);
                } else if(anexo == 1 && tabela == 2){
          System.out.println("Valor da PGDAS esse mês é:" + getReceita()*0.073);   
                } else if(anexo == 1 && tabela == 3) {
          System.out.println("Valor da PGDAS esse mês é:" + getReceita()*0.095);
                } else if(anexo == 1 && tabela == 4) {
          System.out.println("Valor da PGDAS esse mês é:" + getReceita()*0.107);          
                } else if (anexo == 1 && tabela == 5){
          System.out.println("Valor da PGDAS esse mês é:" + getReceita()*0.143);                 
                } else if (anexo == 1 && tabela == 6){
          System.out.println("Valor da PGDAS esse mês é:" + getReceita()*0.19);
                    }  
        //ANEXO 2
            if(anexo == 2 && tabela == 1){   
          System.out.println("Valor da PGDAS esse mês é:" + getReceita()*0.045);
                } else if(anexo == 2 && tabela == 2){
          System.out.println("Valor da PGDAS esse mês é:" + getReceita()*0.078);
                } else if(anexo == 2 && tabela == 3){
          System.out.println("Valor da PGDAS esse mês é:" + getReceita()*0.10);
                } else if(anexo == 2 && tabela == 4){
          System.out.println("Valor da PGDAS esse mês é:" + getReceita()*0.112);
                } else if(anexo == 2 && tabela == 5){
          System.out.println("Valor da PGDAS esse mês é:" + getReceita()*0.147);
                } else if(anexo == 2 && tabela == 6){
          System.out.println("Valor da PGDAS esse mês é:" + getReceita()*0.3);
        } else{
            System.out.println("Ainda está indisponivel, aguarde as novas atualizações...");
        }
           
    }
    
    }
    
    
    
