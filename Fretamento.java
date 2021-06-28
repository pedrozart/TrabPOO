import java.time.LocalDate;


public abstract class Fretamento{
    private Veiculo veiculo;
    private F_Motorista condutor;
    private int id_frete; 
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private double valor;


    public Fretamento(Veiculo veiculo, F_Motorista condutor, int id_frete, LocalDate dataInicio, LocalDate dataFim,
            double valor) {
        this.veiculo = veiculo;
        this.condutor = condutor;
        this.id_frete = id_frete;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valor = valor;
    }


    public Veiculo getVeiculo() {
        return veiculo;
    }


    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }


    public F_Motorista getCondutor() {
        return condutor;
    }


    public void setCondutor(F_Motorista condutor) {
        this.condutor = condutor;
    }


    public int getId_frete() {
        return id_frete;
    }


    public void setId_frete(int id_frete) {
        this.id_frete = id_frete;
    }


    public LocalDate getDataInicio() {
        return dataInicio;
    }


    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }


    public LocalDate getDataFim() {
        return dataFim;
    }


    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }


    public double getValor() {
        return valor;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }


    @Override
    public String toString() {
        return "Fretamento [condutor=" + condutor + ", dataFim=" + dataFim + ", dataInicio=" + dataInicio
                + ", id_frete=" + id_frete + ", valor=" + valor + ", veiculo=" + veiculo + "]";
    }

    

    
}