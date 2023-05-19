package sistemacontabil;
public class LucroPresumido extends AtividadesLP{
    public float valor, trimestre; 
    
    
    public void cadastroLP(){
       cadastroATV();
        System.out.println("Empresa criada como Lucro Presumido!");
    }
    
    public void calculoLp(){
         if(lucroPresumido == true){
            System.out.println("Qual seu faturamento esse mês?");
            this.valor = leia.nextFloat();
            System.out.println("Qual a soma de seu faturamento nos últimos três meses?");
            this.trimestre = leia.nextFloat();
            
            if (atividades [0] == true){
                this.trimestre = (float) (this.trimestre*0.016);
            }
            
            System.out.println("Seu resultado é:");
            System.out.println("PIS: R$ "+this.valor*0.0065);
            System.out.println("COFINS: R$ "+this.valor*0.03);
            System.out.println("CSS: R$ "+this.trimestre*0.09);
            System.out.println("IRPJ: R$ "+this.trimestre*0.15);
        }
    }
    
    
    
}
