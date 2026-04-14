class Sphere extends Shape3D {

    public Sphere(String name) {
        super(name);
    }

    @Override
    public void render() {
        System.out.println("Sphere: " + name);
    }
}