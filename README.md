## Conceitos
#### SOLID
* [S]ingle Responsibility Principle (Coesão)
* [O]pen/Closed Principle (Encapsulamento, classes fechadas para modificação mas abertas para extensão)
* [L]iskov Substitution Principle (Herança, todas as ações devem ter pré-condições e pós condições)
* [I]nterface Segregation Principle (A interface deve prover para as filhas, somente com coisas que elas precisam)
* [D]ependency Inversion Principle (Depender sempre da classe mais estável(Abstração), Abstrações devem depender de abstrações, e implementação deve depender de abstração).

#### Coesão
* Refere-se ao princípio da responsabilidade única, cada classe deve ter a sua responsabilidade(**Single Responsibility Principle(SRP)**) 
  * Vantagem: Facilidade na manutenção.
  
#### Acoplamento
* Refere-se a dependência e significa o quanto uma classe depende da outra para funcionar. 
* *Como resolver o problema de acoplamento?* 
  * Utilizando interfaces(Polimorfismo) que respeitem o SRP, ajuda a desacoplar as funcionalidades diminiundo a complexidade ciclomática.
  
#### Encapsulamento
* Encapsular é esconder os detalhes da implementação dentro da classe.
* Princípio *"Tell, Don't Ask'"*, refere-se a não pedir para acessar determinado atributo e pedir para ele fazer determinada ação, exemplo getListaXpto, e sim criar métodos para fazerem determinadas ações, daí o chamador realiza a ação através destes métodos e não diretamente no atributo da classe.
* **The Law Demeter**
  * Heurística referente ao encapsulamento dos dados de uma classe, onde não deve-se passar informações para tais atributos utilizando o getter e muito menos o setter evitando a cadeia a.getB().getC().getD().acao(). É necessario criar um método para realizar tal ação.
* Como descobrir se um código está encapsulado ou não? respondendo as seguinte pergunta.
  * Consigo saber COMO a classe está implementando uma regra de negócio? a resposta deve ser não(a implementação deve ficar escondida).

#### Herança vs Composição
* [L]iskov Substitution Principle: https://en.wikipedia.org/wiki/Liskov_substitution_principle
* **Herança:** quando uma classe estende de uma outra e herda o comportamento desta classe.
  * em cada método que a classe filha herdou e sobrescreveu, lembrar que as pré-condições não podem ser apertadas, e as pós-condições não podem serem afrouxadas(a sobrescrita pela filha não deve divergir da classe pai).
  * Como resolver um problema quando se está usando herança e esta não atende a necessidade? com a composição. 
* **Composição:** O uso de composição é para reaproveitar comportamentos, quando utilizado um componente(classe) como sendo atributo dentro de outra classe ao invés de usar a herança.
  * Exemplo, quando utilizado um List não devemos expor os métodos get e set, devemos criar determinados métodos dentro da própria classe que acessam o atributo para realizar o que se deseja.  

#### Injeção de dependência
* o principal problema é que não se tem a rastreabilidade, ficam escondidas(grafo profundo).

#### Como resolver o problema de Coesão e Acoplamento
* Inversão de Controle e utilizar o padrão de injeção de dependência, para diminuir o acoplamento. Basicamente seria criar interface para as classes e assim o chamador apontaria para as interfaces e não para as classes concretas.
* Com Abstrações e Polimorfismo. Através deles é possível ter classes coesas e juntá-las de forma com que o acoplamento não seja um problema.

## GOF - Design Patterns
* **Identificação:** qual o problema? solução possível(Design Pattern)?
* **Criational Design patterns:**
  * São padrões de design que lidam com mecanismos de criação de objetos, tentando criar objetos de maneira adequada à situação. A forma básica de criação de objeto pode resultar em problemas de design ou adicionar complexidade ao design. Os padrões de design criacional resolvem esse problema controlando a criação desse objeto.
  * Definem a melhor maneira possível de criar um objeto, considerando a reutilização e a mutabilidade. Isso descreve a melhor maneira de lidar com a instanciação. A codificação embutida da instanciação real é uma armadilha e deve ser evitada se a reutilização e a troca forem desejadas.
  * Abstract Factory
  * Builder
  * Factory Method
  * Prototype
  * Singleton
