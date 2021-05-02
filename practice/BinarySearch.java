package practice.algorithms;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {

  public static void main(String[] args) {
    //Given a sorted array and a search term, find the position of the search term in array
    BinarySearchImpl binarySearch = new BinarySearchImpl();
    Integer[] list = {32,13,12,52,23};
    int searchTerm = 23;
    int position = binarySearch.binarySearch(list, searchTerm);
    System.out.println("Position of search term is " + position);
  }
}

class BinarySearchImpl {
  public int binarySearch(Integer[] list, int searchTerm) {
    Collections.sort(Arrays.asList(list));

    System.out.println(list);

    return -1;

//    int start = 0;
//    int end = list.length;
//    int mid = (start+end)/2;
//
//    for(int i = 0; i < )
  }
}