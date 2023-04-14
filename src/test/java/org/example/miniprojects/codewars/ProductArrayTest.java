package org.example.miniprojects.codewars;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ProductArrayTest {

    @Test
    public void sampleTest() {
        assertEquals("[20, 12]", Arrays.toString(ProductArray.productArray(new int[]{12, 20})));
    }

    @Test
    public void sampleTest2() {
        assertEquals("[180, 600, 360, 300, 900]", Arrays.toString(ProductArray.productArray(new int[]{10, 3, 5, 6, 2})));
    }

}