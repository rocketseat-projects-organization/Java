package je_26_java_nio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaRead {
    public static void main(String[] args) {
        String directory = "C:\\Users\\User\\Desktop\\Testes\\_Curso\\";
//        Ler(directory);
        Escrever(directory);
    }

    /// Realiza a leitura de arquivos
    public static void Ler(String directory) {
        try {
            // Localiza o arquivo
            Path path = Paths.get(directory + "aula.txt");

            // Lendo o path e convertendo todos os caracteres (bytes) de uma só vez
            byte[] bytesArquivo =  Files.readAllBytes(path);
            System.out.println("Bytes de arquivo:\n" + bytesArquivo);

            // Lê o arquivo todo de uma só vez
            String texto = Files.readString(path);
            System.out.println("String Única:\n" + texto);

            // Lê o arquivo e armazena cada linha separadamente
            System.out.println("Lista com todas as linhas separadas:");
            List<String> linhas = Files.readAllLines(path);
            for (String l : linhas) {
                System.out.println(l);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /// Realiza a escrita em arquivos
    public static void Escrever(String directory) {
        try {
            // Escreve todo conteudo de uma vez no arquivo
            String conteudo = "linha nova";
            Path path = Paths.get(directory + "aula.txt");
            Files.write(path, conteudo.getBytes(StandardCharsets.UTF_8));

            // Escreve o conteudo linha a linha
            StringBuilder sb = new StringBuilder();
            List<String> linhas = new ArrayList<>();
            linhas.add("Linha 1");
            linhas.add("Linha 2");
            linhas.add("Linha 3");
            linhas.forEach(n -> sb.append(n + "\n"));

            Files.write(path, sb.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
