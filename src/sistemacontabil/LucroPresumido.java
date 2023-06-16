package sistemacontabil;
public class LucroPresumido extends Empresa {
    private int atividade;
    private double recTri; 
    public LucroPresumido(String nome, String cnpj, double receita, int rt, String senha, int atividade, double recTri) {
        super(nome, cnpj, receita, rt, senha);
        this.atividade = atividade;
        this.recTri = recTri;
    }

    @Override
    public void calcularImposto() {
        if(getRt() == 2){
            if (atividade == 1){
                this.recTri = (double) (this.recTri*0.016);
            }else if(atividade == 2){
                this.recTri = (double) (this.recTri*0.08);
            } else{
            System.out.println("Ainda está indisponivel, aguarde as novas atualizações...");
            }  
            
            System.out.println("Seu resultado é:");
            System.out.println("PIS: R$ "+getReceita()*0.0065);
            System.out.println("COFINS: R$ "+getReceita()*0.03);
            System.out.println("CSS: R$ "+getReceita()*0.09);
            System.out.println("IRPJ: R$ "+getReceita()*0.15);
        } 
         
    }
    }
    
