package exercise;

class Segment {
    private Point end;
    private  Point begin;

    public Segment(Point begin, Point end) {
        this.end = end;
        this.begin = begin;
    }

    public Point getEndPoint() {
        return end;
    }

    public Point getBeginPoint() {
        return begin;
    }

    public Point getMidPoint() {
        return new Point((begin.getX() + end.getX()) / 2, (begin.getY() + end.getY()) / 2);
    }
}