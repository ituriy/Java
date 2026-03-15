package ru.ituriy.mypackage;

public class ImmutableContainer {
    private final MutablePoint point;

    public ImmutableContainer(MutablePoint point) {
        if (point == null) {
            throw new IllegalArgumentException("Point cannot be null");
        }
        this.point = new MutablePoint(point.getX(), point.getY());
    }

    public MutablePoint getPoint() {
        return new MutablePoint(this.point.getX(), this.point.getY());
    }

    @Override
    public String toString() {
        return "ImmutableContainer{point=" + point + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ImmutableContainer)) return false;
        ImmutableContainer that = (ImmutableContainer) o;
        return point.equals(that.point);
    }

    @Override
    public int hashCode() {
        return point.hashCode();
    }
}
