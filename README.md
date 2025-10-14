# CSV Product Summary

## Descrição
Este projeto em Java lê um arquivo `items.txt` contendo produtos, preços e quantidades, calcula o total de cada produto (preço × quantidade) e gera um arquivo `summary.csv` com o resultado. Também exibe no console o conteúdo original e o resumo.

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
3. Quando solicitado, digite o caminho completo do arquivo `items.txt` que está no projeto (exemplo de caminho: `C:\Users\Nome\IdeaProjects\FilesGitVersion\Arquivos\items.txt`).  

   **Observação:** O arquivo `items.txt` já existe no projeto com 4 itens de teste. Ele pode ser editado seguindo o mesmo padrão (`Nome do Produto,Preço,Quantidade`), podendo adicionar qualquer tipo de item, quantidade ou valor. O programa fará o cálculo automaticamente para todos os itens.

4. O programa irá:

   - Mostrar o conteúdo original no console.  
   - Criar automaticamente uma pasta `out` dentro do diretório onde o `items.txt` está localizado.  
   - Gerar o arquivo `summary.csv` com cada produto e seu total (preço × quantidade).

---

## Exemplo de Input (items.txt)
````
TV LED,1290.99,1
Vídeo Game Chair,350.50,3
Iphone X,900.00,2
Samsung Galaxy 9,850.00,2
````


### Console Output

```shell
=== ORIGINAL FILE CONTENT ===
| TV LED,1290.99,1 |
| Vídeo Game Chair,350.50,3 |
| Iphone X,900.00,2 |
| Samsung Galaxy 9,850.00,2 |

=== SUMMARY CONTENT ===
| TV LED, 1290,99 | 
| Vídeo Game Chair, 1051,50 | 
| Iphone X, 1800,00 | 
| Samsung Galaxy 9, 1700,00 | 
```
### summary.csv
````
| TV LED, 1290,99 | 
| Vídeo Game Chair, 1051,50 | 
| Iphone X, 1800,00 | 
| Samsung Galaxy 9, 1700,00 | 
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
