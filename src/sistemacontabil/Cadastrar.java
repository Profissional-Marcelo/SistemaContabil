
package sistemacontabil;
import java.util.Scanner;
public class Cadastrar {
Scanner leia = new Scanner(System.in);
LucroPresumido lpclass = new LucroPresumido();
private String nome, cnpj;
private int opcao;
public boolean lp=false, sn, lr;
  
    
        
    public void cadastrar(){
        System.out.println("Bem vindo! Primeiramente informe seu nome!");
        nome = leia.next();
        System.out.println("Perfeito... Agora informe seu cnpj!");
        cnpj = leia.next();
        System.out.println("Ótimo... Agora informe a opção correspondente a seu Regime Tributario!\n1-Simples Nacional\n2-Lucro Presumido\n3-Lucro Real");
        opcao = leia.nextInt();
        switch(opcao){
            case 1: System.out.println("Serviço em manutenção... Tente novamente mais tarde");
            break;
            case 2: System.out.println("Adicionado!");
                    lp = true;
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
        
    



    

