package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TaskTest {
    @Test
    public void testWhenSimpleTaskFound() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить");





        boolean actual = simpleTask.matches("Позвонить");

        Assertions.assertTrue(actual);
    }
    @Test
    public void testWhenSimpleTaskNotFound() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");





        boolean actual = simpleTask.matches("Написать");

        Assertions.assertFalse(actual);
    }
    @Test
    public void testEpicTaskFound() {

        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);





        boolean actual = epic.matches("Яйца");

        Assertions.assertTrue(actual);
    }
    @Test
    public void testWhenMeetingFound() {
           Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");
                boolean actual = meeting.matches("НетоБанка");

        Assertions.assertTrue(actual);
    }





}

