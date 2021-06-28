public class Veiculo_Passeio extends Veiculo{

    public Veiculo_Passeio(String numPlaca, String modelo, int anoFab, double pesoKg) {
        super( numPlaca,  modelo,  anoFab, pesoKg);
    }
    

    @Override
    public String toString() {
        String aux = "";
        aux+= "Informaçoes Veiculo"+"\n";
        aux+= "Categoria Veiculo: "+this.getClass().getName()+"\n";
        aux+="Numero da Placa: "+ this.getNumPlaca()+"\n";
        aux+="Ano fabricação "+ this.getAnoFab()+"\n";
        aux+="Peso : "+ this.getPesoKg()+"kg"+"\n";
        return aux;
    }
}