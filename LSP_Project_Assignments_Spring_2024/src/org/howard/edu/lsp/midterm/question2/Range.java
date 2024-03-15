package org.howard.edu.lsp.midterm.question2;

public interface Range {
    boolean contains(int value);
    boolean overlaps(Range other);
    int size();
}
