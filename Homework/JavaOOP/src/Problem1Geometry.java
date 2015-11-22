import java.util.Arrays;
import java.util.Comparator;

public class Problem1Geometry {
    public static void main(String[] args) {
        PlaneShape[] planeShapes = new PlaneShape[] {
                new Circle(5, 8, 12),
                new Rectangle(3, 7, 10, 5),
                new Rectangle(-1.5, 0, 2, 6),
                new Circle(0, 0, 2.5),
                new Triangle(15, 25, 8),
        };

        SpaceShape[] spaceShapes = new SpaceShape[] {
                new Sphere(7, 6, 11),
                new Cuboid(10, 5, 4),
                new SquarePyramid(5, 5, 7),
                new Cuboid(2, 1, 2),
        };

        for (PlaneShape shape : planeShapes) {
            System.out.printf("%s --> area =  %.2f\n", shape, shape.getArea());
        }
        System.out.println();
        for (PlaneShape shape : planeShapes) {
            System.out.printf("%s --> perimeter =  %.2f\n", shape, shape.getPerimeter());
        }
        System.out.println();
        for (SpaceShape spaceShape : spaceShapes) {
            System.out.printf("%s --> volume = %.2f\n", spaceShape, spaceShape.getVolume());
        }
        System.out.println();
        for (SpaceShape spaceShape : spaceShapes) {
            System.out.printf("%s --> area = %.2f\n", spaceShape, spaceShape.getArea());
        }

        System.out.println("\nFiltered\n");
        Arrays.stream(spaceShapes).filter(s -> s.getVolume() > 40.0)
                .forEach(x -> {
                    System.out.printf("%s --> volume = %.2f\n",
                            x, x.getVolume());
                }
        );
        System.out.println();
        Arrays.sort(planeShapes, new Comparator<PlaneShape>() {
            @Override
            public int compare(PlaneShape o1, PlaneShape o2) {
                return Double.compare(o1.getPerimeter(), o2.getPerimeter());
            }
        });

        for (PlaneShape shape : planeShapes) {
            System.out.printf("%s --> perimeter =  %.2f\n", shape, shape.getPerimeter());
        }
    }
}
