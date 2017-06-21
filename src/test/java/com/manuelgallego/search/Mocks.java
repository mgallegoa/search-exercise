package com.manuelgallego.search;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is only for mock data to validate the binary search program.
 *
 * @author Manuel Gallego
 */
public class Mocks {

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

  /**
   * Get a sorted list of integer numbers.
   */
  public static List<Integer> getSortedData() {
    List<Integer> defaultSortedData = new ArrayList<Integer>();
    defaultSortedData.add(0);
    defaultSortedData.add(0);
    defaultSortedData.add(0);
    defaultSortedData.add(1);
    defaultSortedData.add(2);
    defaultSortedData.add(4);
    defaultSortedData.add(4);
    defaultSortedData.add(4);
    defaultSortedData.add(5);
    defaultSortedData.add(5);
    defaultSortedData.add(6);
    defaultSortedData.add(6);
    defaultSortedData.add(6);
    defaultSortedData.add(9);
    return defaultSortedData;
  }

  /**
   * Get an unsorted list of integer numbers.
   */
  public static List<Integer> getUnsortedData() {
    List<Integer> defaultSortedData = new ArrayList<Integer>();
    defaultSortedData.add(0);
    defaultSortedData.add(1);
    defaultSortedData.add(5);
    defaultSortedData.add(3);
    defaultSortedData.add(7);
    defaultSortedData.add(5);
    defaultSortedData.add(9);
    return defaultSortedData;
  }

}
