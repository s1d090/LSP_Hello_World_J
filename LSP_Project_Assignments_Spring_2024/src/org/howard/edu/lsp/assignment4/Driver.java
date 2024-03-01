package org.howard.edu.lsp.assignment4;
/**
 * The Driver class is used to demonstrate and test the functionality of the IntegerSet class.
 * This class contains the main method which acts as the entry point for the program.
 */
public class Driver { 
	/**
     * The main method where the program execution begins.
     * This method will create IntegerSet objects and perform various operations
     * to demonstrate the capabilities of the IntegerSet class.
     *
     * @param args Command line arguments passed to the program (not used in this program).
     */
    public static void main(String[] args) {
        // Test default constructor
        IntegerSet set1 = new IntegerSet();
        System.out.println("Set1 (empty): " + set1);

        // Test add and toString
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Set1 (after adding 1, 2, 3): " + set1);

        // Test contains
        System.out.println("Set1 contains 2: " + set1.contains(2));
        System.out.println("Set1 contains 4: " + set1.contains(4));

        // Test remove
        set1.remove(2);
        System.out.println("Set1 (after removing 2): " + set1);

        // Test largest and smallest
        try {
            System.out.println("Largest in Set1: " + set1.largest());
            System.out.println("Smallest in Set1: " + set1.smallest());
        } catch (IntegerSetException e) {
            System.out.println(e.getMessage());
        }

        // Test union
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Set2: " + set2);
        set1.union(set2);
        System.out.println("Set1 union Set2: " + set1);

        // Reset set1 for further tests
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Test intersect
        set1.intersect(set2);
        System.out.println("Set1 intersect Set2: " + set1);

        // Reset set1 for further tests
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Test diff
        set1.diff(set2);
        System.out.println("Set1 diff Set2: " + set1);

        // Reset set1 for further tests
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Test complement
        set1.complement(set2);
        System.out.println("Set1 complement Set2: " + set1);

        // Test isEmpty
        System.out.println("Set1 is empty: " + set1.isEmpty());

        // Test clear
        set1.clear();
        System.out.println("Set1 (after clear): " + set1);

        // Test equals
        set1.add(1);
        set1.add(2);
        IntegerSet set3 = new IntegerSet();
        set3.add(2);
        set3.add(1);
        System.out.println("Set1 equals Set3: " + set1.equals(set3));
    }
}