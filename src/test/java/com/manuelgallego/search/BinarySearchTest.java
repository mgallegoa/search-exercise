package com.manuelgallego.search;

import static com.manuelgallego.search.Mocks.getDefaultSortedData;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Test a binary search in a sorted list.
 *
 * @author Manuel Gallego
 */
public class BinarySearchTest {

  List<Integer> defaultSortedDataInput = new ArrayList<Integer>();

  @Before
  public void before() {
    defaultSortedDataInput = getDefaultSortedData();
  }

  @Test
  public final void findOneInstacesOfNumber() {
    //given
    int numberForSearchInstances = 10;
    //when
    Search search = new BinarySearchImplement();
    List<Integer> instancesOfNumber = search.searchInstanceOfNumber(numberForSearchInstances, defaultSortedDataInput);
    //then
    assert (instancesOfNumber.size() == 1);
    assert (instancesOfNumber.get(0) == 12);
  }

  @Test
  public final void findZeroInstacesOfNumber() {
    //given
    int numberForSearchInstances = 30;
    //when
    Search search = new BinarySearchImplement();
    List<Integer> instancesOfNumber = search.searchInstanceOfNumber(numberForSearchInstances, defaultSortedDataInput);
    //then
    assert (instancesOfNumber.size() == 1);
    assert (instancesOfNumber.get(0) == -1);
  }

  @Test
  public final void findNegativeNumber() {
    //given
    int numberForSearchInstances = -30;
    //when
    Search search = new BinarySearchImplement();
    List<Integer> instancesOfNumber = search.searchInstanceOfNumber(numberForSearchInstances, defaultSortedDataInput);
    //then
    assert (instancesOfNumber.size() == 1);
    assert (instancesOfNumber.get(0) == -1);
  }

  @Test
  public final void findFourInstacesOfNumber() {
    //given
    int numberForSearchInstances = 7;
    //when
    Search search = new BinarySearchImplement();
    List<Integer> instancesOfNumber = search.searchInstanceOfNumber(numberForSearchInstances, defaultSortedDataInput);
    //then
    assert (instancesOfNumber.size() == 4);
    assert (instancesOfNumber.get(0) == 6);
    assert (instancesOfNumber.get(1) == 7);
    assert (instancesOfNumber.get(2) == 8);
    assert (instancesOfNumber.get(3) == 9);
  }

  @Test
  public final void findTwoInstacesOfNumber() {
    //given
    int numberForSearchInstances = 2;
    //when
    Search search = new BinarySearchImplement();
    List<Integer> instancesOfNumber = search.searchInstanceOfNumber(numberForSearchInstances, defaultSortedDataInput);
    //then
    assert (instancesOfNumber.size() == 1);
    assert (instancesOfNumber.get(0) == 2);
  }

  @Test
  public final void findInstacesOfNumberValidateNull() {
    //given
    int numberForSearchInstances = 2;
    //when
    Search search = new BinarySearchImplement();
    List<Integer> instancesOfNumber = search.searchInstanceOfNumber(numberForSearchInstances, null);
    //then
    assert (instancesOfNumber.size() == 1);
    assert (instancesOfNumber.get(0) == -1);
  }

}
