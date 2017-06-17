package com.manuelgallego.search;

import java.util.List;

/**
 * Interface for search algorithms.
 *
 * @author Manuel Gallego
 */
public interface Search {

  /**
   * Search instances of given number.
   *
   * @param number: a number for search instance.
   * @param dataInput: set of data for search.
   */
  List<Integer> searchInstanceOfNumber(int number, List<Integer> dataInput);

}
