package Cap16.Maps;
// O programa conta o número de ocorrências de cada palavra em uma String

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ContadorPalavras {
    public static void main(String[] args) {
        
        Map<String, Integer> meuMapa = new HashMap<>();

        criandoMap(meuMapa);//cria o mapa com base na entrada do usuário
        mostrarMap(meuMapa);//exibe o conteudo do mapa

    }

    private static void criandoMap(Map<String, Integer> mapa) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a String");
        String input = sc.nextLine();

        //tokeniza a entrada
        String[] tokens = input.split(" ");
        for (String token : tokens) {
            String word = token.toLowerCase();//obtém a palavra em letras minusculas

            //se o mapa contiver a palvra
            if (mapa.containsKey(word)) {//a palavra está no mapa
                int cont = mapa.get(word);//obtém a contagem atual
                mapa.put(word, cont + 1);//incrementa a contagem
            }else{
                mapa.put(word, 1);//add a palavra com uma contagem de 1 para mapa
            }
        }
    }

    private static void mostrarMap(Map<String, Integer> mapa) {
        
        Set<String> chaves = mapa.keySet();//obtem chaves
        
        //classifica as chaves 
        TreeSet<String> sortChaves = new TreeSet<>(chaves);

        System.out.printf("%nMap contém:%nChave\t\tValor%n");

        // gera saída de cada chave no mapa
        for (String chave : sortChaves) {
            System.out.printf("%-10s%10s%n",chave, mapa.get(chave));

        }
        System.out.printf("%nsize: %d%nisEmpty: %b%n", mapa.size() , mapa.isEmpty());
    }
}