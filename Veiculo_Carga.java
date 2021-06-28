
public class Veiculo_Carga extends Veiculo {    

    private double capacidade;
    private int numEixos;
    private boolean cargaExtra;


    public Veiculo_Carga(String numPlaca, String modelo, int anoFab, double pesoKg, double capacidade, int numEixos,
            boolean cargaExtra) {
        super(numPlaca, modelo, anoFab, pesoKg);
        this.capacidade = capacidade;
        this.numEixos = numEixos;
        this.cargaExtra = cargaExtra;
    }

    public double getCapacidade(){
        return capacidade;
    }

    public void setCapacidade(double capacidade){
        this.capacidade=capacidade;
    }

    public int getNumEixos() {
        return numEixos;
    }

    public void setNumEixos(int numEixos) {
        this.numEixos = numEixos;
    }

    public boolean isCargaExtra() {
        return cargaExtra;
    }

    public void setCargaExtra(boolean cargaExtra) {
        this.cargaExtra = cargaExtra;
    }

    @Override
    public String toString() {
        String aux = "";
        aux+= "Informaçoes Veiculo"+"\n";
        aux+= "Categoria Veiculo: "+this.getClass().getName()+"\n";
        aux+="Numero da Placa: "+ this.getNumPlaca()+"\n";
        aux+="Ano fabricação "+ this.getAnoFab()+"\n";
        aux+="Peso : "+ this.getPesoKg()+"kg"+"\n";
        aux+= "Capacidade: "+this.getCapacidade()+"\n";
        aux+= "Numero de Eixos: "+this.getNumEixos()+"\n";
        aux+= "Permite carga extra? "+this.isCargaExtra()+"\n";
        return aux;
    }
    
    
}
