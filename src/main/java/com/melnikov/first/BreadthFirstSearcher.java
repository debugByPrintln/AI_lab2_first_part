package com.melnikov.first;

import com.melnikov.graph.GraphBuilder;

import java.util.*;

//Поиск в ширину
public class BreadthFirstSearcher {
    public void search(Map<String, List<String>> graph, String start, String end){
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.addAll(graph.get(start));
        List<String> visitedCitiesCities = new LinkedList<>();
        visitedCitiesCities.add(start);
        if (start.equals(end)){
            System.out.println("Got it!");
            System.out.println(visitedCitiesCities);
            return;
        }
        while (!queue.isEmpty()){
            String city = queue.pop();
            if (!visitedCitiesCities.contains(city)){
                if (city.equals(end)){
                    System.out.println("Got it!");
                    visitedCitiesCities.add(city);
                    System.out.println(visitedCitiesCities);
                    return;
                }
                else {
                    visitedCitiesCities.add(city);
                    queue.addAll(graph.get(city));
                }
            }
        }
    }
}
