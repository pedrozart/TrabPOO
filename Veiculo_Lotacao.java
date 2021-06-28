public class Veiculo_Lotacao extends Veiculo{
    private int maxPassageiros;


    public Veiculo_Lotacao(String numPlaca, String modelo, int anoFab, double pesoKg, int maxPassageiros){
        super(numPlaca, modelo, anoFab, pesoKg);
        this.maxPassageiros = maxPassageiros;
       
    }

    public void setMaxPassageiros(int maxPassageiros){
        this.maxPassageiros = maxPassageiros;

    }
    public int getMaxPassageiros(){
        return maxPassageiros;
    }
    @Override
    public String toString() {
        String aux = "";
        aux+= "Informaçoes Veiculo"+"\n";
        aux+= "Categoria Veiculo: "+this.getClass().getName()+"\n";
        aux+="Numero da Placa: "+ this.getNumPlaca()+"\n";
        aux+="Ano fabricação "+ this.getAnoFab()+"\n";
        aux+="Peso : "+ this.getPesoKg()+"kg"+"\n";
        aux+= "Maximo de passageiros: "+ this.getMaxPassageiros()+"\n";
        return aux;
    }
}