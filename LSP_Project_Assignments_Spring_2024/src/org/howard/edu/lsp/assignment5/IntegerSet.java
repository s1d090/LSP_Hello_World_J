package org.howard.edu.lsp.assignment5;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a set of integers with various set operations.
 */
public class IntegerSet {
    private List<Integer> set;

    /**
     * Default constructor. Initializes an empty set.
     */
    public IntegerSet() {
        set = new ArrayList<>();
    }

    /**
     * Constructor with an initial set of integers.
     * 
     * @param set the initial set of integers
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = new ArrayList<>(set);
    }

    /**
     * Clears the set, removing all elements.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the number of elements in the set.
     * 
     * @return the size of the set
     */
    public int length() {
        return set.size();
    }

    /**
     * Checks if this set is equal to another object.
     * 
     * @param o the object to compare with
     * @return true if the object is an IntegerSet with the same elements, false otherwise
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntegerSet)) return false;
        IntegerSet other = (IntegerSet) o;
        return set.containsAll(other.set) && other.set.containsAll(set);
    }

    /**
     * Checks if the set contains a specific value.
     * 
     * @param value the value to check
     * @return true if the set contains the value, false otherwise
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest element in the set.
     * 
     * @return the largest element
     * @throws IntegerSetException if the set is empty
     */
    public int largest() throws IntegerSetException {
        if (set.isEmpty()) throw new IntegerSetException("Set is empty");
        return set.stream().max(Integer::compare).get();
    }

    /**
     * Returns the smallest element in the set.
     * 
     * @return the smallest element
     * @throws IntegerSetException if the set is empty
     */
    public int smallest() throws IntegerSetException {
        if (set.isEmpty()) throw new IntegerSetException("Set is empty");
        return set.stream().min(Integer::compare).get();
    }

    /**
     * Adds an element to the set if it is not already present.
     * 
     * @param item the element to add
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an element from the set if it is present.
     * 
     * @param item the element to remove
     */
    public void remove(int item) {
        set.remove((Integer) item);
    }

    /**
     * Performs a union operation with another set.
     * 
     * @param intSetb the other set to union with
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                set.add(item);
            }
        }
    }

    /**
     * Performs an intersection operation with another set.
     * 
     * @param intSetb the other set to intersect with
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Performs a difference operation with another set.
     * 
     * @param intSetb the other set to differentiate with
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Performs a complement operation with another set.
     * 
     * @param intSetb the other set to complement with
     */
    public void complement(IntegerSet intSetb) {
        List<Integer> complement = new ArrayList<>(intSetb.set);
        complement.removeAll(set);
        set = complement;
    }


    /**
     * Checks if the set is empty.
     * 
     * @return true if the set is empty, false otherwise
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a string representation of the set.
     * 
     * @return a string representation of the set
     */
    public String toString() {
        return set.toString();
    }
}