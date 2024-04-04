package org.howard.edu.lsp.midterm.question2;

public interface Range {
	// Determines if the given value falls within the range.
    boolean contains(int value);
    // Checks if there is any overlap between this range and another range.
    boolean overlaps(Range other);
    // Calculates the number of integers within the range.
    int size();
}
