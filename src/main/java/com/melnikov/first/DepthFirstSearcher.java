package com.melnikov.first;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//Поиск в глубину
public class DepthFirstSearcher {
    LinkedList<String> visitedCitiesCities = new LinkedList<>();
    public void search(Map<String, List<String>> graph, String start, String end){
        if (start.equals(end)){
            System.out.println("Got it!");
            visitedCitiesCities.add(start);
            System.out.println(visitedCitiesCities);
            return;
        }
        if (visitedCitiesCities.contains(start)){
            return;
        }
        visitedCitiesCities.add(start);
        for (String currentCity : graph.get(start)){
            if (!visitedCitiesCities.contains(currentCity)){
                search(graph, currentCity, end);
            }
        }
    }

}
