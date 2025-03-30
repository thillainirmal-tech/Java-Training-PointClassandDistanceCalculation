public class Point {

    private int x;
    private int y;

    // == Constructors ==
    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // == Getters and Setters ==
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // == Distance Methods ==
    public double distance() {
        return distance(0, 0);
    }

    public double distance(Point a) {
        if (a == null) {
            System.out.println("Invalid Point: Null reference passed.");
            return -1.0;  // Return a flag value
        }
        return distance(a.x, a.y);
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    @Override
    public String toString() {
        return String.format("Point(x: %d, y: %d)", x, y);
    }

    // == Main Method for Testing ==
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);

        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);

        System.out.printf("Distance from origin: %.2f%n", p1.distance());
        System.out.printf("Distance between p1 and p2: %.2f%n", p1.distance(p2));

        // Test null safety
        System.out.printf("Distance to null point: %.2f%n", p1.distance(null));

        // Test distance to specific coordinates
        System.out.printf("Distance from p1 to (10, 10): %.2f%n", p1.distance(10, 10));
    }
}
