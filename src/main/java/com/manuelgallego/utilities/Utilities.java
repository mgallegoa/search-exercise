package com.manuelgallego.utilities;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class for the program of search.
 *
 * @author Manuel Gallego
 */
public class Utilities {

  /**
   * Evaluate if a list is a sorted list of integer numbers.
   * @param listSorted: list to evaluate.
   */
  public static boolean isSortedList(List<Integer> listSorted) {
    boolean isSortedList = true;
    if (Utilities.isNullEmptyList(listSorted)) {
      return false;
    }
    if (listSorted.size() == 1) {
      return isSortedList;
    }
    for (int i = 1; i < listSorted.size(); i++) {
      if (listSorted.get(i) < listSorted.get(i - 1)) {
        isSortedList = false;
        break;
      }
    }
    return isSortedList;
  }

  /**
   * Evaluate a list if it have or not elements.
   * @param list: list to evaluate.
   */
  public static boolean isNullEmptyList(List<Integer> list) {
    boolean isNullOrEmpty = false;
    if (list == null || list.size() == 0) {
      isNullOrEmpty = true;
    }
    return isNullOrEmpty;
  }

  /**
   * Implement a binary search, return the first or the last index occurrence of a given number in a given list of integers.
   * @param numberToFind : number to find the first or last occurrence index.
   * @param dataSortedInput : set of data to search.
   */
  public static int binarySearchAlgorithmOlogN(int numberToFind, List<Integer> dataSortedInput) {
    int index = -1;
    int lowIndex = 0;
    int highIndex = dataSortedInput.size() - 1;
    while (lowIndex <= highIndex) {
      int middleIndex = (highIndex - lowIndex) / 2 + lowIndex;
      if (dataSortedInput.get(middleIndex) > numberToFind) {
        highIndex = middleIndex - 1;
      } else if (dataSortedInput.get(middleIndex) == numberToFind) {
        index = middleIndex;
        break;
      } else {
        lowIndex = middleIndex + 1;
      }
    }
    return index;
  }

  /**
   * Get a default sorted list of integer numbers.
   */
  public static List<Integer> getDefaultSortedData() {
    List<Integer> defaultSortedData = new ArrayList<Integer>();
    defaultSortedData.add(0);
    defaultSortedData.add(1);
    defaultSortedData.add(2);
    defaultSortedData.add(4);
    defaultSortedData.add(4);
    defaultSortedData.add(6);
    defaultSortedData.add(7);
    defaultSortedData.add(7);
    defaultSortedData.add(7);
    defaultSortedData.add(7);
    defaultSortedData.add(8);
    defaultSortedData.add(9);
    defaultSortedData.add(10);
    defaultSortedData.add(12);
    defaultSortedData.add(15);
    defaultSortedData.add(15);
    return defaultSortedData;
  }
}
