public class Cube extends Shape3D {
    public Cube(String name, String color, double size){super(name,color,size);}
    @Override public void render(){System.out.println("Cube: "+name+", color="+color+", edge="+size);}
}
