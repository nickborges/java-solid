## Conceitos
##### Herança vs Composição
* **Composição:** quando utilizado um componente(classe) como sendo atributo dentro de outra classe.
  * Exemplo, quando utilizado um List não devemos expor os métodos get e set, devemos criar determinados métodos dentro da própria classe que acessam o atributo para realizar o que se deseja.  
* **Herança:** quando uma classe estende de uma outra e herda o comportamento desta classe.

##### Coesão
* Refere-se ao princípio da responsabilidade única, cada classe deve ter a sua responsabilidade(**Single Responsibility Principle(SRP)**) 
  * Vantagem: Facilidade na manutenção.
  
##### Acoplamento
* Refere-se a dependência e significa o quanto uma classe depende da outra para funcionar. 
* Princípio *"Tell, Don't Ask'"*, refere-se a não pedir para fazer determinada ação exemplo getListaXpto e sim mandar fazer determinada ação, acessando o método criado na classe secundário em que se deseja alterar.
* **The Law Demeter**
  * Heurística referente ao encapsulamento dos dados de uma classe, onde não deve-se passar informações para tais atributos utilizando o getter e muito menos o setter. É necessario criar um método para realizar tal ação.
* Polimorfismo ajuda a desacoplar as funcionalidades diminiundo a complexidade ciclomática.

##### Injeção de dependência
* o principal problena é não se tem a ratreabilidade ficam escondidas(grafo profundo).

##### Como resolver o problema de Coesão e Acoplamento
* Inversão de Controle e utilizar o padrão de injeção de dependência, para diminuir o acoplamento. Basicamente seria criar interface para as classes e assim o chamador apontaria para as interfaces e não para as classes concretas.
* Com Abstrações e Polimorfismo. Através deles é possível ter classes coesas e juntá-las de forma com que o acoplamento não seja um problema.

## Design Patterns
* Identificar: qual o problema? solução possível(Design Pattern)?

##### Strategy
* É um padrão que permite mudar o comportamento do algorítimo em tempo de execução.
* Objetos são criados para representar diversas estratégias(interface + classes concretas) e um objeto de contexto(classe executora) cujo o comportamento varia conforme seu objeto de estratégia(classes concretaas).
* O objeto de estratégia altera o algoritimo de execução do objeto de contexto.
* Contexto é uma classe executora da ação que usa ou injeta uma estratégia(interface).
* **Quando usar strategy?** quando temos um conjunto de algoritmos similares, e precisamos alternar entre eles em diferentes pedaços da aplicação.

##### Chain Of Responsibility
* A intenção deste padrão é evitar o acoplamento do remetente de uma solicitação ao seu receptor, ao dar a mais de um objeto a oportunidade de tratar essa solicitação. Encadear os objetos receptores, passando a solicitação ao longo da cadeia até que um objeto a trate.
* A delegação das solicitações pode formar uma árvore de recursão, com um mecanismo especial para inserção de novos receptores no final da cadeia existente.
* Diminui o **acoplamento** por evitar a associação explícita do remetente de uma solicitação ao seu receptor e dar a mais de um objeto a oportunidade de tratar a solicitação.
* **Quando usar o Chain of Responsibility?**  quando temos vários comandos a serem executados em sequência, e sabemos também qual o próximo cenário que deve ser validado, caso o anterior não satisfaça a condição(substitui os if's).
