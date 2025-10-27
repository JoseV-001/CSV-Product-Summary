# CSV Product Summary

## Descrição
Este projeto em Java lê um arquivo `itens.txt` contendo produtos, preços e quantidades, calcula o total de cada produto (preço × quantidade) e gera um arquivo `summary.csv` com o resultado. Também exibe no console o conteúdo original e o resumo.

O programa é útil para gerar rapidamente um resumo de vendas, estoque ou qualquer lista de produtos.

---

## Estrutura do Projeto
```
CSV-Product-Summary/
├── src/
│   ├── application/
│   │   └── Main.java
│   └── model/entities/
│       └── Product.java
├── .gitignore
└── README.md
```

---

## Como Usar

1. Abra o projeto no IntelliJ IDEA ou outro IDE de sua preferência.
2. Rode o programa (`Main.java`).
3. Quando solicitado, digite o caminho completo do arquivo **`itens.txt`** que está no projeto (exemplo de caminho: `C:\caminho\para\seu\projeto\arquivos\itens.txt`).

   **Observação:** O arquivo **`itens.txt`** já existe no projeto com 5 itens de teste. Ele pode ser editado seguindo o mesmo padrão (`| Produto,Preço,Quantidade |`), podendo adicionar qualquer tipo de item, quantidade ou valor. O programa fará o cálculo automaticamente para todos os itens.

4. O programa irá:
   - Mostrar o conteúdo original no console.
   - Criar automaticamente uma pasta **`summary folder`** dentro do diretório onde o `itens.txt` está localizado.
   - Gerar o arquivo `summary.csv` com cada produto e seu total (preço × quantidade).

---

## Exemplo de Input (itens.txt)
````
| Monitor Gamer,2141,94,5 |
| SSD 1TB,819,62,13 |
| Smartwatch,1930,64,6 |
| Tablet Pro,4245,10,10 |
| Pendrive 128GB,1359,38,1 |
````


### Console Output

```text
=== ORIGINAL FILE CONTENT ===
| Monitor Gamer,2141,94,5 |
| SSD 1TB,819,62,13 |
| Smartwatch,1930,64,6 |
| Tablet Pro,4245,10,10 |
| Pendrive 128GB,1359,38,1 |

=== SUMMARY CONTENT ===
| Monitor Gamer, 201254.00 |
| SSD 1TB, 50778.00 |
| Smartwatch, 123520.00 |
| Tablet Pro, 42450.00 |
| Pendrive 128GB, 51642.00 |
```
### summary.csv
````
| Monitor Gamer, 201254.00 |
| SSD 1TB, 50778.00 |
| Smartwatch, 123520.00 |
| Tablet Pro, 42450.00 |
| Pendrive 128GB, 51642.00 |
````
---

## Requisitos

- Java 17+  
- IDE recomendada: IntelliJ IDEA  

---

## Observações

- Linhas inválidas no `items.txt` serão ignoradas.  
- O arquivo `items.txt` pode ser editado para adicionar/remover produtos ou alterar valores e quantidades, seguindo o mesmo padrão.  
- Não é necessário criar a pasta `out` manualmente; ela será criada automaticamente.  

---

## Autor

Jose Victor
