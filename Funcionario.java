
import java.time.LocalDate;

public class Funcionario implements Comparable<Funcionario> {

    protected String nome;
    protected LocalDate datanasc;
    protected String cpf;
    

    public Funcionario(String nome, LocalDate datanasc, String cpf){

        this.nome = nome;
        this.datanasc = datanasc;
        this.cpf = cpf;

    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public LocalDate getDatanasc() {
        return datanasc;
    }


    public void setDatanasc(LocalDate datanasc) {
        this.datanasc = datanasc;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int compareTo(Funcionario f){
        int valor = nome.compareTo(f.nome);
        return (valor != 0 ? valor : 1);
    }


    @Override
    public String toString() {
        String aux = "";
        aux+= "Informaçoes Funcionario"+"\n";
        aux+= "Categoria Funcionario: "+this.getClass().getName()+"\n";
        aux+="Nome: "+ this.getNome()+"\n";
        aux+="Data Nascimento "+ this.getDatanasc()+"\n";
        aux+="CPF: "+ this.getCpf()+"\n";
        return aux;
    }
    
}
