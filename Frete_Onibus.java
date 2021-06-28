import java.time.LocalDate;

public class Frete_Onibus extends Fretamento{

    public Frete_Onibus(Veiculo veiculo, F_Motorista condutor, int id_frete, LocalDate dataInicio, LocalDate dataFim,
            double valor) {
        super(veiculo, condutor, id_frete, dataInicio, dataFim, valor);
    } 
    

}