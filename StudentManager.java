public class StudentManager extends UserManager{

    public void joinCourse(User user) {
        System.out.println("Kursa Katılma İşlemi Yapıldı "+user.getName());
    }


    public void leftCourse (User user) {
        System.out.println("Kurstan Çıkış İşlemi Yapıldı "+user.getName());
    }
}