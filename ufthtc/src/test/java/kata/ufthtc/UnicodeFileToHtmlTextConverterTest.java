package kata.ufthtc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by benwu on 14-6-10.
 */
public class UnicodeFileToHtmlTextConverterTest {
    @Test
    public void a_trivial_test() {
        assertEquals(5, 2 + 3);
    }

    // TODO-new-feature: Make the method convertToHtml() working for not only a file but also a string

    // TODO-acceptance-test: should convert ampersand
    // TODO-acceptance-test: should convert greater than and less than
    // TODO-acceptance-test: should add a line break for a new line
}
