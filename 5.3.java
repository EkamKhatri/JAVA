class Box {
    private float width, height, depth;
    public Box() { width = height = depth = 0;}
    public Box(float w, float h, float d) {
        width = w;
        height = h;
        depth = d;}
    public Box(Box b) {
        this.width = b.width;
        this.height = b.height;
        this.depth = b.depth;}
    public float getWidth() { return width; }
    public void setWidth(float width) { this.width = width; }
    public float getHeight() { return height; }
    public void setHeight(float height) { this.height = height; }
    public float getDepth() { return depth; }
    public void setDepth(float depth) { this.depth = depth; }
    public void displayVolume() {
        float volume = width * height * depth;
        System.out.println("Volume of Box = " + volume);
    }}
class BoxWeight extends Box {
    private float weight;
    public BoxWeight() {
        super();
        weight = 0;}
    public BoxWeight(float w, float h, float d, float weight) {
        super(w, h, d);
        this.weight = weight;}
    public BoxWeight(BoxWeight bw) {
        super(bw);
        this.weight = bw.weight;}
    public float getWeight() { return weight; }
    public void setWeight(float weight) { this.weight = weight; }
    public void displayWeight() {
        System.out.println("Weight of Box = " + weight);
    }}
public class BoxWeightDemo {
    public static void main(String[] args) {
        System.out.print("Ekam Khatri, 24csu335\n");
        BoxWeight bw1 = new BoxWeight(10, 20, 30, 40);
        bw1.displayVolume();
        bw1.displayWeight();
        BoxWeight bw2 = new BoxWeight();
        bw2.setWidth(5);
        bw2.setHeight(6);
        bw2.setDepth(7);
        bw2.setWeight(8);
        bw2.displayVolume();
        bw2.displayWeight();
        BoxWeight bw3 = new BoxWeight(bw1);
        bw3.displayVolume();
        bw3.displayWeight();
    }}


    
