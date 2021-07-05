import static java.lang.System.*;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import p2utils.KeyValueList;

public class CountWords
{

  public static void main(String[] args) {
    KeyValueList<Integer> counts = new KeyValueList<>();

    for (int a = 0; a < args.length; a++) { // Processa cada ficheiro
      File fin = new File(args[a]);
      // Using a try-with-resources:
      try (Scanner scf = new Scanner(fin)) {
        while (scf.hasNextLine()) { // Processa cada linha
          String line = scf.nextLine();
          // Divide a linha em "palavras", considerando como separador
          // qualquer sequência de 1 ou mais carateres não alfabéticos:
          String[] palavras = line.split("[^\\p{IsAlphabetic}]+");
          // (Sobre expressões regulares usadas no split: https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html)

          for (int i = 0; i < palavras.length; i++) { // Processa cada palavra
            String str = palavras[i].toLowerCase();
              if(!str.equals("")){
                if(counts.contains(str)) counts.set(str, counts.get(str)+1);
                else counts.set(str, 1);
              }
          }
          scf.close();
        }
      }
      catch (Exception e) {
        err.println("ERRO: " + e.getMessage());
      }
    }
    out.println(counts.toString("Results:\n", ";\n", "\nEnd"));
    out.println(counts.toString()); // mesma lista, outro formato
    mostFrequent(counts);
  }

  // Find and print the key with most occurrences
  // and its relative frequency.
  static void mostFrequent(KeyValueList<Integer> counts) {
    String freqkey = "";
    int freq = 0;
    int totalWords = 0;
    String[] keys = counts.keys();
    
    for(int i=0;i<counts.size();i++){
      if(counts.get(keys[i]) > freq){
        freq = counts.get(keys[i]);
        freqkey = keys[i];
      }
      totalWords += counts.get(keys[i]);
    }
    double percentage = (double)freq / (double)totalWords * 100;
    System.out.printf("Most frequent: %s (%4.2f", freqkey, percentage);
    System.out.println("%)");  
    }
}

