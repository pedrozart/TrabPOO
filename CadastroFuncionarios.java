import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Collections;


public class CadastroFuncionarios{
    private static ArrayList <Funcionario> funcionarios;
   

    private void carregaFuncionarios(){

        
        
        funcionarios.add(new F_Manobrista("Pedro" , LocalDate.parse("1999-04-01"),"051223456","abc123","C", LocalDate.parse("2025-01-01")));
        funcionarios.add(new F_Manobrista("Lucas" , LocalDate.parse("1998-05-02"), "051283556","abc123","B", LocalDate.parse("2025-01-01")));
        funcionarios.add(new F_Motorista("Joao" , LocalDate.parse("1997-06-03"), "051222356","abc123","B", LocalDate.parse("2025-01-01"), true, false));
        funcionarios.add(new F_Motorista("Maria" , LocalDate.parse("1995-09-07"), "321312454","abc123","C", LocalDate.parse("2025-01-01"),false,true));
        
        funcionarios.add(new F_Administrativo("Sofia", LocalDate.parse("1999-06-12"), "0123456789", true));
        
    
    }

    public CadastroFuncionarios(){
        funcionarios = new ArrayList<>();
        carregaFuncionarios();

    }
    public void cadastraFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    public Funcionario buscarPorCPF(String cpf){
        for(Funcionario func : funcionarios){
            if(func.getCpf().equals(cpf)){
                return func;
            }
        }
        return null;
    }
    public void listaFuncionarios(){

        
        Collections.sort(funcionarios);
        System.out.println("Lista ordenada em ordem alfabética");
        
            for(Funcionario func : funcionarios){
                

                System.out.println("Nome: "+ func.nome +"\n"+"Data Nascimento "+ func.datanasc+"\n"+"CPF: "+ func.cpf+"\n");
                
               
            }
    }
            
        

        
                
        
            
        
        
    


}