public class UserManager {
    public void login (User user) {
        System.out.println("Giriş İşlemi Yapıldı "+user.getName());
    }

    public void logout (User user) {
        System.out.println("Çıkış İşlemi Yapıldı "+user.getName());
    }
}