* **Structural Design patterns:**
  * São úteis para definir o relacionamento entre os objetos usando herança ou composição para estruturas maiores de um aplicativo.
  * Mostram como colar diferentes partes de um sistema de maneira flexível e extensível.
  * Ajudam a garantir que, quando uma das partes é alterada, toda a estrutura não precisa ser alterada também.
  * Adapter
  * Bridge
  * Composite
  * Decorator
  * Facade
  * Flyweight
  * Proxy
* **Behavior Design patterns:**
  * Se preocupam com o comportamento em tempo de execução do programa, como padrões de modelo dinâmico.
  * Definem as funções que os objetos assumem e a maneira como esses objetos interagem entre si.
  * O objetivo é garantir o baixo acoplamento.
  * Caracterizam as maneiras pelas quais classes ou objetos interagem e distribuem responsabilidades.
  * Strategy
  * Chain Of Responsibility
  * Template Method
  * Command
  * Interpreter
  * Iterator
  * Mediator
  * Memento
  * Observer
  * State
  * Visitor  

### Abstract Factory
```diff
- colocar aqui a descrição
```

### Builder
* Separa a construção complexa do objeto da sua representação para que o mesmo processo de construção possa criar diferentes representações. 
* **Quando usar o Builder?**
  * Sempre que tivermos um objeto complexo de ser criado, que possui diversos atributos, ou que possui uma lógica de criação complicada, podemos esconder tudo isso em um Builder.
  * Além de centralizar o código de criação e facilitar a manutenção, ainda facilitamos a vida das classes que precisam criar essa classe complexa
  
### Factory
* Factory é usado quando temos que isolar o processo de criação de um objeto em um único lugar. Essa factory pode descobrir como criar o objeto dentro dela própria, mas geralmente ela não precisa de muitas informações para criar o objeto.
* **Quando usar Factory?**
  *
  
### Prototype
```diff
- colocar aqui a descrição
```


### Adapter e Bridge
* **Adapter:** Faça com que uma classe pareça suportar uma interface familiar que ela realmente não suporta. Dessa forma, o código existente pode alavancar novas classes desconhecidas como se fossem classes existentes e familiares, eliminando a necessidade de refatorar o código existente para acomodar as novas classes.
  * **Quando usar Adapter:** 
    * Quando usamos varios métodos estático por exemplo do próprio java, Calendar.algumacoisa(), criamos uma interface e uma classe concreta para implementar a lógica.
* **Bridge:** Para desacoplar subsistemas de forma que qualquer um deles possa mudar radicalmente sem afetar nenhum código do outro, coloque um conjunto de interfaces entre dois subsistemas e código para essas interfaces.
  * **Quando usar Bridge:**
    * Quando queremos chamar um outro sistema, fazemos uma ponte entre eles através de uma interface e uma classe concreta que implementa a logica da chamada.
  * Detalhe: no exemplo Mapa m = new GoogleMaps(); Podemos fazer uso de uma Factory, por exemplo, que nos devolve a Bridge esperada naquele momento.
* **Observação:**
  * A diferença é semântica. A ideia da Bridge é justamente ser uma ponte em dois mundos/sistemas.
  * A ideia do Adapter é esconder alguma "sujeira", ou adaptar algo que é diferente e não bate com o sistema atual.

### Composite
```diff
- colocar aqui a descrição
```
  
### Decorator
* Serve para anexar responsabildiades adicionais e modificar a funcionalidade dinamicamente.
* **Quando usar o Decorator?** 
  * Quando queremos adicionar responsabilidade dinamicamente em determinado Objeto sem afetar o Objeto original.
  * Quando temos comportamentos que podem ser compostos por comportamentos de outras classes envolvidas em uma mesma hierarquia.
