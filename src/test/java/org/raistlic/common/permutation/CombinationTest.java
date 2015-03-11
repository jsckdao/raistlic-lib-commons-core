package org.raistlic.common.permutation;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by caoke on 2015/3/11.
 */
public class CombinationTest {
    
    @Test
    public void test() {
        int i = 0;
        for(List<Integer> list : Combination.of(Arrays.asList(1, 2, 3, 4, 5), 3)) {
            i++;
            System.out.println(list);
        }

        Assert.assertTrue(i == 10);

    }
}
