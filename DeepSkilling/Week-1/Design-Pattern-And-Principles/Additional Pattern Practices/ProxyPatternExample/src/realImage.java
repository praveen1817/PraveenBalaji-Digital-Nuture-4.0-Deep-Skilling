public class realImage implements Image{
    private String imgName;
    public realImage(String imgName){
        this.imgName=imgName;
        remoteServerImage();
    }
    private void remoteServerImage(){
        System.out.println("Loading the Image from the Remote Server");
    }

    @Override
    public void display(String imgName) {
        System.out.println("The Loaded Image is "+imgName);
    }
}
