import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import unittesting.DictionarySpamFilterPolicy;
import unittesting.Message;
import unittesting.SpamFilter;
import unittesting.SpamFilterPolicy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class SpamFilterTest {

    List<String> list;
    SpamFilter myFilter;
    List<Message> listMessages;

    @Before
    public void setup() {
        list = Arrays.asList("aaa", "bbb", "ccc");
        myFilter = new SpamFilter(new DictionarySpamFilterPolicy(list));
        listMessages = new ArrayList<>();
        Message m1 = new Message("aaaa", "test");
        Message m2 = new Message("test", "bbbb");
        Message m3 = new Message("testccctest", "test");
        Message m4 = new Message("test", "testbbbb");
        listMessages.add(m1);
        listMessages.add(m2);
        listMessages.add(m3);
        listMessages.add(m4);
    }

    @Test
    public void testConstructorWithNull() {
        assertThrows(NullPointerException.class, () -> {
            SpamFilter filter = new SpamFilter(null);
        });
    }

    @Test
    public void testFilterArgumentNull() {
        List<Message> result = myFilter.filter(null);
        assert result.isEmpty() : "Expected an empty list, but got non-empty result.";
    }

    @Test
    public void testFilterArgumentEmptyList() {
        List<Message> result = myFilter.filter(new ArrayList<>());
        assert result.isEmpty() : "Expected an empty list, but got non-empty result.";
    }

    @Test
    public void testAllWordsSpam() {
        List<Message> result = myFilter.filter(listMessages);
        assertEquals(listMessages.size(), result.size());
    }

    @Test
    public void testNoWordsSpam() {
        List<String> newList = Arrays.asList("www", "eee", "rrr");
        SpamFilter myNewFilter = new SpamFilter(new DictionarySpamFilterPolicy(newList));
        List<Message> result = myNewFilter.filter(listMessages);
        assert result.isEmpty() : "Expected an empty list, but got non-empty result.";
    }

    @Test
    public void testFoundSomeSpan() {
        List<String> newList = Collections.singletonList("ccc");
        SpamFilter myNewFilter = new SpamFilter(new DictionarySpamFilterPolicy(newList));
        List<Message> result = myNewFilter.filter(listMessages);
        assertEquals(1, result.size());
    }

}
