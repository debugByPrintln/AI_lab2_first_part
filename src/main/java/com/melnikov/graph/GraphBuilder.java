package com.melnikov.graph;

import java.lang.reflect.Array;
import java.util.*;

public class GraphBuilder {
    public static Map<String, List<String>> getGraph(){
        HashMap<String, List<String>> map = new HashMap<>();
        map.put("Даугавпилс", Arrays.asList("Вильнюс"));
        map.put("Каунас", Arrays.asList("Вильнюс", "Рига"));
        map.put("Калининград", Arrays.asList("Брест", "Вильнюс", "С.Петербург"));
        map.put("Донецк", Arrays.asList("Житомир", "Кишинев", "Москва", "Орел"));
        map.put("Казань", Arrays.asList("Москва", "Уфа"));

        map.put("Житомир", Arrays.asList("Киев", "Донецк", "Волгоград"));
        map.put("Ниж.Новгород", Arrays.asList("Витебск", "Москва"));
        map.put("Кишинев", Arrays.asList("Киев", "Донецк"));
        map.put("С.Петербург", Arrays.asList("Витебск", "Калининград", "Рига", "Москва", "Мурманск"));
        map.put("Киев", Arrays.asList("Вильнюс", "Житомир", "Кишинев", "Одесса", "Харьков"));

        map.put("Орел", Arrays.asList("Витебск", "Донецк", "Москва"));
        map.put("Одесса", Arrays.asList("Киев"));
        map.put("Рига", Arrays.asList("С.Петербург", "Каунас", "Таллин"));
        map.put("Таллин", Arrays.asList("Рига"));
        map.put("Уфа", Arrays.asList("Казань", "Самара"));

        map.put( "Самара", Arrays.asList("Уфа"));
        map.put("Симферополь", Arrays.asList("Харьков"));
        map.put("Минск", Arrays.asList("Москва", "Мурманск", "Ярославль"));
        map.put("Москва", Arrays.asList("Казань", "Ниж.Новгород", "Минск", "Донецк", "С.Петербург", "Орел"));
        map.put("Мурманск", Arrays.asList("С.Петербург", "Минск"));

        map.put("Брест", Arrays.asList("Вильнюс", "Витебск", "Калининград"));
        map.put("Вильнюс", Arrays.asList("Брест", "Калининград", "Каунас", "Киев", "Даугавпилс"));
        map.put("Витебск", Arrays.asList("Брест", "Вильнюс", "Воронеж", "Волгоград", "Ниж.Новгород", "С.Петербург", "Орел"));
        map.put("Воронеж", Arrays.asList("Витебск", "Волгоград", "Ярославль"));
        map.put("Волгоград", Arrays.asList("Воронеж", "Витебск", "Житомир"));

        map.put("Харьков", Arrays.asList("Киев", "Симферополь"));
        map.put("Ярославль", Arrays.asList("Воронеж", "Минск"));

        return map;
    }
}
