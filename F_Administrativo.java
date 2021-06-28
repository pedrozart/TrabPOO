
import java.time.LocalDate;

public class F_Administrativo extends Funcionario{

    protected boolean admin;

    
    public F_Administrativo(String nome, LocalDate datanasc, String cpf, boolean admin) {
        super(nome, datanasc, cpf);
        this.admin = admin;
    }

     
    public boolean isAdmin() {
        return admin;
    }


    public void setAdmin(boolean admin) {
        this.admin = admin;
    }


    @Override
    public String toString() {
        return super.toString() + "Ocupa posição administrativa: " + admin ;
    }


   
    
   

}
