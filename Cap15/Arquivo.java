package Cap15;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Arquivo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Entre como nome do arquivo ou diretório");

        Path path = Paths.get(input.nextLine());
        
        if (Files.exists(path)) {//se o caminho existe gera uma saida de informações dele
            
            //exibe as informações sobre o arquivo(ou diretorio)
            System.out.printf("%n%s exist%n",path.getFileName());
            System.out.printf("%s a diretório%n",Files.isDirectory(path) ? "Is":"Is not");
            System.out.printf("%s an absolute path%n",path.isAbsolute() ? "is" : "is not");
            //System.out.printf("Last modified: %s%n",Files.getLastModifiedTime(path));
            //System.out.printf("Size: %s%n", Files.size(path));
            System.out.printf("Path: %s%n", path );
            System.out.printf("Absolute path: %s%n", path.toAbsolutePath());
            

        }
    }
}