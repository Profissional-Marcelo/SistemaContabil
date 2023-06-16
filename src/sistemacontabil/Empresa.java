package sistemacontabil;
public abstract class Empresa{
    private String nome, cnpj, senha;
    private double receita;
    private int rt, id;

    
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

    public double getReceita() {
        return receita;
    }

    public void setReceita(double receita) {
        this.receita = receita;
    }

    public int getRt() {
        return rt;
    }

    public void setRt(int rt) {
        this.rt = rt;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    

    public Empresa(String nome, String cnpj, double receita, int rt, String senha) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.receita = receita;
        this.rt = rt;
        this.senha = senha;
    }
    
    
  public abstract void calcularImposto();
  
  
  
}

 
  

    
    
    
    
    
    
    
    
    
    

