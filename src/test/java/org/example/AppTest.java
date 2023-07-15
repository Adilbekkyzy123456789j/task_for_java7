package org.example;

import junit.framework.TestCase;

public class AppTest extends TestCase {
    private final static Task task = new Task();

    public void testGetSum() {
        int sum1 = task.getSum(345);
        int sum2 = task.getSum(167);
        int sum3 = task.getSum(325);

        assertEquals(sum1,12);
        assertEquals(sum2,14);
        assertEquals(sum3,10);
    }

    public void testGetArray() {
        int max1 = task.getArray(new int[]{5, 9, 4, 12, 20, -2});
        int max2 = task.getArray(new int[]{1, 3, 14, 9, 7, -2});

        assertEquals(max1,5);
        assertEquals(max2,7);
    }

    public void testGetLastSymbol() {
        char last1 = task.getLastSymbol("Школа");
        char last2 = task.getLastSymbol("OsdgNz");

        assertEquals(last1,'ш');
        assertEquals(last2,'z');
    }

    public void testGetWord() {
        String word1 = task.getWord(new String[]{"delphin", "dream", "Los_Angeles"});
        String word2 = task.getWord(new String[]{"sdfg", "tgrsdf", "ojoisjdfos"});

        assertEquals(word1,"Los_Angeles");
        assertEquals(word2,"ojoisjdfos");
    }

    public void testGetMaxDuplicateWord() {
        String maxDuplicateWord1 = task.getMaxDuplicateWord(new String[]{"ручка", "телефон", "книга", "телефон", "ручка", "телефон"});
        String maxDuplicateWord2 = task.getMaxDuplicateWord(new String[]{"opo", "ppp", "sdf", "sdf", "owd", "sdf"});

        assertEquals(maxDuplicateWord1,"телефон");
        assertEquals(maxDuplicateWord2,"sdf");
    }

    public void testBuildArray() {
        int[] actual1 = new int[]{1,2,3,4,5,6,7,8};
        int[] actual2 = new int[]{1,2,3};

        int[] expected1 = task.buildArray(8);
        int[] expected2 = task.buildArray(3);
        for (int i = 0; i < actual1.length; i++) {
            assertEquals(actual1[i],expected1[i]);
        }
        for (int i = 0; i < actual2.length; i++) {
            assertEquals(actual2[i],expected2[i]);
        }

    }

    public void testMethod() {
        String res = task.method("Hello world, my name is Mr.Prospector");
        String expected =
                "Hello\n" +
                "world,\n" +
                "my\n" +
                "name\n" +
                "is\n" +
                "Mr.Prospector";
        assertEquals(res,expected);
    }

    public void testTestGetSum() {
        int[] sum = task.getSum(new int[]{2, 7, 11, 15}, 9);
        int [] expected = new int[]{0,1};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(sum[i],expected[i]);
        }
    }
}

