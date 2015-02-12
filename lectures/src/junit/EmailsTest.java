package junit;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class EmailsTest {

    @Test
    public void testGetUsersBasic() throws Exception {
        Emails emails = new Emails("foo bart@cs.edu xyz marge@ms.com baz");
        assertEquals(Arrays.asList("bart", "marge"), emails.getUsers());
        // Note: Arrays.asList(...) is a handy way to make list literal.
        // Also note that .equals() works for collections, so the above works.

    }

    // Weird chars -- push on what chars are allowed
    @Test
    public void testUsersChars() {
        Emails emails = new Emails("fo f.ast@cs.edu bar&a.2.c@ms.com ");
        assertEquals(Arrays.asList("f.ast", "a.2.c"), emails.getUsers());
    }

    // Hard cases -- push on unusual, edge cases
    @Test
    public void testUsersHard() {

        Emails emails = new Emails("x y@cs 3@ @z@");
        assertEquals(Arrays.asList("y", "3", "z"), emails.getUsers());

        // No emails
        emails = new Emails("no emails here!");
        assertEquals(Collections.emptyList(), emails.getUsers());

        // All @, all the time!
        emails = new Emails("@@@");
        assertEquals(Collections.emptyList(), emails.getUsers());

        // Empty string
        emails = new Emails("");
        assertEquals(Collections.emptyList(), emails.getUsers());
    }

}

















