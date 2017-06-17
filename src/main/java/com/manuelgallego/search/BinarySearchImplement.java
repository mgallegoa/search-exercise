package com.manuelgallego.search;

import java.util.ArrayList;
import java.util.List;

import com.manuelgallego.utilities.Utilities;

/**
 * Implement a binary search algorithm.
 *
 * @author Manuel Gallego
 */
public class BinarySearchImplement implements Search {

  /*
   * @see co.manuelgallego.search.searchInstanceOfNumber
   */
  public List<Integer> searchInstanceOfNumber(int numberToFind, List<Integer> dataSortedInput) {
    List<Integer> instancesOfNumber = new ArrayList<Integer>();
    if (isValidBinarySearchDataInput(dataSortedInput)) {
      instancesOfNumber = this.binarySearchInstanceOfNumber(numberToFind, dataSortedInput);
    }
    if (instancesOfNumber.size() == 0) {
      instancesOfNumber.add(-1);
    }
    return instancesOfNumber;
  }

  /**
   * Validate the input is correct for a binary search of O(log (n)).
   * @param dataSortedInput: set of data to search.
   */
  private boolean isValidBinarySearchDataInput(List<Integer> dataSortedInput) {
    boolean isCorrectInput = true;
    if (Utilities.isNullList(dataSortedInput)) {
      return false;
    }
    if (!Utilities.isSortedList(dataSortedInput)) {
      throw new UnsupportedOperationException("This implement is for binary search in a sorted list.");
    }
    return isCorrectInput;
  }

  /**
   * Apply a binary search of a given number in a given list of integers.
   * @param numberToFind: number to find the first or last ocurrence index.
   * @param dataSortedInput: set of data to search.
   */
  private List<Integer> binarySearchInstanceOfNumber(int numberToFind, List<Integer> dataSortedInput) {
    List<Integer> instancesOfNumber = new ArrayList<Integer>();
    int initialOccurence = binarySearchAlgorithmFirstOrLastOccurrence(true, numberToFind, dataSortedInput);
    int finalOccurence = binarySearchAlgorithmFirstOrLastOccurrence(false, numberToFind, dataSortedInput);
    if (initialOccurence != -1 && finalOccurence != -1) {
      for (int i = initialOccurence; i <= finalOccurence; i++) {
        instancesOfNumber.add(i);
      }
    }
    return instancesOfNumber;
  }

  /**
   * Implement a binary search, return the first or the last index ocurrence of a given number in a given list of integers.
   * @param isFirstOccurrence: indicate if search the first ocurrence of number in the input list.
   * @param numberToFind: number to find the first or last ocurrence index.
   * @param dataSortedInput: set of data to search.
   */
  private int binarySearchAlgorithmFirstOrLastOccurrence(boolean isFirstOccurrence, int numberToFind, List<Integer> dataSortedInput) {
    int index = -1;
    int lowIndex = 0;
    int highIndex = dataSortedInput.size() - 1;
    while (lowIndex <= highIndex) {
      int middleIndex = (highIndex - lowIndex) / 2 + lowIndex;
      if (dataSortedInput.get(middleIndex) > numberToFind) {
        highIndex = middleIndex - 1;
      } else if (dataSortedInput.get(middleIndex) == numberToFind) {
        index = middleIndex;
        if (isFirstOccurrence) {
          highIndex = middleIndex - 1;
        } else {
          lowIndex = middleIndex + 1;
        }
      } else
        lowIndex = middleIndex + 1;
    }
    return index;
  }

}
