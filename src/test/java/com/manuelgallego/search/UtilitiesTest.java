package com.manuelgallego.search;

import static com.manuelgallego.search.Mocks.getSortedData;
import static com.manuelgallego.search.Mocks.getUnsortedData;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import static com.manuelgallego.utilities.Utilities.isSortedList;
import static com.manuelgallego.utilities.Utilities.isNullEmptyList;
import static com.manuelgallego.utilities.Utilities.binarySearchAlgorithmFirstOrLastOccurrence;

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
	public final void validateBinarySearchAlgorithmIndexFirstOccurrence() {
		//given
	    int indexFirstOcurrence = -1;
	    int numberToFind = 4;
	    List<Integer> listSorted = null;
	    //when
	    listSorted = getSortedData();
	    indexFirstOcurrence = binarySearchAlgorithmFirstOrLastOccurrence(true, numberToFind, listSorted);
	    //then
	    Assert.assertEquals(indexFirstOcurrence, 5);
	}
	
	@Test
	public final void validateBinarySearchAlgorithmIndexLastOccurrence() {
		//given
	    int indexFirstOcurrence = -1;
	    int numberToFind = 4;
	    List<Integer> listSorted = null;
	    //when
	    listSorted = getSortedData();
	    indexFirstOcurrence = binarySearchAlgorithmFirstOrLastOccurrence(false, numberToFind, listSorted);
	    //then
	    Assert.assertEquals(indexFirstOcurrence, 7);
	}
	
	@Test
	public final void validateBinarySearchAlgorithmNotFoundFirstOccurrence() {
		//given
	    int indexFirstOcurrence = -1;
	    int numberToFind = 20;
	    List<Integer> listSorted = null;
	    //when
	    listSorted = getSortedData();
	    indexFirstOcurrence = binarySearchAlgorithmFirstOrLastOccurrence(true, numberToFind, listSorted);
	    //then
	    Assert.assertEquals(indexFirstOcurrence, -1);
	}
	
	@Test
	public final void validateBinarySearchAlgorithmNotFoundLastOccurrence() {
		//given
	    int indexFirstOcurrence = -1;
	    int numberToFind = 20;
	    List<Integer> listSorted = null;
	    //when
	    listSorted = getSortedData();
	    indexFirstOcurrence = binarySearchAlgorithmFirstOrLastOccurrence(false, numberToFind, listSorted);
	    //then
	    Assert.assertEquals(indexFirstOcurrence, -1);
	}

}
