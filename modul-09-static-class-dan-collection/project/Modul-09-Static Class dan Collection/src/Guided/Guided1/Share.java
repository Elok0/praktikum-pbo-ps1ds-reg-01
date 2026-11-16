package Guided.Guided1;

public class Share {

    private int privateInt;
    private static int staticInt;

    public Share(int pr, int si) {
        this.privateInt = pr;
        Share.staticInt = si; // Direkomendasikan akses via nama class
    }

    @Override
    public String toString() {
        return privateInt + " " + staticInt;
    }
}
