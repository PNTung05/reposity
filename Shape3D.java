public abstract class Shape3D implements Comparable<Shape3D> {
    String name, color;
    double size;
    Shape3D(String name, String color, double size){this.name=name;this.color=color;this.size=size;}
    Shape3D(String name){this(name,"default",1);}
    public abstract void render();
    @Override public String toString(){return getClass().getSimpleName()+"[name="+name+",color="+color+",dimension="+size+"]";}
    @Override public int compareTo(Shape3D other){return name.compareTo(other.name);}
}
