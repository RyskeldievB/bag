public class Skeleton extends Boss {
    private int skeletonArrows;

    public int getSkeletonArrows() {
        return skeletonArrows;
    }

    public void setSkeletonArrows(int skeletonArrows) {
        this.skeletonArrows = skeletonArrows;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " Arrows: " + skeletonArrows;
    }
}
