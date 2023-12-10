package gusev.java23.task2;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LovedThingsTest {

    @Test
    void testCheck() {
        LovedThings lt = new LovedThings();
        lt.addInfo("Сергей: а, б, в");
        lt.addInfo("Сергей: а, б, в");
        lt.addInfo("Сергей: а, б, в");
        Set<String> answer = lt.findThingsAllLove();
        assertEquals(3, answer.size(), "findThingsAllLove");
        answer = lt.findAll();
        assertEquals(3, answer.size(), "findAll");
        answer = lt.personalPreferences("Сергей");
        assertEquals(3, answer.size(), "personalPreferences");
        Integer answerI = lt.countOfThing("а");
        assertEquals(1, answerI, "countOfThing");
        answerI = lt.countOfThing("б");
        assertEquals(1, answerI, "countOfThing");
        answerI = lt.countOfThing("в");
        assertEquals(1, answerI, "countOfThing");
        lt = new LovedThings();
        lt.addInfo("Сергей: a");
        answer = lt.findThingsAllLove();
        assertEquals(1, answer.size(), "findThingsAllLove");
        answer = lt.findAll();
        assertEquals(1, answer.size(), "findAll");
        answer = lt.personalPreferences("Сергей");
        assertEquals(1, answer.size(), "personalPreferences");
        answerI = lt.countOfThing("a");
        assertEquals(1, answerI, "countOfThing");
        lt = new LovedThings();
        lt.addInfo("Сергей: a, б");
        lt.addInfo("Виктор: в, г");
        answer = lt.findThingsAllLove();
        assertEquals(0, answer.size(), "findThingsAllLove");
        answer = lt.findAll();
        assertEquals(4, answer.size(), "findAll");
        answer = lt.personalPreferences("Сергей");
        assertEquals(2, answer.size(), "personalPreferences");
        answerI = lt.countOfThing("a");
        assertEquals(1, answerI, "countOfThing");
        answerI = lt.countOfThing("в");
        assertEquals(1, answerI, "countOfThing");
        lt = new LovedThings();
        lt.addInfo("Сергей: а, б");
        lt.addInfo("Виктор: а, б");
        lt.addInfo("Сергей: а");
        lt.addInfo("Виктор: а");
        answer = lt.findThingsAllLove();
        assertEquals(1, answer.size(), "findThingsAllLove");
        answer = lt.findAll();
        assertEquals(1, answer.size(), "findAll");
        answer = lt.personalPreferences("Сергей");
        assertEquals(0, answer.size(), "personalPreferences");
        answerI = lt.countOfThing("а");
        assertEquals(2, answerI, "countOfThing");
        answerI = lt.countOfThing("б");
        assertEquals(null, answerI, "countOfThing");
    }
}