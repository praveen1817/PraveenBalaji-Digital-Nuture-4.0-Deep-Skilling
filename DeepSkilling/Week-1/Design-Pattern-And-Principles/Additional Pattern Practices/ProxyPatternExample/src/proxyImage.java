public class proxyImage implements Image{
    private String imgName;
    private realImage rImage;
    public proxyImage(String imgName){
        this.imgName=imgName;
    }

    @Override
    public void display(String imgName) {
        if (rImage==null){
            rImage =new realImage(imgName);
        }
        rImage.display(imgName);
    }
}
