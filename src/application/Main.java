package application;

import model.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // O arquivo é digitado dinamicamente (Ex: C:\Users\...\arquivos\itens.txt)
        System.out.print("Enter path of the CSV file (e.g., C:\\Users\\...\\arquivos\\itens.txt): ");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);
        if (!sourceFile.exists()) {
            System.out.println("File does not exist!");
            sc.close();
            return;
        }

        // Pega o diretório do arquivo de entrada
        String sourceFolder = sourceFile.getParent();

        // Cria a nova pasta de saída: 'summary folder'
        String outFolderPath = sourceFolder + File.separator + "summary folder"; // NOME AJUSTADO
        File outFolder = new File(outFolderPath);
        if (!outFolder.exists()) {
            boolean success = outFolder.mkdir();
            System.out.println("Directory created: " + success);
        }

        // Criando o caminho do arquivo summary.csv
        String outputPath = outFolderPath + File.separator + "summary.csv";


        List<Product> list = new ArrayList<>();

        // Lendo arquivo de entrada
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            String line = br.readLine();

            System.out.println("\n=== ORIGINAL FILE CONTENT ===");
            while (line != null) {
                System.out.println(line); // mostra o conteúdo original linha a linha

                // Ajuste para garantir que a leitura funcione mesmo com pipes no arquivo de entrada
                String[] fields = line.split(",");
                String name = fields[0].replace("|", "").trim();
                // Assumindo que o preço pode ter espaços ou pipes
                double price = Double.parseDouble(fields[1].replace("|", "").trim());
                int amount = Integer.parseInt(fields[2].replace("|", "").trim());

                list.add(new Product(name, price, amount));
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error reading file: Price or Amount format is incorrect. Ensure the file has no 'R$' or extra symbols: " + e.getMessage());
        }


        // Escrevendo arquivo de saída (summary.csv)
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))) {

            for (Product p : list) {
                // Seu formato original: "| Nome, Total | "
                bw.write("| " + p.getName() + ", " + String.format("%.2f", p.total()) + " |");
                bw.newLine();
            }
            System.out.println("Summarry file created at: " + outputPath);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // Lendo e mostrando o summary
        try (BufferedReader br2 = new BufferedReader(new FileReader(outputPath))) {
            System.out.println("\n=== SUMMARY CONTENT ===");
            String line2 = br2.readLine();

            while (line2 != null) {
                System.out.println(line2);
                line2 = br2.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error reading summary: " + e.getMessage());
        }

        sc.close();
    }
}