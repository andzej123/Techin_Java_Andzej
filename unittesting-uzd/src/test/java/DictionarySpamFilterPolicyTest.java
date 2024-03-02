import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import unittesting.DictionarySpamFilterPolicy;
import unittesting.Message;
import unittesting.SpamFilter;
import unittesting.SpamFilterPolicy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class DictionarySpamFilterPolicyTest {

    List<String> list;
    SpamFilterPolicy filter;

    @Before
    public void setup() {
        list = Arrays.asList("aaa", "bbb", "ccc");
        filter = new DictionarySpamFilterPolicy(list);
    }

    @Test
    public void testConstructorWithNull() {
        assertThrows(NullPointerException.class, () -> {
            SpamFilterPolicy myFilter = new DictionarySpamFilterPolicy(null);
        });
    }

    @Test
    public void testMethodWithNullArgument() {
        assertFalse(filter.isSpam(null));
    }

    @Test
    public void testMessageSubjectNull() {
        boolean answer = filter.isSpam(new Message(null, "aaa"));
        assertTrue(answer);
    }

    @Test
    public void testMessageTextNull() {
        boolean answer = filter.isSpam(new Message("akaka", null));
        assertFalse(answer);
    }

    @Test
    public void testSpamMessageCaseSensitive() {
        boolean answer = filter.isSpam(new Message("aAa", "Bbb"));
        assertFalse(answer);

    }
}
