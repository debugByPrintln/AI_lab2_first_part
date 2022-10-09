package com.melnikov.first;

import com.melnikov.graph.GraphBuilder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> graph = GraphBuilder.getGraph();
        String start = "Рига";
        String end = "Одесса";

        System.out.println("--------------Breadth search first algorithm--------------");
        BreadthFirstSearcher first = new BreadthFirstSearcher();
        first.search(graph, start, end);
        System.out.println("--------------Breadth search first algorithm--------------\n");


        System.out.println("--------------Depth search first algorithm--------------");
        DepthFirstSearcher second = new DepthFirstSearcher();
        second.search(graph, start, end);
        System.out.println("--------------Depth search first algorithm--------------\n");


        System.out.println("--------------Limited depth search algorithm--------------");
        LimitedDepthSearcher limitedDepthSearcher = new LimitedDepthSearcher();
        limitedDepthSearcher.search(graph, start, end, 0, 7);
        System.out.println("--------------Limited depth search algorithm--------------\n");

        System.out.println("--------------Iterate depth search algorithm--------------");
        IterateDepthSearcher iterateDepthSearcher = new IterateDepthSearcher();
        iterateDepthSearcher.search(graph, start, end, 1, 5);
        System.out.println("--------------Iterate depth search algorithm--------------\n");


        TwoWaysSearcher twoWaysSearcher = new TwoWaysSearcher();
        twoWaysSearcher.search(graph, start, end, 1,  6);

//        for (Map.Entry<String, List<String>> e: graph.entrySet()) {
//            ArrayList<String> strings = new ArrayList<>();
//            for (String s: e.getValue()) {
//                String a = "\"" + s + "\"";
//                strings.add(a);
//            }
//            System.out.println("\"" + e.getKey() + "\": " + strings + ",");
//        }
    }
}
