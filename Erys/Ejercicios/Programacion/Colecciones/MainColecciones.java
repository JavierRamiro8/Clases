package Programacion.Colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class MainColecciones {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Alberto");
        nombres.add("Ana");
        for (String ArrayListValues : nombres) {
            System.out.println("Contenido del ArrayList: "+ArrayListValues);
        }

        Map<String,Integer> edadesMap=new HashMap<>();
        edadesMap.put("Carlos",25);
        edadesMap.put("Carlos",30);
        edadesMap.put("Ana",30);
        edadesMap.put("Alberto",20);
        for(Map.Entry<String, Integer> entrada : edadesMap.entrySet()){
            System.out.println(entrada.getKey() +" tiene "+ entrada.getValue() +" años");
        }

        System.out.println("Ahora el treeMap");

        Map<String,Integer> MapaTree=new TreeMap<>();
        MapaTree.put("Carlos",25);
        MapaTree.put("Carlos",30);
        MapaTree.put("Ana",30);
        MapaTree.put("Alberto",20);
        for(Map.Entry<String, Integer> entradaTree : MapaTree.entrySet()){
            System.out.println(entradaTree.getKey() +" tiene "+ entradaTree.getValue() +" años");
        }
        System.out.println("Ahora el LinkedHashMap");

        Map<String,Integer> LinkedHashMap=new LinkedHashMap<>();
        LinkedHashMap.put("Carlos",25);
        LinkedHashMap.put("Carlos",30);
        LinkedHashMap.put("Ana",30);
        LinkedHashMap.put("Alberto",20);
        for(Map.Entry<String, Integer> entradaLinked : LinkedHashMap.entrySet()){
            System.out.println(entradaLinked.getKey() +" tiene "+ entradaLinked.getValue() +" años");
        }
    }
}
