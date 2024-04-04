package org.howard.edu.lsp.midterm.question2;

public class IntegerRange implements Range {
    private int lowerBound; //lower boundary of the range
    private int upperBound; //upper boundary of the range

    // Constructing an IntegerRange with specified lower and upper bounds
    public IntegerRange(int lower, int upper) {
        this.lowerBound = lower;
        this.upperBound = upper;
    }

    // checking if the range contains the given value
    @Override
    public boolean contains(int value) {
        return value >= lowerBound && value <= upperBound;
    }

    // Checking if this given range overlaps with another range
    @Override
    public boolean overlaps(Range other) {
        if (other instanceof IntegerRange) {
            IntegerRange otherRange = (IntegerRange) other;
            return this.lowerBound <= otherRange.upperBound && this.upperBound >= otherRange.lowerBound;
        }
        return false;
    }

    // Returns the size of the range
    @Override
    public int size() {
        return this.upperBound - this.lowerBound + 1;
    }

    // Overriding equals to check if two ranges are equal
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof IntegerRange)) return false;
        IntegerRange that = (IntegerRange) obj;
        return this.lowerBound == that.lowerBound && this.upperBound == that.upperBound;
    }

    // Overriding hashCode in accordance with equals
    @Override
    public int hashCode() {
        return java.util.Objects.hash(lowerBound, upperBound);
    }
}
