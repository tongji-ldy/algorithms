package leetCode;

import java.util.ArrayList;

public class JumpFloor {
    public int jumpFloor(int target) {
        int a = 1;
        int b = 2;
        int c = 0;
        if (target <= 0) return -1;
        else if (target <= 2) return target;
        else {
            for (int i = 2; i < target; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }
}
