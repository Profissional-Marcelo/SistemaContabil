




package sistemacontabil;
import java.util.Scanner;
public class Cadastrar {
Scanner leia = new Scanner(System.in);
LucroPresumido lpclass = new LucroPresumido();
private String nome, cnpj;
private int opcao;
public boolean lp=false, sn=false, lr=false;


    public LucroPresumido getLpclass() {
        return lpclass;
    }

    public void setLpclass(LucroPresumido lpclass) {
        this.lpclass = lpclass;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getOpcao() {
        return opcao;
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    public boolean isLp() {
        return lp;
    }

    public void setLp(boolean lp) {
        this.lp = lp;
    }

    public boolean isSn() {
        return sn;
    }

    public void setSn(boolean sn) {
        this.sn = sn;
    }

    public boolean isLr() {
        return lr;
    }

    public void setLr(boolean lr) {
        this.lr = lr;
    }
  

        
    public void cadastrar(){
        System.out.println("Bem vindo! Primeiramente informe seu nome!");
        setNome(leia.next());
        System.out.println("Perfeito... Agora informe seu cnpj!");
        setCnpj(leia.next());
        System.out.println("Ótimo... Agora informe a opção correspondente a seu Regime Tributario!\n1-Simples Nacional\n2-Lucro Presumido\n3-Lucro Real");
        opcao = leia.nextInt();
        switch(opcao){
            case 1: System.out.println("Serviço em manutenção... Tente novamente mais tarde");
            break;
            case 2: System.out.println("Adicionado!");
                    setLp(true);
            break;
            case 3: System.out.println("Serviço em manutenção... Tente novamente mais tarde");
            break;            
                    }
             
                        }
        
    public void calcular(){
        if(lp == true)
        {
            lpclass.calculops();
        }
       else{
           System.out.println("Operação Incorreta.");
        }
        
        
        
        
    }
        
        
    }    
        
    



    

