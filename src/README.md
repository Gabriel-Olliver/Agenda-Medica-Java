# Sistema de Agenda Médica Simples

Aplicação em Java, executada pelo console, que modela a agenda de atendimento de médicos e o cadastro dos pacientes de cada agenda. O projeto foi desenvolvido com foco em orientação a objetos: encapsulamento, composição entre classes e responsabilidades bem separadas.
O sistema representa uma situação comum de uma clínica: cada médico possui uma agenda para uma data específica, e essa agenda mantém a lista de pacientes que serão atendidos. É possível adicionar pacientes, removê-los, pesquisar por CPF e listar todos os atendimentos do dia.

## Funcionalidades

- Cadastro de médicos com nome e especialidade
- Cadastro de pacientes com nome, CPF, idade e telefone
- Criação de uma agenda vinculada a um médico, com data de atendimento
- Adição de pacientes à agenda
- Remoção de paciente da agenda a partir do CPF
- Pesquisa de paciente por CPF, exibindo nome, telefone e idade
- Listagem dos pacientes de uma agenda, numerados, junto com a data, o médico e a especialidade

## Tecnologias

- Java 8 ou superior
- Nenhuma biblioteca externa

## Estrutura do projeto

```
src/
└── domain/
    ├── Agenda.java
    ├── Main.java
    ├── Medico.java
    └── Paciente.java
```

Todas as classes pertencem ao pacote `domain`.

## Modelo de classes

```
Agenda 1 ---- 1 Medico
Agenda 1 ---- * Paciente
```

### Medico

Representa o profissional responsável pelo atendimento.

| Atributo       | Tipo     | Descrição                    |
|----------------|----------|------------------------------|
| `nome`         | `String` | Nome do médico               |
| `especialidade`| `String` | Especialidade de atuação     |

### Paciente

Representa a pessoa atendida.

| Atributo   | Tipo     | Descrição                         |
|------------|----------|-----------------------------------|
| `nome`     | `String` | Nome do paciente                  |
| `cpf`      | `String` | Identificador usado nas buscas    |
| `idade`    | `String` | Idade do paciente                 |
| `telefone` | `String` | Telefone de contato               |

### Agenda

Reúne o médico, a data do atendimento e a lista de pacientes.

| Atributo    | Tipo                  | Descrição                         |
|-------------|-----------------------|-----------------------------------|
| `data`      | `String`              | Data do atendimento               |
| `pacientes` | `ArrayList<Paciente>` | Pacientes agendados               |
| `medico`    | `Medico`              | Médico responsável pela agenda    |

| Método                               | Descrição                                                               |
|--------------------------------------|-------------------------------------------------------------------------|
| `adicionar(Paciente p)`              | Insere um paciente na agenda                                            |
| `remover(String cpf)`                | Remove o paciente com o CPF informado e exibe uma confirmação           |
| `pesquisar(String cpf)`              | Exibe nome, telefone e idade do paciente com o CPF informado            |
| `apresentarListaDePacientes()`       | Exibe data, médico, especialidade e a lista numerada de pacientes       |

### Main

Classe de entrada do programa. Cria dois médicos, quatro pacientes e duas agendas, e demonstra a adição, a listagem e a remoção de pacientes.

## Como executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git
   cd NOME-DO-REPOSITORIO
   ```

2. Compile as classes:

   ```bash
   javac -d out src/domain/*.java
   ```

3. Execute o programa:

   ```bash
   java -cp out domain.Main
   ```

Também é possível abrir o projeto em uma IDE como IntelliJ IDEA ou Eclipse e executar a classe `Main`.

## Exemplo de execução

Saída gerada pela classe `Main`:

```
Data do Atendimento: 01/02/2029, Medico(a): Gabriel, Especialidade: Cirurgião
1-Paciente Nome: Arthur, Tel: 456, Cpf: 111, Idade: 19
2-Paciente Nome: Olivanio, Tel: 101112, Cpf: 333, Idade: 20

Data do Atendimento: 01/08/2029, Medico(a): Leidiane, Especialidade: Terapeuta
1-Paciente Nome: Ana, Tel: 0123, Cpf: 000, Idade: 18
2-Paciente Nome: Pedro, Tel: 789, Cpf: 222, Idade: 30
Nome: Pedro foi removido com successo !
```

## Conceitos aplicados

- Classes, objetos e construtores
- Encapsulamento com atributos privados, getters e setters
- Composição: a `Agenda` possui um `Medico` e uma coleção de `Paciente`
- Coleções com `ArrayList`
- Organização do código em pacotes
- Percurso de listas com laço `for` e comparação de textos com `equals`

## Melhorias planejadas

- Tratar o caso em que o CPF não é encontrado em `remover` e `pesquisar`, informando o usuário
- Armazenar os dados puros nos objetos (por exemplo, `"Ana"` em vez de `"Nome: Ana"`) e deixar os rótulos para a formatação da saída
- Alterar o tipo de `idade` para `int` e o de `data` para `LocalDate`
- Impedir o cadastro de dois pacientes com o mesmo CPF na mesma agenda
- Substituir a variável de controle do laço por `break` ou `removeIf`, e declarar a lista como `List<Paciente>`
- Fazer `pesquisar` retornar o `Paciente` em vez de imprimir, separando a lógica da exibição
- Criar um menu interativo no console para operar a agenda
- Persistir os dados em arquivo ou banco de dados
- Adicionar testes unitários com JUnit

## Autor

Olliver

Estudante de Análise e Desenvolvimento de Sistemas, com foco em desenvolvimento back-end com Java.

- GitHub: [SEU-USUARIO](https://github.com/SEU-USUARIO)
