package com.iofairy.test;

import com.iofairy.except.UnexpectedParameterException;
import com.iofairy.falcon.util.RangeUtils;
import com.iofairy.tuple.Tuple2;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author GG
 * @version 1.0
 * @date 2022/2/14 22:00
 */
public class RangeUtilsTest {
    @Test
    public void testDivideRange() {
        List<Tuple2<Long, Long>> ranges1 = RangeUtils.divideRange(0, 500, 5, 0);
        List<Tuple2<Long, Long>> ranges2 = RangeUtils.divideRange(-600, -100, 5, -0.1f);
        List<Tuple2<Long, Long>> ranges3 = RangeUtils.divideRange(-100, 400, 5, 0.1f);
        List<Tuple2<Long, Long>> ranges4 = RangeUtils.divideRange(2, 48900568, 6, -0.1f);
        System.out.println(ranges1);
        System.out.println(ranges2);
        System.out.println(ranges3);
        System.out.println(ranges4);

        assertEquals("[(beginInclusive: 0, endExclusive: 100), " +
                "(beginInclusive: 100, endExclusive: 200), " +
                "(beginInclusive: 200, endExclusive: 300), " +
                "(beginInclusive: 300, endExclusive: 400), " +
                "(beginInclusive: 400, endExclusive: 500)]", ranges1.toString());

        assertEquals("[(beginInclusive: -600, endExclusive: -478), " +
                "(beginInclusive: -478, endExclusive: -368), " +
                "(beginInclusive: -368, endExclusive: -269), " +
                "(beginInclusive: -269, endExclusive: -180), " +
                "(beginInclusive: -180, endExclusive: -100)]", ranges2.toString());

        assertEquals("[(beginInclusive: -100, endExclusive: -18), " +
                "(beginInclusive: -18, endExclusive: 72), " +
                "(beginInclusive: 72, endExclusive: 171), " +
                "(beginInclusive: 171, endExclusive: 280), " +
                "(beginInclusive: 280, endExclusive: 400)]", ranges3.toString());

        assertEquals("[(beginInclusive: 2, endExclusive: 10436576), " +
                "(beginInclusive: 10436576, endExclusive: 19829492), " +
                "(beginInclusive: 19829492, endExclusive: 28283116), " +
                "(beginInclusive: 28283116, endExclusive: 35891378), " +
                "(beginInclusive: 35891378, endExclusive: 42738813), " +
                "(beginInclusive: 42738813, endExclusive: 48900568)]", ranges4.toString());

    }

    @Test
    public void testDivideRange1() {
        assertThrows(UnexpectedParameterException.class, () -> RangeUtils.divideRange(0, 500, 1, 0));
        assertThrows(UnexpectedParameterException.class, () -> RangeUtils.divideRange(0, 4, 5, 0));
        assertThrows(UnexpectedParameterException.class, () -> RangeUtils.divideRange(0, 500, 5, -1));
    }
}