* Exemplo: Imagine que estamos implementando uma sequência de filtros. Esses filtros precisam eliminar diversas faturas de uma lista, de acordo com algumas regras de negócio: faturas menores que 2000 devem ser eliminadas, faturas maiores do que 8000 devem ser eliminadas, faturas entre 3000 e 4500 que foram emitidas no estado de São Paulo devem ser eliminadas, e assim por diante. Uma implementação procedural produziria uma sequência de ifs enorme para verificar todas essas condições.

### Flyweight
* Este padrão é usado para reduzir o uso de memória minimizando a quantidade instâncias de objetos e reutilizando-as.
* Factory vs Flyweight:
  * Uma Factory instancia uma classe que é importante/complexa, e seu processo de criação deve ser isolado.
  * Um Flyweight serve para quando temos muitas instâncias do mesmo objeto andando pelo sistema, e precisamos economizar. Para tal, o Flyweight faz uso de uma fábrica modificada, que guarda essas instâncias.
* Sigleton vs Flyweight: 
  * A ideia de ambos é garantir que existam apenas uma única referência para o objeto ao longo do programa.
  * A diferença é que o Flyweight garante que existam apenas uma única instância de vários elementos. É um "singleton maior".
* A própria JVM faz uso de um Flyweight internamente. Quando você declara um "int", e repete o mesmo valor de "int" em vários lugares, ela sempre devolve a mesma instância desse número. É um bom exemplo de implementação do padrão.
* **Quando usar o Flyweight?**
  * Quando precisa ter varias instâncias de uma mesma classe.
* Exemplo: 

### Proxy
```diff
- colocar aqui a descrição
```
  
### Facade
* Fornece uma única interface por meio da qual todas as classes em um subsistema complexo são manipuladas. O Facade permite que você trate um subsistema complexo como se fosse um único objeto granulado com uma interface simples e fácil de usar.

### Strategy
* É um padrão que permite mudar o comportamento do algorítimo em tempo de execução.
* Define uma estratégia para executar algum algoritmo. Uma família de classes intercambiáveis, uma para cada algoritmo, implementa o entrelaçamento.
* **Quando usar status?** quando temos um conjunto de algoritmos similares, e precisamos alternar entre eles em diferentes pedaços da aplicação.

