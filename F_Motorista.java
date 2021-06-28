
import java.time.LocalDate;

public class F_Motorista extends F_Manobrista {
    
   
    private boolean cargaPerigosa;
    private boolean cargaPassageiros;

    public F_Motorista(String nome, LocalDate datanasc, String cpf, String CNH_Numero, String CNH_Categoria, LocalDate CNH_DataVencimento, Boolean cargaPerigosa , Boolean cargaPassageiros ){
      super(nome, datanasc, cpf, CNH_Numero, CNH_Categoria, CNH_DataVencimento);
      
      this.cargaPerigosa = cargaPerigosa;
      this.cargaPassageiros = cargaPassageiros;

    }
    
    public boolean isCargaPerigosa() {
        return cargaPerigosa;
    }

    public void setCargaPerigosa(boolean cargaPerigosa) {
        this.cargaPerigosa = cargaPerigosa;
    }

    public boolean isCargaPassageiros() {
        return cargaPassageiros;
    }

    public void setCargaPassageiros(boolean cargaPassageiros) {
        this.cargaPassageiros = cargaPassageiros;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +"Habilitação carga Passageiros: "+ cargaPassageiros+"\n"+
        "Habilitação Carga Perigosa: "+ cargaPerigosa;
    }

    

    


    
}
