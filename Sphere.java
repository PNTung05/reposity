public class Sphere extends Shape3D {
    public Sphere(String name, String color, double radius){super(name,color,radius);}
    @Override public void render(){System.out.println("Sphere: "+name+", color="+color+", radius="+size);}
}
