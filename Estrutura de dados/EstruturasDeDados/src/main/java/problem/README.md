# Resolvendo Problemas

## Roteiro

### 1. Problema: Balanceamento de colchetes em uma expressão

Dada uma string de expressão `exp`, escreva um programa para examinar se os pares e as ordens de `{`, `}`, `(`, `)`, `[`, `]` estão corretos na expressão dada.

#### Exemplos:
- **Inválida:** `2*(3+4+5*[2+3)]`
- **Válida:** `2*(3+4+5*[2+3])`

#### Exemplo complexo:
- **Expressão:** `[2*(3+4+5*[2+3]/(2+(3+(7+5)*9)*6)*[5+8]+17)+2]`
- **Análise:** Não tão fácil de analisar.

#### Solução:
Uso de pilhas:
1. Empilhar caracteres de abertura.
2. Ao identificar um caractere de fechamento: desempilhar e verificar se coincide com a abertura.
3. Ao final, a pilha deve estar vazia.

---

### 2. Problema: Revertendo os primeiros k elementos de uma fila

Dado um inteiro `k` e uma fila de inteiros, a tarefa é inverter a ordem dos primeiros `k` elementos da fila, deixando os demais elementos na mesma ordem relativa.

#### Exemplos:
- `(1, 2, 3, 4, 5)` -> `K = 2` -> `(2, 1, 3, 4, 5)`
- `(1, 2, 3, 4, 5)` -> `K = 4` -> `(4, 3, 2, 1, 5)`

#### Algoritmo:
1. Para os `K` primeiros elementos:
   - Desenfileirar elemento `x`
   - Reordenar os (K-1) elementos
   - Enfileirar elemento `x`
2. Para os `N-K` elementos restantes:
   - Desenfileirar
   - Enfileirar

---

### 3. Problema: Maior valor em cada nível da Árvore Binária

Dada uma árvore binária, encontre o maior valor em cada nível.

#### Exemplo de árvore:
          [37]
        /      \
     [11]      [66]
     /  \       /  \
   [08] [17] [42] [72]
   
#### Algoritmo:
1. Utilize o algoritmo para percorrer a árvore e uma lista auxiliar.
2. Para cada elemento e seu nível na árvore:
   - Se a lista possuir o índice = nível, substitua pelo maior valor.
   - Senão, adicione na lista.

#### Lista de maiores valores por nível:
- Nível 0: `[37]`
- Nível 1: `[66]`
- Nível 2: `[17]`  
