package com.manuelgallego.utilities;

import java.util.ArrayList;
import java.util.List;

public class Utilities {

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

  public static boolean isSortedList(List<Integer> listSorted) {
    boolean isSortedList = true;
    if (Utilities.isNullList(listSorted)) {
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

  public static boolean isNullList(List<Integer> list) {
    boolean isNullOrEmpty = false;
    if (list == null || list.size() == 0) {
      isNullOrEmpty = true;
    }
    return isNullOrEmpty;
  }
}
