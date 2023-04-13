package DienThoai;

public class Nokia extends Mobile{
    @Override
    public void downloadApp() {
        super.downloadApp();
        System.out.println("Download app in CHplay");
    }
}
 class AndroidTest {
    public static void main(String[] args) {
        Nokia Nokia = new Nokia();
        Iphone Iphone = new Iphone();
        Nokia.downloadApp();
        Iphone.downloadApp();
    }
}

