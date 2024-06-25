package com.krk.programmers;

import java.util.*;

public class Solution42Dot02 {

    private Map<String, List<String>> adjacencyList = new HashMap<>();

    public void addEdge(String node1, String node2) {
        adjacencyList.computeIfAbsent(node1, k -> new ArrayList<>()).add(node2);
        adjacencyList.computeIfAbsent(node2, k -> new ArrayList<>()).add(node1);
    }

    public List<String> findNodesWithDistance2(String startNode) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(startNode);
        visited.add(startNode);

        while (!queue.isEmpty()) {
            String currentNode = queue.poll();

            if (adjacencyList.containsKey(currentNode)) {
                for (String neighbor : adjacencyList.get(currentNode)) {
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        queue.add(neighbor);

                        // 거리가 2인 노드 찾기
                        if (adjacencyList.containsKey(neighbor)) {
                            for (String secondNeighbor : adjacencyList.get(neighbor)) {
                                if (!visited.contains(secondNeighbor)) {
                                    result.add(secondNeighbor);
                                }
                            }
                        }
                    }
                }
            }
        }

        return result;
    }

    public List<String> findMostFrequent(List<String> inputList) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;

        // 각 요소들의 개수를 센다
        for (String element : inputList) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
            maxFrequency = Math.max(maxFrequency, frequencyMap.get(element));
        }

        // 가장 많이 등장한 요소를 추가 한다.
        List<String> mostFrequentElements = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                mostFrequentElements.add(entry.getKey());
            }
        }

        return mostFrequentElements;
    }

    public String[] solution(String[][] friends, String user_id) {

        for (int i = 0; i < friends.length; i++) {
            addEdge(friends[i][0], friends[i][1]);
        }

        List<String> nodesWithDistance2 = findNodesWithDistance2(user_id);
        List<String> r = findMostFrequent(nodesWithDistance2);
        Collections.sort(r);

        String[] answer = new String[r.size()];
        for (int i = 0; i < r.size(); i++) {
            answer[i] = r.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution42Dot02 graph = new Solution42Dot02();
        String[][] arr = {{"david", "frank"},
        {"demi", "david"},
        {"frank", "james"},
        {"demi", "james"},
        {"claire", "frank"}};

        System.out.println(Arrays.toString(graph.solution(arr, "david")));
        System.out.println(Arrays.toString(graph.solution(new String[][]{
                {"david", "demi"}, {"frank", "demi"}, {"demi", "james"}
        }, "frank")));

    }
}
