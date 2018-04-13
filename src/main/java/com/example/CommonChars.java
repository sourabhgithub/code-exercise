package com.example;

import java.util.Set;
import java.util.TreeSet;

public class CommonChars {
  public Comparision getComparision(final String value1, final String value2) {

    Comparision comparision = new Comparision();

    Set<Character> uniqueString = new TreeSet<>();
    Set<Character> commonString = new TreeSet<>();

    getCompareAndUniqueString(value1, value2, uniqueString, commonString);

    for (int i = 0; i < value2.length(); i++) {
      if (!commonString.contains(value2.charAt(i))) {
        uniqueString.add(value2.charAt(i));
      }
    }

    comparision.setCommon(commonString.stream().map(e -> e.toString()).reduce("", String::concat));
    comparision.setUnique(uniqueString.stream().map(e -> e.toString()).reduce("", String::concat));
    return comparision;
  }

  private void getCompareAndUniqueString(final String value1, final String value2,
      Set<Character> uniqueString, Set<Character> commonString) {
    for (int i = 0; i < value1.length(); i++) {
      for (int j = 0; j < value2.length(); j++) {

        if (value1.charAt(i) == value2.charAt(j)) {
          commonString.add(value1.charAt(i));
          break;
        }
        if (j == value2.length() - 1) {
          uniqueString.add(value1.charAt(i));
        }

      }
    }
  }


}


