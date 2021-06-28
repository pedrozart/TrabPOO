
public abstract class Veiculo {
    
    protected String numPlaca;
    protected String modelo;
    protected int anoFab;
    protected double pesoKg;

    public Veiculo(String numPlaca, String modelo, int anoFab, double pesoKg) {
        this.numPlaca = numPlaca;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.pesoKg = pesoKg;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    
    

    
    

}
