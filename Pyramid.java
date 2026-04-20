public class Pyramid extends Shape3D {
    double height;
    public Pyramid(String name, String color, double baseSize, double height){super(name,color,baseSize);this.height=height;}
    @Override public void render(){System.out.println("Pyramid: "+name+", color="+color+", baseSize="+size+", height="+height);}
    @Override public String toString(){return getClass().getSimpleName()+"[name="+name+",color="+color+",baseSize="+size+",height="+height+"]";}
}
