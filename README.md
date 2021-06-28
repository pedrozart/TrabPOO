# TrabPOO
Sua tarefa é desenvolver um sistema orientado a objetos em Java para controlar a frota de
veículos de uma transportadora. O sistema deve ser capaz também de gerenciar o cadastro
de funcionários e os fretes realizados.
A empresa deseja gerenciar três categorias de funcionários (administrativo, motorista e
manobrista) e três categorias de veículos (veículo de passeio e utilitários, veículo de
transporte de cargas e veículo de transporte de passageiros), bem como o fretamento dos
veículos. As informações que devem ser armazenadas para cada uma dessas entidades
estão listadas a seguir.
Funcionário Administrativo:
- Nome (String)
- Data de nascimento (LocalDate)
- CPF (String)
Funcionário Manobrista:
- Nome (String)
- Data de nascimento (LocalDate)
- CPF (String)
- Número da CNH (String)
- Categoria da CNH (String)
- Data de vencimento da CNH (LocalDate)
Funcionário Motorista:
- Nome (String)
- Data de nascimento (LocalDate)
- CPF (String)
- Número da CNH (String)
- Categoria da CNH (String)
- Data de vencimento da CNH (LocalDate)
- Possui curso para cargas perigosas? (boolean)
- Possui curso para transporte de passageiros? (boolean)
Veículo de passeio e utilitários:
- Número da placa (String)
- Modelo do veículo (String)
- Ano de fabricação (int)
- Peso do veículo em kg (double)
Veículo de transporte de cargas (ex: caminhões):
- Número da placa (String)
- Modelo do veículo (String)
- Ano de fabricação (int)
- Peso do veículo em kg (double)
- Capacidade de carga (double)
- Número de eixos (int)
- Possui unidade acoplada? (boolean)
Veículo de transporte de passageiros (ex: vans/ônibus):
- Número da placa (String)
- Modelo do veículo (String)
- Ano de fabricação (int)
- Peso do veículo (double)
- Lotação máxima de passageiros (int)
Fretamento de ônibus/vans:
- Identificador único do fretamento (int)
- Veículo (referência para o veículo)
- Condutor (referência para o motorista)
- Data de início (LocalDate)
- Data de término (LocalDate)
- Distância percorrida em km (double)
- Valor cobrado (double)
Fretamento de utilitários/caminhões:
- Identificador único do fretamento (int)
- Veículo (referência para o veículo)
- Condutor (referência para o motorista)
- Data de início (LocalDate)
- Data de término (LocalDate)
- Distância percorrida em km (double)
- Carga perigosa? (boolean)
- Valor cobrado (double)
Antes de começar a programar, sua primeira tarefa é construir o diagrama de classes (UML)
que modela o sistema.
Funcionalidades previstas
O sistema desenvolvido deve ter uma interface de usuário no terminal que permita executar
as seguintes funcionalidades:
1. Funcionários
1.1. Cadastrar funcionário
1.2. Listar funcionários em ordem alfabética
1.3. Buscar funcionário por CPF
2. Veículos:
2.1. Cadastrar veículo
2.2. Listar veículos em ordem de ano de fabricação
2.3. Buscar veículo por placa
3. Fretamentos:
3.1. Cadastrar fretamento de veículo
3.2. Listar motoristas livres
3.3. Listar veículos livres
3.4. Listar histórico de fretamentos
3.5. Listar top 5 veículos mais lucrativos
Regras de cálculo do valor cobrado
O cálculo do valor do fretamento de veículo de passageiros leva em consideração três fatores:
● capacidade do veículo;
● quantidade de dias que o veículo ficará em uso (diárias);
● distância que será percorrida.
A tabela de valores a ser usada é a seguinte:
Capacidade Valor da diária Valor por quilômetro
15 lugares R$ 410,00 R$ 2,20
26 lugares R$ 490,00 R$ 2,80
46 lugares R$ 560,00 R$ 3,00
Exemplo: para um ônibus de 46 lugares que percorre 500 km durante 2 dias, o valor cobrado
será de 2 x 560,00 + 500 x 3,00 = R$ 2620,00.
Já o cálculo de fretamento de veículos de carga leva em consideração os seguintes fatores:
● tipo de carga a ser transportada (para simplificar, usaremos apenas duas categorias:
carga normal ou perigosa);
● distância que será percorrida para a realização do frete;
● número de eixos do veículo.
O valor por quilômetro por eixo que será utilizado é R$ 1,20 para cargas normal e de R$ 1,50
para cargas perigosas.
Exemplo: para um caminhão que utiliza 4 eixos para transportar uma carga normal por uma
distância de 290 km, o valor cobrado será de: 1,20 x 4 x 290 = R$ 1392,00.
Regras de alocação de motoristas
O sistema deve permitir que somente motoristas devidamente habilitados para conduzir cada
tipo de veículo possam ser alocados para os fretamentos.
A lei diz que motoristas com a carteira nacional de habilitação (CNH) de categoria B pode
dirigir carros de passeio e veículos que não ultrapassem o peso bruto total de 3.500 kg. Para
veículos de maior porte e/ou transporte de passageiros, são necessárias outras categorias:
● Categoria B - Carros de passeio;
● Categoria C - Veículos acima de 3,5 toneladas;
● Categoria D - Veículos com mais de 8 passageiros;
● Categoria E - Veículos com unidade acoplada acima de 6 toneladas.
Para cargas perigosas (ex: inflamáveis), é necessário ter um curso especial para habilitar a
esse tipo de transporte. O mesmo ocorre para transporte de passageiros.
