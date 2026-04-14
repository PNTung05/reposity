class Cube extends Shape3D {
    public Cube(String name){
        super(name);

    }

    @Override
    public void render(){
        System.out.println("Cube:" + name);
    }
}