package sistemacontabil;
import java.util.Scanner;
public class LucroPresumido {
      private float valor,aliquota,pis,cofins,trimestrais;
      //Atributos
    Scanner leia = new Scanner(System.in);
      //Metodos
          public void calculops() {
          System.out.println("Informe o valor do seu faturamento(Considere apenas as notas sem retenções):");
          this.valor = leia.nextInt();
          System.out.println("Resumo:\nPIS:"+valor*0.0065);
          System.out.println("Resumo:\nCOFINS:"+valor*0.03);                        
          System.out.println("Agora informe o valor do seu faturamento nos últimos três meses\n(lembrando que o sistema ainda não está pronto para empresas que possuem retenções!)");
          this.trimestrais = leia.nextFloat();
          System.out.println("Resumo:\nCSLL:"+trimestrais*0.09);
          System.out.println("Resumo:\nCSLL:"+trimestrais*0.15);
          }












}
