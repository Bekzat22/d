public class Skeleton extends Boss {
    int arrow;

    public int getArrow() {
        return arrow;
    }

    @Override
    public String printInfo() {
        return super.printInfo()+";Number of arrow- "+getArrow();
    }
}
