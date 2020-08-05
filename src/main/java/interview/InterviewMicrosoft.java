package interview;


public class InterviewMicrosoft {

    public int solution(int[] A) {
        if (A == null || A.length <= 1) {
            return 0;
        }
        int oddIndexIsOne = 0, evenIndexIsZero = 0, oddIndexIsZero = 0, evenIndexIsOne = 0;
        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0) {
                if (A[i] == 1) {
                    evenIndexIsOne++;
                } else {
                    evenIndexIsZero++;
                }
            } else {
                if (A[i] == 1) {
                    oddIndexIsOne++;
                } else {
                    oddIndexIsZero++;
                }
            }
        }

        int maxCorrectValue = Math.max(
                (oddIndexIsOne + evenIndexIsZero),
                (oddIndexIsZero + evenIndexIsOne)
        );
        return A.length - maxCorrectValue;
    }
}
