package sistemacontabil;
import java.util.Scanner;
public class LucroPresumido {
      public float valor,aliquota,pis,cofins,csll,irpj;
      //Atributos
    Scanner leia = new Scanner(System.in);

    
      //Metodos
          public void calculops() {
          System.out.println("Informe o valor do seu faturamento(Considere apenas as notas sem retenções):");
          this.valor = leia.nextInt();
          System.out.println("Resumo:\nPIS:"+valor*0.0065);
          System.out.println("Resumo:\nCOFINS:"+valor*0.3);                        
          
          
          }












}
