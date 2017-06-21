package com.manuelgallego.search;

import static com.manuelgallego.search.Mocks.getSortedData;
import static com.manuelgallego.search.Mocks.getUnsortedData;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import static com.manuelgallego.utilities.Utilities.isSortedList;
import static com.manuelgallego.utilities.Utilities.isNullEmptyList;
import static com.manuelgallego.utilities.Utilities.binarySearchAlgorithmOlogN;

public class UtilitiesTest {

  @Test
  public final void validateIsSortedListMethodWithSortedInput() {
    //given
    boolean isSorteList = false;
    List<Integer> listSorted = getSortedData();
    //when
    isSorteList = isSortedList(listSorted);
    //then
    Assert.assertTrue(isSorteList);
  }

  @Test
  public final void validateIsSortedListMethodWithUnsortedInput() {
    //given
    boolean isSorteList = false;
    List<Integer> listSorted = getUnsortedData();
    //when
    isSorteList = isSortedList(listSorted);
    //then
    Assert.assertFalse(isSorteList);
  }

  @Test
  public final void validateIsNullEmptyList() {
    //given
    boolean isNullList = false;
    List<Integer> listSorted = new ArrayList<Integer>();
    //when
    isNullList = isNullEmptyList(listSorted);
    //then
    Assert.assertTrue(isNullList);
  }

  @Test
  public final void validateBinarySearchAlgorithmIndexOneOccurrence() {
    //given
    int indexOcurrence = -1;
    int numberToFind = 2;
    List<Integer> listSorted = null;
    //when
    listSorted = getSortedData();
    indexOcurrence = binarySearchAlgorithmOlogN(numberToFind, listSorted);
    //then
    Assert.assertEquals(indexOcurrence, 4);
  }

  @Test
  public final void validateBinarySearchAlgorithmIndexTwoOccurrence() {
    //given
    int indexOcurrence = -1;
    int numberToFind = 5;
    List<Integer> listSorted = null;
    //when
    listSorted = getSortedData();
    indexOcurrence = binarySearchAlgorithmOlogN(numberToFind, listSorted);
    //then
    Assert.assertTrue(indexOcurrence == 8 || indexOcurrence == 9);
  }

  @Test
  public final void validateBinarySearchAlgorithmIndexCeroOccurrence() {
    //given
    int indexOcurrence = -1;
    int numberToFind = 20;
    List<Integer> listSorted = null;
    //when
    listSorted = getSortedData();
    indexOcurrence = binarySearchAlgorithmOlogN(numberToFind, listSorted);
    //then
    Assert.assertEquals(indexOcurrence, -1);
  }

}
