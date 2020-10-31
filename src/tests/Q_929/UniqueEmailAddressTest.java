package tests.Q_929;

import leetcode.normal.Q_929.UniqueEmailAddress;
import leetcode.normal.Q_977.SquaresOfaSortedArray;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class UniqueEmailAddressTest {
    @Test
    public void uniqueEmailAddress() {
        String[] A = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        UniqueEmailAddress solution = new UniqueEmailAddress();
        assertEquals(solution.numUniqueEmails(A), 2);
    }
}
