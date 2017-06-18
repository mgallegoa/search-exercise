package com.manuelgallego.starter;

import com.manuelgallego.search.BinarySearchImplement;
import com.manuelgallego.search.Search;
import static com.manuelgallego.utilities.Utilities.getDefaultSortedData;
import java.util.ArrayList;
import java.util.List;

/**
 * Start the binary search of a number.
 *
 * @author Manuel Gallego
 */
public class BinarySearchStarter {

  public static void main(String[] args) {
    System.out.println("Starting the execution.");
    if (!isExistMinimumParams(args)) {
      return;
    }
    Search search = new BinarySearchImplement();
    List<Integer> indexOcurrencesOfNumber = new ArrayList<Integer>();
    int numberForSearchInstances = 0;
    try {
      numberForSearchInstances = Integer.parseInt(args[0]);
      List<Integer> sortedDataInput = getSortedDataInput(args);
      indexOcurrencesOfNumber = search.searchInstanceOfNumber(numberForSearchInstances, sortedDataInput);
    } catch (Exception e) {
      System.out.println("Error :" + e.getMessage());
    }
    printIndexesOfElementSearched(indexOcurrencesOfNumber);
    System.out.println("End of execution.");
  }

  /**
   * Evaluate if exist the minimum input element necessary for the execution of the program.
   * @param args: Array of string with the input data.
   */
  private static boolean isExistMinimumParams(String[] args) {
	  boolean isExistMinParam = true;
	  if (args == null  || args.length < 1) {
		  isExistMinParam = false;
		  System.out.println("End of execution, not found the param required.");
	  }
	  return isExistMinParam;
  }

  /**
   * Get the list of the integer parameters.
   * @param args: Array of string with the input data.
   */
  private static List<Integer> getSortedDataInput(String[] args) {
      List<Integer> sortedDataInput = null;
      if (args.length > 1) {
        sortedDataInput = new ArrayList<Integer>();
        for (int i = 1; i < args.length; i++) {
          sortedDataInput.add( Integer.parseInt(args[i]) );
        }
      } else {
        sortedDataInput = getDefaultSortedData();
      }
      return sortedDataInput;
  }
  
  /**
   * Print the output of the search indexes algorithm.
   * @param args: Array of string with the input data.
   */
  private static void printIndexesOfElementSearched(List<Integer> indexOcurrencesOfNumber) {
	  System.out.println("Indices of instances found :");
	  for (Integer indexOcurence: indexOcurrencesOfNumber) {
		  System.out.println( " " + indexOcurence );
	  }
  }

}
