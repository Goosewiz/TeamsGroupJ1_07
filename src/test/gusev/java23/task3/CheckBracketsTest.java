package gusev.java23.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckBracketsTest {

    @Test
    void checkBrackets() {
        String input = "";
        int answer = CheckBrackets.checkBrackets(input);
        assertEquals(-1, answer);
        input = "()[]{}";
        answer = CheckBrackets.checkBrackets(input);
        assertEquals(-1, answer);
        input = ")";
        answer = CheckBrackets.checkBrackets(input);
        assertEquals(0, answer);
        input = "[";
        answer = CheckBrackets.checkBrackets(input);
        assertEquals(1, answer);
        input = "{}}";
        answer = CheckBrackets.checkBrackets(input);
        assertEquals(2, answer);
        input = "[fkv}";
        answer = CheckBrackets.checkBrackets(input);
        assertEquals(4, answer);//в задании указано 5, но, мне кажется, что это ошибка
        input = "(12 + A[0]) / ((b{0, 1} - c {6, n})  * 2)";
        answer = CheckBrackets.checkBrackets(input);
        assertEquals(-1, answer);
        input = "(((((()[[]]){()})())[[[]]]){[][]})";
        answer = CheckBrackets.checkBrackets(input);
        assertEquals(-1, answer);
        input = "{[(])}";
        answer = CheckBrackets.checkBrackets(input);
        assertEquals(3, answer);
        input = "{a[b(c)b}a";
        answer = CheckBrackets.checkBrackets(input);
        assertEquals(8, answer);
    }
}