package com.melnikov.first;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//Поиск с итеративным углублением
public class IterateDepthSearcher {
    private void limitedDepthSearch(Map<String, List<String>> graph, String start, String end, List<String> visitedCities, int depth, int limit){
        if (start.equals(end)){
            visitedCities.add(start);
            System.out.println("Got it at depth: " + depth + ".");
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
                limitedDepthSearch(graph, currentCity, end, visitedCities, depth, limit);
            }
        }
    }

    public void search(Map<String, List<String>> graph, String start, String end, int startDepth, int limit){
        int cur = startDepth;
        while (cur <= limit){
            List<String> visitedCities = new LinkedList<>();
            limitedDepthSearch(graph, start , end, visitedCities, 0, cur);
            boolean check = check(visitedCities, start, end);
            if (check){
                return;
            }
            else {
                System.out.println("No result was found at depth: " + cur + ". Increasing depth.");
                cur++;
            }
        }
        System.out.println("Reached limit and haven't got any results.");
    }

    private boolean check(List<String> list, String start, String end){
        return list.contains(start)&&list.contains(end);
    }
}
