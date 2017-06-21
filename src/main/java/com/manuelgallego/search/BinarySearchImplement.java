package com.manuelgallego.search;

import java.util.ArrayList;
import java.util.List;

import static com.manuelgallego.utilities.Utilities.isNullEmptyList;
import static com.manuelgallego.utilities.Utilities.isSortedList;
import static com.manuelgallego.utilities.Utilities.binarySearchAlgorithmOlogN;

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
    if (isNullEmptyList(dataSortedInput)) {
      return false;
    }
    if (!isSortedList(dataSortedInput)) {
      throw new UnsupportedOperationException("This implementation is for binary search, only for a sorted list.");
    }
    return isCorrectInput;
  }

  /**
   * Apply a binary search of a given number in a given list of integers.
   * @param numberToFind: number to find the first or last occurrence index.
   * @param dataSortedInput: set of data to search.
   */
  private List<Integer> binarySearchInstanceOfNumber(int numberToFind, List<Integer> dataSortedInput) {
    List<Integer> instancesOfNumber = new ArrayList<Integer>();
    int indexOccurence = binarySearchAlgorithmOlogN(numberToFind, dataSortedInput);
    if (indexOccurence != -1) {
      instancesOfNumber = getAllIndexOfNumberFound(numberToFind, dataSortedInput, indexOccurence);
    }
    return instancesOfNumber;
  }

  /**
   * Get all index, befor and after the index where the number was found.
   * @param numberToFind: number to find the first or last occurrence index.
   * @param dataSortedInput: set of data to search.
   * @param indexOccurence: Index where the number was found.
   */
  private List<Integer> getAllIndexOfNumberFound(int numberToFind, List<Integer> dataSortedInput, int indexOccurence) {
    List<Integer> instancesOfNumber = new ArrayList<Integer>();
    instancesOfNumber.add(indexOccurence);
    int beforeOccurence = indexOccurence - 1;
    while (indexOccurence > 0 && numberToFind == dataSortedInput.get(beforeOccurence)) {
      instancesOfNumber.add(beforeOccurence);
      beforeOccurence = beforeOccurence - 1;
    }
    int afterOccurence = indexOccurence + 1;
    while (afterOccurence <= dataSortedInput.size() && numberToFind == dataSortedInput.get(afterOccurence)) {
      instancesOfNumber.add(afterOccurence);
      afterOccurence = afterOccurence + 1;
    }
    return instancesOfNumber;
  }

}
