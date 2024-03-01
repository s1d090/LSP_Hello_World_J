package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a set of integers without duplicates. It supports basic set operations like
 * addition, removal, union, intersection, difference, and complement, as well as utility
 * methods like checking if the set is empty, its size, and converting it to a string.
 */
public class IntegerSet {
    // Store the set elements in an ArrayList
    private List<Integer> set;

    /**
     * Default constructor that initializes the set as empty.
     */
    public IntegerSet() {
        set = new ArrayList<>();
    }

    /**
     * Constructor that initializes the set with a list of integers.
     * @param set A list of integers to initialize the set.
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = new ArrayList<>(set);
    }

    /**
     * Clears the internal representation of the set, removing all elements.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the size of the set.
     * @return The number of elements in the set.
     */
    public int length() {
        return set.size();
    }

    /**
     * Checks if this set is equal to another object. Two sets are considered equal
     * if they contain all of the same values in any order.
     * @param o The object to compare this set against.
     * @return true if the specified object is also an IntegerSet and the two sets contain
     * the same elements, false otherwise.
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntegerSet)) return false;
        IntegerSet other = (IntegerSet) o;
        return set.containsAll(other.set) && other.set.containsAll(set);
    }

    /**
     * Checks if the set contains a specific value.
     * @param value The value to search for in the set.
     * @return true if the set contains the specified value, false otherwise.
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest item in the set. Throws an IntegerSetException if the set is empty.
     * @return The largest integer in the set.
     * @throws IntegerSetException If the set is empty.
     */
    public int largest() throws IntegerSetException {
        if (set.isEmpty()) throw new IntegerSetException("Set is empty");
        return set.stream().max(Integer::compare).get();
    }

    /**
     * Returns the smallest item in the set. Throws an IntegerSetException if the set is empty.
     * @return The smallest integer in the set.
     * @throws IntegerSetException If the set is empty.
     */
    public int smallest() throws IntegerSetException {
        if (set.isEmpty()) throw new IntegerSetException("Set is empty");
        return set.stream().min(Integer::compare).get();
    }

    /**
     * Adds an item to the set if it is not already present.
     * @param item The item to add to the set.
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an item from the set, if it is present.
     * @param item The item to remove from the set.
     */
    public void remove(int item) {
        set.remove((Integer) item);
    }

    /**
     * Performs the union of this set with another set. The resulting set contains all
     * elements that are present in either set.
     * @param intSetb The other set to perform the union with.
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                set.add(item);
            }
        }
    }

    /**
     * Intersects this set with another set. The resulting set contains all elements that
     * are present in both sets.
     * @param intSetb The other set to intersect with.
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Finds the difference between this set and another set. The resulting set contains all
     * elements that are present in this set but not in the other.
     * @param intSetb The other set to find the difference with.
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Updates this set to the complement with respect to another set. The resulting set
     * contains all elements that are not present in the other set.
     * @param intSetb The other set to complement against.
     */
    public void complement(IntegerSet intSetb) {
        List<Integer> complement = new ArrayList<>(set);
        complement.removeAll(intSetb.set);
        set = complement;
    }

    /**
     * Checks if the set is empty.
     * @return true if the set is empty, false otherwise.
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a string representation of the set.
     * @return A string representation of the set.
     */
    public String toString() {
        return set.toString();
    }
}
