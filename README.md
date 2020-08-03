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
* Princípio *"Tell, Don't Ask'"*, refere-se a não pedir para fazer determinada ação exemplo getListaXpto e sim mandar fazer determinada ação, acessando o método criado na classe secundário em que se deseja alterar.
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
  * Flywight
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
  
#### Strategy
* É um padrão que permite mudar o comportamento do algorítimo em tempo de execução.
* Define uma estratégia para executar algum algoritmo. Uma família de classes intercambiáveis, uma para cada algoritmo, implementa o entrelaçamento.
* **Quando usar strategy?** quando temos um conjunto de algoritmos similares, e precisamos alternar entre eles em diferentes pedaços da aplicação.

#### Chain Of Responsibility
* A intenção deste padrão é evitar o acoplamento do remetente de uma solicitação ao seu receptor, ao dar a mais de um objeto a oportunidade de tratar essa solicitação. Encadear os objetos receptores, passando a solicitação ao longo da cadeia até que um objeto a trate.
* A delegação das solicitações pode formar uma árvore de recursão, com um mecanismo especial para inserção de novos receptores no final da cadeia existente.
* Diminui o **acoplamento** por evitar a associação explícita do remetente de uma solicitação ao seu receptor e dar a mais de um objeto a oportunidade de tratar a solicitação.
* **Quando usar o Chain of Responsibility?**  quando temos vários comandos a serem executados em sequência, e sabemos também qual o próximo cenário que deve ser validado, caso o anterior não satisfaça a condição(substitui os if's).

#### Template Method
* Define o esqueleto de um algoritmo, adiando algumas etapas para as subclasses. O Método do Modelo permite que as subclasses redefinam certas etapas de um algoritmo sem alterar a estrutura do algoritmo.
* **Que problema ele resolve?** é normalmente usado em estruturas de aplicativos baseadas em derivação fornecendo um conjunto de superclasses que fazem 90% do trabalho adiando operações específicas de aplicativos para métodos abstratos. 
* **Quando usar o Template Method?** quando se tem classes com comportamentos pareceidos.
* Exemplo: Imagine que temos uma série de algoritmos matemáticos a serem implementados. Todos eles são bem parecidos, possuem a mesma estrutura. As variações são mínimas, por exemplo, um deles deve iterar até o fim da lista, enquanto o outro deve iterar até a metade dela.

#### Decorator
* Serve para anexar responsabildiades adicionais e modificar a funcionalidade dinamicamente.
* **Quando usar o Decorator?** 
  * Quando queremos adicionar responsabilidade dinamicamente em determinado Objeto sem afetar o Objeto original.
  * Quando temos comportamentos que podem ser compostos por comportamentos de outras classes envolvidas em uma mesma hierarquia.
* Exemplo: Imagine que estamos implementando uma sequência de filtros. Esses filtros precisam eliminar diversas faturas de uma lista, de acordo com algumas regras de negócio: faturas menores que 2000 devem ser eliminadas, faturas maiores do que 8000 devem ser eliminadas, faturas entre 3000 e 4500 que foram emitidas no estado de São Paulo devem ser eliminadas, e assim por diante. Uma implementação procedural produziria uma sequência de ifs enorme para verificar todas essas condições.

#### State
* Permite alterar o comportamento do objeto quando seu estado interno muda. Deixando as subclasses mudarem o estado atual em tempo de execução conforme necessário.
* **Quando usar o State?** 
  * quando queremos representar diferentes estados de um contexto.
* Exemplo: Um Contrato pode sofrer tipos de alterações, descontos, ajustes enquanto está EM ANDAMENTO. O mesmo pode acontecer quando ele está FALTANDO ASSINATURA DO CLIENTE. Mas, após ASSINADO, o contrato não pode mais sofrer alterações.

#### Builder
* Separa a construção complexa do objeto da sua representação para que o mesmo processo de construção possa criar diferentes representações. 
* **Quando usar o State?**
  * Sempre que tivermos um objeto complexo de ser criado, que possui diversos atributos, ou que possui uma lógica de criação complicada, podemos esconder tudo isso em um Builder.
  * Além de centralizar o código de criação e facilitar a manutenção, ainda facilitamos a vida das classes que precisam criar essa classe complexa

#### Observer
* **Quando usar o State?**
  * Quando o acoplamento da classe está crescendo, ou quando há diversas ações diferentes a serem executadas após um determinado processo.
  * Permite que diversas ações sejam executadas de forma transparente à classe principal, reduzindo o acoplamento entre essas ações, facilitando a manutenção e evolução do código.
* Exemplo: Imagina que você precise avisar 3 sistemas externos (auditoria, financeiro, e agências), assim que uma conta bancária receber um depósito.
