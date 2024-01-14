package studentinfo;

import junit.framework.TestCase;
import java.util.*;

/**
 * Test the DateUtil class.
 * @author emaph
 */
public class DateUntilTest extends TestCase {

    public void testCreateDate() {
        DateUtil util = new DateUtil();
        Date date = util.createDate(2000, 1, 1);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        assertEquals(2000, calendar.get(Calendar.YEAR));
        assertEquals(Calendar.JANUARY, calendar.get(Calendar.MONTH));
        assertEquals(1, calendar.get(Calendar.DAY_OF_MONTH));
    }

}
