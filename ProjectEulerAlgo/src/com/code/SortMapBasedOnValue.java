package com.code;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapBasedOnValue {
  public static void main(String[] args) {
    Map<Integer, Integer> unsortedMap = Map.of(1, 3, 4, 22, 8, 55, 2, 6, 5, 7);
    sortBasedOnValueDESC(unsortedMap)
        .forEach(
            (k, v) -> {
              System.out.println("k:- " + k + " v:- " + v);
            });
  }

  public static Map<Integer, Integer> sortBasedOnValueDESC(Map<Integer, Integer> map) {
    Map<Integer, Integer> sortedMapByValueDESC =
        map.entrySet()
            .stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
            .collect(
                Collectors.toMap(
                    Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    return sortedMapByValueDESC;
  }
}
