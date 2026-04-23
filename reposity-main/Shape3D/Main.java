import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Shape3D> shapes = new ArrayList<>();

        while (true) {
            Shape3D shape = readShape(sc);
            if (shape != null) {
                shapes.add(shape);
            }
            if (!"y".equalsIgnoreCase(prompt(sc, "Continue? (y/n): "))) {
                break;
            }
        }

        System.out.println("\n=== Before Sort ===");
        System.out.println(shapes);

        Collections.sort(shapes);

        System.out.println("\n=== After Sort ===");
        shapes.forEach(System.out::println);

        System.out.println("\n=== Render ===");
        shapes.forEach(Shape3D::render);
    }

    private static Shape3D readShape(Scanner sc) {
        System.out.println("\nShape:");
        System.out.println("1. Cube");
        System.out.println("2. Sphere");
        System.out.println("3. Pyramid");
        int choice = (int) promptDouble(sc, "Choose: ");

        String name = prompt(sc, "Enter name: ");
        String color = prompt(sc, "Enter color: ");

        switch (choice) {
            case 1:
                return new Cube(name, color, promptDouble(sc, "Enter edge: "));
            case 2:
                return new Sphere(name, color, promptDouble(sc, "Enter radius: "));
            case 3:
                return new Pyramid(name, color, promptDouble(sc, "Enter base size: "), promptDouble(sc, "Enter height: "));
            default:
                System.out.println("Invalid!");
                return null;
        }
    }

    private static String prompt(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    private static double promptDouble(Scanner sc, String message) {
        System.out.print(message);
        double value = sc.nextDouble();
        sc.nextLine();
        return value;
    }
}
