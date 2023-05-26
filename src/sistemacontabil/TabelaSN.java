package sistemacontabil;
public class TabelaSN extends AnexoSN{
public boolean[] tabela = {false, false, false, false, false, false};
public int tabelaSelecionada;



        public void cadastroTAB(){
        cadastroANX();
            System.out.println("Selecione a tabela correspondente:");
            System.out.println("1- Até R$ 180.000,00\n2- Até R$ 360.000,00\n3- Até R$ 720.000,00\n4- Até R$ 1.800.000,00\n5- Até R$ 3.600.000,00\n6- Até R$ 4.800.000,00");
            System.out.println("\nValores correspondentes ao total do faturamento da empresa nos últimos doze meses!");
            tabelaSelecionada = leia.nextInt();
            switch(tabelaSelecionada){
                case 1:
                    System.out.println("Empresa cadastrada como 'Tabela 1'");
                    tabela [0] = true;
                break;
                case 2:
                    System.out.println("Empresa cadastrada como 'Tabela 2'");
                    tabela [1] = true;
                break;
                case 3:
                    System.out.println("Empresa cadastrada como 'Tabela 3'");
                    tabela [2] = true;
                break;
                case 4:
                    System.out.println("Empresa cadastrada como 'Tabela 4'");
                    tabela [3] = true;
                break;
                case 5:
                    System.out.println("Empresa cadastrada como 'Tabela 5'");
                    tabela [4] = true;
                break;
                case 6:
                    System.out.println("Empresa cadastrada como 'Tabela 6'");
                    tabela [4] = true;
                break;
                default: 
                    System.out.println("Opção inválida!");
                break;
            }
        }
    
    
    
    
    
    
}






    

