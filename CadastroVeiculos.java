import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class CadastroVeiculos {
    private static ArrayList <Veiculo> veiculos;

    private void carregaVeiculos(){
        veiculos.add(new Veiculo_Carga("RQA-1746","Mercedes Atron",2019,7000,10,20,true));
        veiculos.add(new Veiculo_Carga("OLW-9021","Chevrolet Thunder",1998,4000,15,23,true));
        veiculos.add(new Veiculo_Passeio("XXX-2020","Ford Ka", 2019, 1000));
        veiculos.add(new Veiculo_Passeio("AAA-1999","Ford Mustang", 1999, 1500));
        veiculos.add(new Veiculo_Lotacao("YYY-2021", "Marcopolo Premium", 2021, 10000, 55));
        veiculos.add(new Veiculo_Lotacao("ZZZ-2018", "Marcopolo Basic", 2021, 8000, 30));    }

    public CadastroVeiculos(){
        veiculos = new ArrayList<>();
        carregaVeiculos();
    }

    public void CadastroVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }

    public Veiculo buscarPorPlaca(String numPlaca){
        for(Veiculo v : veiculos){
            if(v.getNumPlaca().equals(numPlaca)){
                return v;
            }
        }
        return null;
    }

    public void listaAnoFabricacao(){
        System.out.println("Ano de fabricacao dos veiculos");
        Collections.sort(veiculos, Comparator.comparing(Veiculo::getAnoFab));
        for(Veiculo v : veiculos){
            

            System.out.println("Placa: "+ v.numPlaca +"\n"+" Ano Fabricação: "+ v.anoFab+"\n"+"Peso: "+ v.pesoKg+"\n");
            
            
        }
    }
}
