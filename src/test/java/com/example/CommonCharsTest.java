package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.example.CommonChars;
import com.example.Comparision;

public class CommonCharsTest {

  CommonChars chars = new CommonChars();

  @Test
  public void getComparision_givenTwoStrings_whenGetComparisionInvoke_shouldReturnCommonAndUniqueValues() {
    Comparision comparision = chars.getComparision("abc", "bcd");

    assertEquals("bc", comparision.getCommon());
    assertEquals("ad", comparision.getUnique());
  }


  @Test(expected = NullPointerException.class)
  public void getComparision_givenTwoStringsAreNull_whenGetComparisionInvoke_shouldReturnNullPointerException() {
    chars.getComparision(null, null);
  }
}
