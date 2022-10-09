package com.melnikov.first;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//Поиск с ограничением глубины
public class LimitedDepthSearcher {
    List<String> visitedCities = new LinkedList<>();
    public void search(Map<String, List<String>> graph, String start, String end, int depth, int limit){
        if (start.equals(end)){
            System.out.println("Got it at depth: " + depth + ".");
            visitedCities.add(start);
            System.out.println(visitedCities);
            return;
        }
        if (visitedCities.contains(start)){
            return;
        }
        depth++;
        visitedCities.add(start);
        for(String currentCity: graph.get(start)){
            if (!visitedCities.contains(currentCity) && depth <= limit){
                search(graph, currentCity, end, depth, limit);
            }
        }
    }
}