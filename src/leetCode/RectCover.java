package leetCode;

public class RectCover {
    public int rectCover(int target) {
        if (target <= 2) return target;
        else return rectCover(target - 2) + rectCover(target - 1);
    }
}
