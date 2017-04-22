package com.adarsh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by adarshbhattarai on 3/28/17.
 */
class ZipCodeChallengeTest {

    @Test
    public void test1() {
        int[][] input = new int[][]{{94133,94133}, {94200,94299}, {94600,94699}};
        int[][] expected = new int[][]{{94133,94133}, {94200,94299}, {94600,94699}};
        int[][] result = new int[3][2];
       // assertEquals(true, true);
        result = ZipCodeChallenge.solution(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test2() {
        int[][] input =  new int[][]{{94133,94133}, {94200,94299}, {94226,94399} };
        int[][] expected = new int[][]{{94133,94133}, {94200,94399}};
        int[][] result = new int[2][2];
        result = ZipCodeChallenge.solution(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test3() {
        int[][] input = new int[][]{{5,10}, {11,13}, {2,10}, {15,3}};
        int[][] expected = new int[][]{{2,15}};
        int[][] result = new int[1][2];
        result = ZipCodeChallenge.solution(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test4() {
        int[][] input = new int[][]{{5,10}, {5,13}, {5,10}, {5,3}};
        int[][] expected = new int[][]{{3,13}};
        int[][] result = new int[2][2];
        result = ZipCodeChallenge.solution(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void test5() {
        int[][] input = new int[][]{{5,10}, {12,20} };
        int[][] expected = new int[][]{{5,10},{12,20}};
        int[][] result = new int[1][2];
        result = ZipCodeChallenge.solution(input);
        assertArrayEquals(expected, result);
    }


}