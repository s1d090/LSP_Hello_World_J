package org.howard.edu.lsp.midterm.question2;

public class RangeTester {

    public static void main(String[] args) {
        IntegerRange range1 = new IntegerRange(1, 10);
        IntegerRange range2 = new IntegerRange(5, 15);

        System.out.println("Range1 contains 5: " + range1.contains(5)); // Expected: true
        System.out.println("Range1 overlaps Range2: " + range1.overlaps(range2)); // Expected: true
        System.out.println("Range1 size: " + range1.size()); // Expected: 10

        // Testing equality
        IntegerRange range3 = new IntegerRange(1, 10);
        System.out.println("Range1 equals Range3: " + range1.equals(range3)); // Expected: true

        // Testing non-overlapping range
        IntegerRange range4 = new IntegerRange(11, 20);
        System.out.println("Range1 overlaps Range4: " + range1.overlaps(range4)); // Expected: false

	}

}
