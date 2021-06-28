


public class App {
    
    public static void main(String[] args) {
        /*CadastroFuncionarios cadFunc = new CadastroFuncionarios();

        Funcionario f1 = cadFunc.buscarPorCPF("0123456789");
        System.out.println(f1);
       
        Funcionario f2 = cadFunc.buscarPorCPF("051223456");
        System.out.println(f2);
        Funcionario f3 = new F_Motorista("Lucia", LocalDate.parse("1999-06-12"), "1123456788", "abc123","C", LocalDate.parse("2025-01-01"),false,true);
        
        cadFunc.cadastraFuncionario(f3);

        cadFunc.buscarPorCPF("1123456788");

        System.out.println(f3);

        cadFunc.listaFuncionarios();*/

        CadastroVeiculos cadVeic = new CadastroVeiculos();

        Veiculo v1 = cadVeic.buscarPorPlaca("AAA-1999");

        System.out.println(v1);

        Veiculo v2 = new Veiculo_Carga("ZZZ-1234","Scania P310",1997,9000,40,8,true);

        cadVeic.CadastroVeiculo(v2);

        cadVeic.buscarPorPlaca("ZZZ-1234");
        
        System.out.println(v2);

        cadVeic.listaAnoFabricacao();
    }
}