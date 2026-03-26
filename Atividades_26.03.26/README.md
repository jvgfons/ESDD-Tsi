## Integrantes da dupla

- **João Vitor Gomes da Hora Fontes** — BV3054888  
- **Gustavo Fernando Ferreira Vasconcelos Rinck** — BV3059685  

## Exercício

Na seção 1.5, página 216, da obra Algorithms (SEDGEWICK; WAYNE, 2011) o problema da conectividade dinâmica é tratado. Leia esse estudo de caso para complementar o que foi visto em aula. Após a leitura, verifique o projeto “Percolacao”, disponibilizado no material do curso e tente entender como foi aplicada a solução do Union-Find na modelagem do problema de percolação, também apresentado em aula.

## Análise

No livro do Sedgewick, a seção 1.5 fala sobre conectividade dinâmica: temos um monte de pares de números e quer saber se eles já estão conectados indiretamente. Aí a ideia é usar uma estrutura Union-Find pra ir juntando componentes e responder rápido se dois elementos estão no mesmo conjunto. O problema de percolação é como uma aplicação disso: a gente vai abrindo sítios (células) numa grade e precisa saber se já existe um caminho do topo até a base. Cada sítio aberto é como um elemento, e quando dois sítios abertos são vizinhos, a gente faz uma união entre eles. Com isso, fica fácil verificar se o topo e a base estão conectados.

Olhando o código do Percolacao.java, vimos que ele cria uma grade n×n. Além dos sítios reais, ele cria dois sítios virtuais: um representando o topo e outro a base. No construtor, ele já conecta o topo virtual com todos os sítios da primeira linha, e a base virtual com todos os da última linha. Assim é possível saber se percolou, basta ver se os dois virtuais estão no mesmo componente. Se estiverem, é porque existe um caminho do topo até a base.

O método abrir é essencial no projeto. O programa abre um sítio, ele primeiro marca ele como aberto no array sitiosAbertos. Depois, pega o índice linear do sítio e olha pros quatro vizinhos (cima, baixo, esquerda, direita). Se algum vizinho já estiver aberto, ele chama uf.union pra juntar os dois. Assim, vai formando componentes conectados automaticamente, rodando o programa é possível ver isso graficamente, os sítios abertos são representados por células brancas na interface.

O método estaCheio é interessante: ele mostra se um sítio aberto está conectado ao topo virtual. Se estiver, a "água" chegaria nele. Na interface gráfica, esses sítios são pintados de azul, enquanto os abertos mas não cheios são brancos. Dá pra ver claramente como a "água" vai descendo conforme os sítios vão se unindo.

O código usa a classe UF como uma API abstrata, sendo possível escolher qual implementação usar.
No arquivo, existem: QuickFindUF, QuickUnionUF, WeightedQuickUnionUF e uma com compressão de caminho. No construtor, ele instancia WeightedQuickUnionUF, mas as outras opções estão comentadas.

Enfim, esse projeto ajuda a perceber como um conceito teórico (Union-Find) pode ser usado pra resolver um problema real. É muito mais do que só conectar pares de números; dá pra modelar grade, percolação, e até outros problemas tipo labirinto ou fluxo em redes. E com a compressão de caminho, o algoritmo fica muito rápido e escala bem.


