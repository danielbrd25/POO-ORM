**Programação Orientada a Objetos**  
**Atividade Persistência de Dados com ORM e CRUD**  
**Daniel de Alcântara Araújo**

Com base no conteúdo da aula teórica sobre Mapeamento Objeto-Relacional (ORM) e no tutorial de ORM com Java, ORMLite e SQLite, implemente as operações CRUD (Create, Read, Update e Delete) para uma classe de modelo (entidade) do seu projeto.

A implementação deverá utilizar o ORM para realizar a persistência dos objetos em um banco de dados relacional, seguindo o padrão Repository apresentado no tutorial.

Requisitos da atividade:

    Selecione uma classe de modelo do seu projeto e configure seu mapeamento para uma tabela do banco de dados.

    Implemente as quatro operações CRUD:

        Create: cadastrar um novo objeto no banco de dados.

        Read: consultar objetos cadastrados, por identificador ou listagem.

        Update: atualizar os dados de um objeto existente.

        Delete: excluir um objeto do banco de dados.

    Execute testes que demonstrem o funcionamento das quatro operações e a persistência dos dados.

**Projeto Gerenciador de Plantas**  
O programa criado tem como função o gerenciamento do inventário de um laboratório focado no estudo de análises de plantas podendo, adicionar, atualizar, listar e excluir todo registro feito nele.   
O código é composto por 4 classes, sendo a classe Database responsável por abrir e fechar a conexão com o banco de dado, a classe Planta armazena os dados de cada registro criado, a classe PlantaTeste feita para testar as funções no bluej, e a classe PlantaRepositorio focada em realizar as funções de create, read, update e delete.

**BlueJ:**  
<img width="621" height="356" alt="imagem 1" src="https://github.com/user-attachments/assets/71d2b03c-2b57-47ac-bd63-cd3bfacad50b" />


**Operação Create:**  
 <img width="635" height="350" alt="imagem 2" src="https://github.com/user-attachments/assets/7938dab4-d355-4830-bf2f-bc86f4c05bb8" />

Através do método testarCriar(), foi criado um registro de uma planta com id 6 e outra com id 7, com os pesos e datas inseridos pelo método, como mostrado na imagem.

**Terminal:**  
<img width="626" height="63" alt="imagem 3" src="https://github.com/user-attachments/assets/6c84381b-e5f2-4f50-8ce6-5f3954980913" />


**Operação Read:**  
<img width="627" height="27" alt="imagem 4" src="https://github.com/user-attachments/assets/1c08b772-990c-4c83-aeb4-82070a4bbb51" />

Pelo método testarListar(), é apresentado no terminal quais plantas estão cadastradas no banco de dados e em cada é também declarado os seus dados de id, peso e data de registro.  
Também há outro método chamado testarConsultar(), onde nele o usuário pode checar os dados de uma planta em específico a partir do fornecimento do id da planta.

**Operação Update:**  
<img width="747" height="135" alt="imagem 5" src="https://github.com/user-attachments/assets/d194ff30-b97a-4f42-9455-cf9c6de01f91" />
 
<img width="607" height="242" alt="imagem 6" src="https://github.com/user-attachments/assets/ac2b7f8e-aa34-43e8-a07b-e0a5d6eca8d3" />

Para alterar os dados de uma planta já registrada, é utilizado o método testarAtualizar(), ao executar é pedido para informar o id da planta na qual se deseja alterar os dados e logo após um campo para inserir os novos valores de peso e data.

**Operação Delete:**  
<img width="627" height="152" alt="imagem 7" src="https://github.com/user-attachments/assets/f1867c90-bebc-4376-ac04-5bcd393774d0" />
 
Para excluir alguma planta cadastrada, basta selecionar o método testarExcluir(), informar o id da planta na qual se deseja deletar do banco de dados.

Para confirmar que houve a exclusão da planta, foi executado o método testarListar() e foi observado que a planta de id 6 não aparece mais no banco de dados, mostra somente a id 7:  
<img width="752" height="172" alt="imagem 8" src="https://github.com/user-attachments/assets/6747162f-c7a8-4b67-9465-12915fa69958" />


