package org.example.miniprojects.codewars;

public class CatsAndShelves {
    public static int solution(int start, int finish)
    {
        if (finish <= 0) return 0;

        int stepsByThree = (finish - start) / 3;
        int stepsByOne = (finish - start) - stepsByThree * 3;

        return stepsByThree + stepsByOne;
    }
}
