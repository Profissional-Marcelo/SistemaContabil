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
                 escolha = leia.nextInt();
                 switch (escolha){
                     case 1: 
                         System.out.println("Empresa cadastrada como anexo I - Comércio");
                         anexos [0] = true;
                     break;
                     case 2:
                         System.out.println("Empresa cadastrada como anexo II - Indústria");
                         anexos [1] = true;
                     break;
                     case 3:
                         System.out.println("Empresa cadastrada como anexo III - Prestador de serviço");
                         anexos [2] = true;
                     break;
                     case 4: 
                         System.out.println("Empresa cadastrada como anexo IV - Prestador de serviço");
                         anexos [3] = true;
                     break;
                     case 5:
                         System.out.println("Empresa cadastrada como anexo V - Prestador de serviço");
                         anexos [4] = true;
                     break;
                     default: 
                         System.out.println("Opção inválida!");
                     break;
                 }
                 }
        
        
        
        
    }
    
    
    
    

