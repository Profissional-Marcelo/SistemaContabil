

package sistemacontabil;
import java.util.Scanner;
public class Cadastrar{
  //Atributos
   Scanner leia = new Scanner(System.in);
   private String nome;
   private int cnpj, rt;
   SimplesNacional sn;
   boolean  lp = false, lr = false, la = false;

       
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getRt() {
        return rt;
    }

    public void setRt(int rt) {
        this.rt = rt;
    }

    public Scanner getLeia() {
        return leia;
    }

    public void setLeia(Scanner leia) {
        this.leia = leia;
    }

    public boolean getLp() {
        return lp;
    }

    public void setLp(boolean lp) {
        this.lp = lp;
    }

    public boolean getLr() {
        return lr;
    }

    public void setLr(boolean lr) {
        this.lr = lr;
    }

    public boolean getLa() {
        return la;
    }

    public void setLa(boolean la) {
        this.la = la;
    }
         public void cadastrar(){
         System.out.println("=== Bem vindo ao software contábil (v 0.0.6) ===");
         System.out.println("Para iniciar o cadastro escreva o nome da sua empresa!");
         setNome(leia.nextLine());
         System.out.println("Digite seu CNPJ");
         setCnpj(leia.nextInt());
         System.out.println("=== Informe o regime tributário da empresa! ===");
         System.out.println("|1| Simples Nacional");
         System.out.println("|2| Lucro Presumido");
         System.out.println("|3| Lucro Real");
         System.out.println("|4| Lucro Arbitrado"); 
     }  
} 