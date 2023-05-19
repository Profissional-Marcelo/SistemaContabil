package sistemacontabil;

import java.util.Scanner;

public class AnexoSN {
  boolean simplesNacional = false;
  public boolean[] anexos = {false, false, false, false, false};
  int escolha;
  
  Scanner leia = new Scanner(System.in);
    public boolean getSimplesNacional() {
        return simplesNacional;
    }

    public void setSimplesNacional(boolean simplesNacional) {
        this.simplesNacional = simplesNacional;
    }
    
  
  
    public void cadastroANX(){
        setSimplesNacional(true);
                 System.out.println("=== Informe o anexo correspondente a sua empresa: ===");
                 System.out.println("|1| Anexo I");
                 System.out.println("|2| Anexo II");
                 System.out.println("|3| Anexo III");
                 System.out.println("|4| Anexo IV");
                 System.out.println("|5| Anexo V");
                 escolha = leia.nextInt();
                 switch (escolha){
                     case 1: 
                         System.out.println("Empresa cadastrada como anexo 1!");
                         anexos [0] = true;
                     break;
                     case 2:
                         System.out.println("Empresa cadastrada como anexo 2!");
                         anexos [1] = true;
                     break;
                     case 3:
                         System.out.println("Empresa cadastrada como anexo 3!");
                         anexos [2] = true;
                     break;
                     case 4: 
                         System.out.println("Empresa cadastrada como anexo 4!");
                         anexos [3] = true;
                     break;
                     case 5:
                         System.out.println("Empresa cadastrada como anexo 5!");
                         anexos [4] = true;
                     break;
                     default: 
                         System.out.println("Opção inválida!");
                     break;
                 }
                 }
        
        
        
        
    }
    
    
    
    

