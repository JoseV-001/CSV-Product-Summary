# CSV Product Summary

## Descrição
Este projeto em Java lê um arquivo `items.txt` contendo produtos, preços e quantidades, calcula o total de cada produto (preço × quantidade) e gera um arquivo `summary.csv` com o resultado. Também exibe no console o conteúdo original e o resumo.

O programa é útil para gerar rapidamente um resumo de vendas, estoque ou qualquer lista de produtos.

---

## Estrutura do Projeto

CSV-Product-Summary/
├── src/
│ ├── application/
│ │ └── Main.java
│ └── model/entities/
│ └── Product.java
├── .gitignore
└── README.md

markdown
Copiar código

- `Main.java`: programa principal que lê `items.txt` e cria `summary.csv`.  
- `Product.java`: classe que representa um produto, contendo nome, preço e quantidade, com método para calcular total.

---

## Como Usar

1. Abra o projeto no IntelliJ IDEA ou outro IDE de sua preferência.  
2. Coloque o arquivo `items.txt` no diretório que você deseja ler (exemplo: `C:\Users\JoseV\IdeaProjects\FilesGitVersion\Arquivos\items.txt`).  
3. Rode o programa (`Main.java`).  
4. Digite o caminho completo do arquivo `items.txt` quando solicitado.  
5. O programa irá:

   - Mostrar o conteúdo original no console.  
   - Criar automaticamente uma pasta `out` dentro do diretório do `items.txt`.  
   - Gerar o arquivo `summary.csv` com cada produto e seu total (preço × quantidade).

---

## Exemplo de Input (items.txt)

TV LED,1290.99,1
Notebook,3500.00,2
Mouse,50.00,5

shell
Copiar código

### Console Output

=== ORIGINAL FILE CONTENT ===
TV LED,1290.99,1
Notebook,3500.00,2
Mouse,50.00,5

=== SUMMARY CONTENT ===
TV LED,1290.99
Notebook,7000.00
Mouse,250.00

shell
Copiar código

### summary.csv

TV LED,1290.99
Notebook,7000.00
Mouse,250.00

yaml
Copiar código

---

## Requisitos

- Java 17+  
- IDE recomendada: IntelliJ IDEA  

---

## Observações

- Linhas inválidas no `items.txt` serão ignoradas.  
- Não é necessário criar a pasta `out` manualmente; ela será criada automaticamente.  

---

## Autor

Jose Victor