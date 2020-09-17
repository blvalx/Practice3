public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.3,"Красный");

        System.out.println(circle.getRadius());
        System.out.println(circle.getColor());

        circle.setColor("Синий");
        circle.setRadius(3.2);

        System.out.println(circle.getRadius());
        System.out.println(circle.getColor());
    }
}
