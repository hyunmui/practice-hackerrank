package com.flexibledev.hackerrank;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.flexibledev.hackerrank.solutions.Solution;
import com.flexibledev.hackerrank.solutions.SolutionImpl;

/**
 * Hacker Rank Runner
 */
public final class App {
    /**
     * App to run hacker rank solution
     * 
     * @param args The arguments of the program.
     * @throws InvocationTargetException
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    public static void main(final String[] args) {
        Solution solution = new SolutionImpl();
        solution.solve_question_07();
    }

    public static void runAllSolution(Solution solution) throws Exception {
        for (final Method method : Solution.class.getMethods()) {
            method.invoke(solution, new Object());
        }
    }
}
