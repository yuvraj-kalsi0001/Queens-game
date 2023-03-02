import java.lang.Math;
import java.util.*;

/* YOU NEED TO ADD YOUR CODE TO THIS CLASS, REMOVING ALL DUMMY CODE
 *
 * DO NOT CHANGE THE NAME OR SIGNATURE OF ANY OF THE EXISTING METHODS
 * (Signature includes parameter types, return types and being static)
 *
 * You can add private methods to this class if it makes your code cleaner,
 * but this class MUST work with the UNMODIFIED Tester.java class.
 *
 * This is the ONLY class that you can submit for your assignment.
 *
 * MH 2021
 */
public class Queens
{
    private static int boardSize = 10;
    
    // creates a valid genotype with random values
    public static Integer [] randomGenotype()
    {
        Integer [] genotype = new Integer [boardSize];
        
        // YOUR CODE GOES HERE
        // DUMMY CODE TO REMOVE:
        genotype = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // END OF YOUR CODE
        
        return genotype;
    }
    
    // swaps 2 genes in the genotype
    // the swap happens with probability p, so if p = 0.8
    // then 8 out of 10 times this method is called, a swap happens
    public static Integer[] swapMutate(Integer[] genotype, double p)
    {
        // YOUR CODE GOES HERE
        // DUMMY CODE TO REMOVE:
        genotype = new Integer[]{ 1, 2, 3, 8, 7, 6, 5, 4, 9, 10 };
        // END OF YOUR CODE
        
        return genotype;
    }
    
    // creates 2 child genotypes using the 'cut-and-crossfill' method
    public static Integer[][] cutAndCrossfill(Integer[] parent0, Integer[] parent1)
    {
        Integer [][] children = new Integer [2][boardSize];
        
        // YOUR CODE GOES HERE
        // DUMMY CODE TO REMOVE:
        children[0] = new Integer[]{ 5, 4, 2, 6, 8, 1, 10, 9, 7, 3 };
        children[1] = new Integer[]{ 6, 2, 5, 7, 3, 9, 1, 10, 4, 8 };
        // END OF YOUR CODE
        
        return children;
    }
    
    // calculates the fitness of an individual
    public static int measureFitness(Integer [] genotype)
    {
        /* The initial fitness is the maximum pairs of queens
         * that can be in check (all possible pairs in check).
         * So we are using it as the maximum fitness value.
         * We deduct 1 from this value for every pair of queens
         * found to be in check.
         * So, the lower the score, the lower the fitness.
         * For a 10x10 board the maximum fitness is 45 (no checks),
         * and the minimum fitness is 0 (all queens in a line).
         */
        int fitness = (int) (0.5 * boardSize * (boardSize - 1));
        
        // YOUR CODE GOES HERE
        
        return fitness;
    }
}
