# Sistema de Gerenciamento de Funcionários

## Descrição

O objetivo deste projeto é desenvolver um programa em Java que permita o gerenciamento de funcionários de uma empresa. O sistema deverá ser capaz de cadastrar, consultar (por RG ou todos os funcionários), alterar dados, inativar e excluir funcionários do sistema.

---
<h2 style="font-size: 2rem;text-align: center;">Requisitos e Classes</h2>

## Classe <code>Funcionario</code>

A classe Funcionario já está parcialmente implementada. Seu trabalho é completar a implementação com base nos seguintes requisitos:

**Atributos:**

• **rg:** identificador único do funcionário.

• **nome:** nome do funcionário.

• **departamento:** departamento ao qual o funcionário está alocado.

• **salario:** salário atual do funcionário.

• **ativo:** estado do funcionário na empresa (ativo ou inativo).

### Construtor:

• Deve inicializar os atributos rg, nome, departamento, salario e definir o funcionário como ativo.


### Métodos:

• **bonificar(double valor):** aumenta o salário do funcionário pelo valor especificado.

• **inativar():** marca o funcionário como inativo.

• **toString():** retorna uma representação em String dos dados do funcionário, exceto o estado (ativo/inativo).

• **Getters** e **Setters** para todos os atributos.

---
---
---

## Classe <code>GerenciarFuncionario</code>

A classe **GerenciarFuncionario** é responsável pela interação com o usuário e pelo gerenciamento dos funcionários. Implemente os seguintes métodos:

**Atributos:**

• **funcionarios:** uma lista que armazena os objetos do tipo Funcionario.

Métodos:

• execCadastrar(): cadastra um novo funcionário pedindo os dados ao usuário.

• execConsultarPorRg(): consulta um funcionário pelo RG.

• execConsultarTodos(): exibe uma lista de todos os funcionários cadastrados.

• execAlterar(): permite alterar os dados de um funcionário especificado pelo RG.

• execInativar(): marca um funcionário especificado pelo RG como inativo.

• execExcluir(): remove um funcionário da lista pelo RG.

Fluxo Principal

No método main, implemente um loop que exiba um menu com as seguintes opções:

1. Cadastrar

2. Consultar Por RG

3. Consultar Todos

4. Alterar Dados de Funcionário

5. Inativar

6. Excluir Funcionário

9. Sair

O programa deve continuar executando até que o usuário escolha a opção "Sair". Use uma estrutura de switch ou if-else para chamar os métodos correspondentes de acordo com a escolha do usuário.

Considerações Finais

• A entrada e saída de dados devem ser feitas através do console utilizando a classe Scanner.
