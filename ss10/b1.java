interface Shape{
    double getArea();
    double getPerimeter();
}

class Circle implements Shape{
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public double getPerimeter() {
        return 2 *  Math.PI  *r;
    }
}

class Rectangle implements Shape{
    double width;
    double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width  * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
}