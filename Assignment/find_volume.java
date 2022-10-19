public class find_volume {
    void volume(int s) {
        System.out.println("Volume of cube : " + s * s * s);
    }

    void volume(int I, int b, int h) {
        System.out.println("volume of cuboid : " + I * b* h);
    }

    void volume(double r) {
        System.out.println("Volume of Sphere : " + (4/3 * 3.14 * r * r * r));
    }

    public static void main(String[] args) {
        find_volume fv = new find_volume();
        fv.volume(5);
        fv.volume(4, 5, 8);
        fv.volume(6.7);

    }
    
}
