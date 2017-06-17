package com.manuelgallego.starter;

import com.manuelgallego.search.BinarySearchImplement;
import com.manuelgallego.search.Search;
import com.manuelgallego.utilities.Utilities;
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
    int numberForSearchInstances = 0;
    if (args == null  || args.length < 1) {
      System.out.println("End of execution, not found the param required.");
      return;
    }
    List<Integer> indexOcurrencesOfNumber = new ArrayList<Integer>();
    try {
      numberForSearchInstances = Integer.parseInt(args[0]);
      List<Integer> sortedDataInput = null;
      if (args.length > 1) {
        sortedDataInput = new ArrayList<Integer>();
        for (int i = 1; i < args.length; i++) {
          sortedDataInput.add( Integer.parseInt(args[i]) );
        }
      } else {
        sortedDataInput = Utilities.getDefaultSortedData();
      }
      Search search = new BinarySearchImplement();
      indexOcurrencesOfNumber = search.searchInstanceOfNumber(numberForSearchInstances, sortedDataInput);
    } catch (Exception e) {
      System.out.println("Error :" + e.getMessage());
    }
    System.out.println("Indices of instances found :");
    for (Integer indexOcurence: indexOcurrencesOfNumber) {
      System.out.println( " " + indexOcurence );
    }
    System.out.println("End of execution.");
  }

}
