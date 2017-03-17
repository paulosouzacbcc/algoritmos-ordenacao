/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author paulosouza
 */
public class LerArquivo {

   public final static  File file100 = new File("/home/paulosouza/Dropbox/trabalho-ordenacao/100.txt");
   public final static  File file500 = new File("/home/paulosouza/Dropbox/trabalho-ordenacao/500.txt");
   public final static  File file1000 = new File("/home/paulosouza/Dropbox/trabalho-ordenacao/1000.txt");
   public final static  File file5000 = new File("/home/paulosouza/Dropbox/trabalho-ordenacao/5000.txt");
   public final static  File file10000 = new File("/home/paulosouza/Dropbox/trabalho-ordenacao/10000.txt");
   public final static  File file15000 = new File("/home/paulosouza/Dropbox/trabalho-ordenacao/15000.txt");
   public final static  File file20000 = new File("/home/paulosouza/Dropbox/trabalho-ordenacao/20000.txt");

    public int[] vector100() throws FileNotFoundException, IOException {

        ArrayList<String> linhas = null;
        String linha;

        int[] vector = new int[100];

        BufferedReader readerFile = new BufferedReader(new FileReader(file100));

        while (readerFile.readLine() != null) {
            linha = readerFile.readLine();
            linhas.add(linha);

        }

        for (int i = 0; i < linhas.size(); i++) {
            vector[i] = Integer.parseInt(linhas.get(i));
        }

        return vector;
    }

    public ArrayList<String> getLinhasArquivo(File file) throws FileNotFoundException, IOException {
        ArrayList<String> linhas;

        try (BufferedReader leitor = new BufferedReader(new FileReader(file))) {
            linhas = new ArrayList<>();
            String linha = "";

            while ((linha = leitor.readLine()) != null) {
                if (linha.length() > 0) {
                    linhas.add(linha);
                }
            }
        }
        return linhas;
    }
    
    public static void main(String[] args) throws IOException {
        
        ArrayList<String> arrayList = new ArrayList<>();
        
        LerArquivo lerArquivo = new LerArquivo();
        arrayList = lerArquivo.getLinhasArquivo(lerArquivo.file500);
        
        System.out.println(arrayList);
    }

}
