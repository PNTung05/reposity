import java.util.*;

public class Main {
    public static void main(String[] args){
        List<Shape3D> shapes = new ArrayList<>();

        shapes.add(new Cube("C1"));
        shapes.add(new Cube("C3"));
        shapes.add(new Sphere("S1"));        
        shapes.add(new Cube("C4"));
        shapes.add(new Sphere("S2"));
        shapes.add(new Cube("C2"));
        shapes.add(new Pyramid("P3"));
        shapes.add(new Pyramid("P1"));
        shapes.add(new Sphere("S3"));
        shapes.add(new Pyramid("P2"));

        Collections.sort(shapes);
        for (Shape3D s : shapes)Ơ
        System.out.println(s.getName());

        System.out.println("\n===Render===");
        for (Shape3D s: shapes){
            s.render();
        }
    }
}