package com.example.tasks;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.asList;

public class Main {

    //Exercise 1
    public static boolean isPalindrome(String word) {

        int length = word.length();
        if (length == 1) {
            return true;
        }

        boolean palindrome_check = true;
        // Nese eshte palindrome nuk ka nevoje te
        // kontrollojme dhe gjysmen e dyte.
        for (int i = 0; i < Math.round(length / 2); i++) {

            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                palindrome_check = false;
            }
        }
        return palindrome_check;
    }

    //Exercise 7
    static void spiralFill(int m, int n, int spiral[][]) {
        int value = 1;

        int minCol = 0;

        int maxCol = n - 1;

        int minRow = 0;

        int maxRow = m - 1;

        while (value <= m * n) {
            for (int i = minRow; i <= maxRow; i++) {
                spiral[i][minCol] = value;

                value++;
            }

            for (int i = minCol + 1; i <= maxCol; i++) {
                spiral[maxRow][i] = value;

                value++;
            }

            for (int i = maxRow - 1; i >= minRow; i--) {
                spiral[i][maxCol] = value;

                value++;
            }

            for (int i = maxCol - 1; i >= minCol + 1; i--) {
                spiral[minRow][i] = value;

                value++;
            }

            minCol++;

            minRow++;

            maxCol--;

            maxRow--;
        }

    }


    //Exercise 2
    public static boolean areIdenticalObjects(Object firstObject, Object secondObject){

        try {
            boolean areIdentical = true;

            Field[] properties = firstObject.getClass().getDeclaredFields();
            for (Field f : properties) {

                String fieldName = f.getName();
                Object fieldValue1 = f.get(firstObject);
                Object fieldValue2 = f.get(secondObject);
                // System.out.println(fieldValue1);
                //System.out.println(fieldValue2);

                if (fieldValue1 != fieldValue2) {
                    areIdentical = false;
                }
            }

            return areIdentical;
        } catch (Exception e) {
            return false;
        }

    }

    //Exercise 5
    public static boolean isSumEqualToFirstNumber(ArrayList<Integer> array) {

        int firstNumber = array.get(0);
        int sum = 0;
        for (int i = 1; i < array.size(); i++) {
            sum += array.get(i);
        }
        return firstNumber == sum;
    }

    //Exercise 7
    public static int findNetworkEndpoint(int startNodeId, ArrayList<Integer> fromIds, ArrayList<Integer> toIds) {

        if (fromIds.size() > 1000 || toIds.size() > 1000 || fromIds.size() == 0 || toIds.size() == 0) {
            throw new RuntimeException("Please respect constrains!");
        }

        Integer indexOfFromId;
        Integer firstIndex = fromIds.indexOf(startNodeId);
        Integer endId = toIds.get(firstIndex);
        indexOfFromId = fromIds.indexOf(endId);

        while (indexOfFromId != -1) {
            endId = toIds.get(indexOfFromId);
            indexOfFromId = fromIds.indexOf(endId);
        }
        return endId;
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        System.out.println("Exercise 1 START\n");
        System.out.println("Case 1: " + isPalindrome("oscaracso"));
        System.out.println("Case 2: " + isPalindrome("oscarracso"));
        System.out.println("Case 3: " + isPalindrome("osacso"));
        System.out.println("Exercise 1 END\n");

        Dog pitbull = new Dog("Reksi", 1);
        Dog pitbull1 = new Dog("Reksi", 1);
        Cat whiteCat = new Cat("Oscar");
        Dog pastor = new Dog("Schneider", 2);

        System.out.println("Exercise 2 START\n");
        System.out.println("Case 1: " + areIdenticalObjects(pitbull1, pitbull));
        System.out.println("Case 2: " + areIdenticalObjects(pastor, pitbull));
        System.out.println("Case 3: " + areIdenticalObjects(whiteCat, pitbull));
        System.out.println("Exercise 2 END\n");

        Class klasaA = new Class("9A");
        Class klasaB = new Class("9B");

        Pupil ester1 = new Pupil("Estera", "Skana", 1, 21, 10);
        Pupil ester2 = new Pupil("Estera", "Skana", 2, 21, 10);
        Pupil ester3 = new Pupil("Estera", "Skana", 3, 21, 10);
        Pupil ester4 = new Pupil("Estera", "Skana", 4, 21, 10);
        Pupil ester5 = new Pupil("Estera", "Skana", 5, 21, 10);
        Pupil ester6 = new Pupil("Estera", "Skana", 6, 21, 10);
        Pupil ester7 = new Pupil("Estera", "Skana", 7, 21, 10);
        Pupil ester8 = new Pupil("Estera", "Skana", 8, 21, 10);
        Pupil ester9 = new Pupil("Estera", "Skana", 9, 21, 10);
        Pupil ester10 = new Pupil("Estera", "Skana", 10, 21, 10);

        Teacher teacher1 = new Teacher("Sedian", "Skana", "Driving", klasaA);
        Teacher teacher2 = new Teacher("Sedian", "Skana", "Math", klasaB);


        klasaA.addPupil(new ArrayList<>(asList(ester1, ester2, ester3, ester4, ester5)));
        klasaB.addPupil(new ArrayList<>(asList(ester6, ester7, ester8, ester9, ester10)));

        System.out.println("Exercise 3 START\n");
        System.out.println("Teacher 1: " + teacher1.getClassCustody());
        System.out.println("Teacher 2: " + teacher2.getClassCustody());
        System.out.println("Exercise 3 END\n");

        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(14, 2, 3, 4, 5));

        System.out.println("Exercise 5 START\n");
        System.out.println("Case 1 (is not equal): " + isSumEqualToFirstNumber(arrayList1));
        System.out.println("Case 2 (is equal): " + isSumEqualToFirstNumber(arrayList2));
        System.out.println("Exercise 5 END\n");

        int m = 4, n = 5;
        int spiral[][] = new int[100][100];
        spiralFill(m, n, spiral);
        System.out.println("Exercise 4 START\n");
        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral.length; j++) {
                if (spiral[i][j] != 0) {
                    System.out.print(spiral[i][j] + "\t");
                }
            }

            if (spiral[i][0] != 0) {
                System.out.println();
            }
        }
        System.out.println("Exercise 4 END\n");

        ArrayList<Integer> fromIds = new ArrayList<>(Arrays.asList(1, 7, 3, 4, 2, 6, 9));
        ArrayList<Integer> toIds = new ArrayList<>(Arrays.asList(3, 3, 4, 6, 6, 9, 5));
        //ArrayList<Integer> toIds = new ArrayList<>(Arrays.asList());


        System.out.println("Exercise 6 START\n");
        System.out.println("Endpoint node is: " + findNetworkEndpoint(3, fromIds, toIds));
        System.out.println("Exercise 6 END\n");

        //Exercise 4
    //        ArrayList<Integer> series = new ArrayList<>(Arrays.asList(1, 2, 3));
    //        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>(Arrays.asList(
    //                new ArrayList<>(Arrays.asList(0, 1, 2, 3)),
    //                new ArrayList<>(Arrays.asList(0, 0, 0, 0)),
    //                new ArrayList<>(Arrays.asList(0, 1, 4, 6)),
    //                new ArrayList<>(Arrays.asList(1, 2, 0, 0)),
    //                new ArrayList<>(Arrays.asList(0, 0, 0, 0))));
    //
    //        Matrix matrix1 = new Matrix(matrix, series);
    //        matrix1.findCoordinates(matrix,series);
    }
}

