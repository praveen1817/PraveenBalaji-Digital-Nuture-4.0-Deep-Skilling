public class testImageProxy {
    public static void main(String[] args) {
        Image loadImage=new proxyImage("elephant.jpg");
        loadImage.display("elephant.jpg");
        loadImage.display("elephant.jpg");
    }
}
