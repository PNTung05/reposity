abstract class Shape3D implements Comparable<Shape3D> {
    String name;

    Shape3D(String name){
        this.name = name;
    }
    
    public abstract void render();

    public String getName(){
        return name;
    }

    @Override
    public int CompareTo(Shape3D other){
        return this.name.compareTo(other.name);
    }
}