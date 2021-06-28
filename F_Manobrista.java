import java.time.LocalDate;


public class F_Manobrista extends Funcionario{
    
    protected String CNH_Numero;
    protected String CNH_Categoria;
    protected LocalDate CNH_DataVencimento;

    public F_Manobrista(String nome, LocalDate datanasc, String cpf, String CNH_Numero,String CNH_Categoria, LocalDate CNH_DataVencimento){
        super(nome, datanasc, cpf);
        this.CNH_Numero= CNH_Numero;
        this.CNH_Categoria = CNH_Categoria;
        this.CNH_DataVencimento = CNH_DataVencimento;
    }


    
    public String getCNH_Numero() {
        return CNH_Numero;
    }



    public void setCNH_Numero(String CNH_Numero) {
        this.CNH_Numero = CNH_Numero;
    }



    public String getCNH_Categoria() {
        return CNH_Categoria;
    }



    public void setCNH_Categoria(String CNH_Categoria) {
        this.CNH_Categoria = CNH_Categoria;
    }



    public LocalDate getCNH_DataVencimento() {
        return CNH_DataVencimento;
    }



    public void setCNH_DataVencimento(LocalDate cNH_DataVencimento) {
        CNH_DataVencimento = cNH_DataVencimento;
    }



    @Override
    public String toString() {
        return super.toString() + "Categoria CNH="  + CNH_Categoria +"\n"+
                                 "Data de Vencimento CNH= " + CNH_DataVencimento+"\n"+ 
                                 "Numero CNH =" + CNH_Numero;
    }



    
    
}