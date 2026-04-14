class Pyramid extends Shape3D {

    public Pyramid(String name) {
        super(name);
    }

    @Override
    public void render() {
        System.out.println("Pyramid: " + name);
    }
}