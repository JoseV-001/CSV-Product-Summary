package application;

import model.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter path of the CSV file: ");
        String sourceFileStr = sc.nextLine(); //digitar local-Ex:C:\Users\...

        File sourceFile = new File(sourceFileStr);
        if (!sourceFile.exists()) {
            System.out.println("File does not exist ! ");
            sc.close();
            return;
        }

        //pega o diretório do arquivo
        String sourceFolder = sourceFile.getParent();

        //criando a pasta out dentro do diretório do arquivo
        String outFolderPath = sourceFolder + File.separator + "out";
        File outFolder = new File(outFolderPath);
        if (!outFolder.exists()) {
            boolean success = outFolder.mkdir();
            System.out.println("Directory created: " + success);
        }

        //Criando o caminho do arquivo summary
        String outputPath = outFolderPath + File.separator + "summary.csv";

        List<Product> list = new ArrayList<>();

        //Lendo arquivo de entrada
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            String line = br.readLine();

            System.out.println("\n=== ORIGINAL FILE CONTENT ===");
            while (line != null) {
                System.out.println(line); // mostra o conteúdo original linha a linha

                String[] fields = line.split(",");
                String name = fields[0].replace("|", "").trim();
                double price = Double.parseDouble(fields[1].replace("|", "").trim());
                int amount = Integer.parseInt(fields[2].replace("|", "").trim());

                list.add(new Product(name, price, amount));
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))) {

            for (Product p : list) {
                bw.write("| " + p.getName() + ", " + String.format("%.2f ", p.total()) + "| ");
                bw.newLine();

            }
            System.out.println("Summarry file created at: " + outputPath);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

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
