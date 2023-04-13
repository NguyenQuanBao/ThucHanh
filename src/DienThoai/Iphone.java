package DienThoai;

public class Iphone extends Mobile{
    @Override
    public void downloadApp() {
        super.downloadApp();
        System.out.println("Download app in AppStore");
    }
}
