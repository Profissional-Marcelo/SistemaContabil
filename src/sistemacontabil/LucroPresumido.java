package sistemacontabil;
import java.util.Scanner;
public class LucroPresumido {
      private float valor,trimestrais;
      //Atributos
    Scanner leia = new Scanner(System.in);
      //Metodos

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getTrimestrais() {
        return trimestrais;
    }

    public void setTrimestrais(float trimestrais) {
        this.trimestrais = trimestrais;
    }
    
          public void calculops() {
          System.out.println("Informe o valor do faturamento nesse mês!:");
          setValor(this.leia.nextInt());                           
          System.out.println("Agora informe o valor do faturamento nos últimos três meses!");
          setTrimestrais(leia.nextFloat());
          System.out.println("====Resumo:====\nPIS: R$ "+getValor()*0.0065+"\nCOFINS: R$ "+getValor()*0.03+"\nCSLL: R$ "+getTrimestrais()*0.09+"\nIRPJ: R$ "+getTrimestrais()*0.15);              
          }
}
