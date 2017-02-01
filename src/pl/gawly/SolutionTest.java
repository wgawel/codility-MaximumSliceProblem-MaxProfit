package pl.gawly;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void testZero() {
        Assert.assertEquals(0, s.solution(new int[]{}));
    }

    @Test
    public void testOne() {
        Assert.assertEquals(0, s.solution(new int[]{5}));
    }

    @Test
    public void testEx1() {
        int[] A = new int[6];
        A[0] = 23171;
        A[1] = 21011;
        A[2] = 21123;
        A[3] = 21366;
        A[4] = 21013;
        A[5] = 21367;
        Assert.assertEquals(356, s.solution(A));
    }

    @Test
    public void testEx2() {
        int[] A = new int[6];
        A[0] = 923171;
        A[1] = 821011;
        A[2] = 721123;
        A[3] = 621366;
        A[4] = 521013;
        A[5] = 421367;
        Assert.assertEquals(0, s.solution(A));
    }
}