### Chain Of Responsibility
* A intenção deste padrão é evitar o acoplamento do remetente de uma solicitação ao seu receptor, ao dar a mais de um objeto a oportunidade de tratar essa solicitação. Encadear os objetos receptores, passando a solicitação ao longo da cadeia até que um objeto a trate.
* A delegação das solicitações pode formar uma árvore de recursão, com um mecanismo especial para inserção de novos receptores no final da cadeia existente.
* Diminui o **acoplamento** por evitar a associação explícita do remetente de uma solicitação ao seu receptor e dar a mais de um objeto a oportunidade de tratar a solicitação.
* **Quando usar o Chain of Responsibility?**  quando temos vários comandos a serem executados em sequência, e sabemos também qual o próximo cenário que deve ser validado, caso o anterior não satisfaça a condição(substitui os if's).

### Template Method
* Define o esqueleto de um algoritmo, adiando algumas etapas para as subclasses. O Método do Modelo permite que as subclasses redefinam certas etapas de um algoritmo sem alterar a estrutura do algoritmo.
* **Que problema ele resolve?** é normalmente usado em estruturas de aplicativos baseadas em derivação fornecendo um conjunto de superclasses que fazem 90% do trabalho adiando operações específicas de aplicativos para métodos abstratos. 
* **Quando usar o Template Method?** quando se tem classes com comportamentos pareceidos.
* Exemplo: Imagine que temos uma série de algoritmos matemáticos a serem implementados. Todos eles são bem parecidos, possuem a mesma estrutura. As variações são mínimas, por exemplo, um deles deve iterar até o fim da lista, enquanto o outro deve iterar até a metade dela.

### Command
* Encapsular uma unidade de trabalho(comando) em um Objeto, assim pode-se enfileirar/registrar os comandos a serem executados em sequência. 
* **Quando usar o Command ?**
  * Quando temos que separar os comandos que serão executados do objeto que ele pertence. Um bom exemplo disso é o uso de filas de trabalho, adicionamos a uma lista de comandos e no final chamamos um método que vai processar todos estes comandos.
* Observação: 
  * Qual a diferença entre Command e Strategy? 
    * A ideia do Command é abstrair um comando que deve ser executado, pois não é possível executá-lo naquele momento (pois precisamos por em uma fila ou coisa do tipo).
    * Já no Strategy, a ideia é que você tenha uma estratégia (um algoritmo) para resolver um problema.
  * Podemos usar **Memento** para restaurar estados de objetos que foram alterados por um Command. Podemos compor comandos, usando **Composite**.

### Interpreter
* Implemente um interpretador para uma linguagem, primeiro definindo uma gramática formal para essa linguagem e, em seguida, implementando essa gramática com uma hierarquia de classes (uma subclasse por produção).
* **Quando usar o Interpreter?**
  * O padrão Interpreter é geralmente útil para interpretar DSLs.

### Iterator
```diff
- colocar aqui a descrição
```

### Mediator
```diff
- colocar aqui a descrição
```

### Memento
* Um memento é um objeto que armazena um instantâneo do estado interno de outro objeto.
* Encapsule o estado de um objeto de forma que nenhuma entidade externa possa saber como o objeto está estruturado. Um objeto externo pode armazenar ou restaurar o estado de um objeto sem violar a integridade do objeto.
* **Quando usar o Memento?**
  * Quando você deseja criar instantâneos de um estado para um objeto.
  * Quando você precisa desfazer / refazer recursos.

### Observer
* **Quando usar o Observer?**
  * Quando o acoplamento da classe está crescendo, ou quando há diversas ações diferentes a serem executadas após um determinado processo.
  * Permite que diversas ações sejam executadas de forma transparente à classe principal, reduzindo o acoplamento entre essas ações, facilitando a manutenção e evolução do código.
* Exemplo: Imagine que você precise avisar 3 sistemas externos (auditoria, financeiro, e agências), assim que uma conta bancária receber um depósito.

### State
* Permite alterar o comportamento do objeto quando seu estado interno muda. Deixando as subclasses mudarem o estado atual em tempo de execução conforme necessário.
* **Quando usar o State?** 
  * quando queremos representar diferentes estados de um marcadorStatus.
* Exemplo: Um Contrato pode sofrer tipos de alterações, descontos, ajustes enquanto está EM ANDAMENTO. O mesmo pode acontecer quando ele está FALTANDO ASSINATURA DO CLIENTE. Mas, após ASSINADO, o contrato não pode mais sofrer alterações.
  
### Visitor
* Adicione operações a um objeto "host" fornecendo uma maneira para um visitante - um objeto que encapsula um algoritmo - acessar o estado interno do objeto host. 1YPically, esse padrão é usado para interagir com elementos de uma estrutura agregada. O visitante se move de um objeto para outro dentro do agregado.
* **Quando usar o Visitor?**
  * Quando queremos adicionar métodos efetivamente a uma classe sem a necessidade de derivar classes. Os Visitors também podem coletar informações ou realizar operações em todos os elementos de alguma agregação. 
    * Por exemplo, um Visitor pode testar a consistência de todos os elementos de uma agregação.

### Considerações
* Podemos utilizar padrões em conjunto dependendo da necessidade e tirar maior proveito deles.
* **Facade** e **Singleton** são padrões de uso mais legados e são evitados de usar pois fazem uso de um variável global que percorre por todo sistema.