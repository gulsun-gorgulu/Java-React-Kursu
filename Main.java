public class Main {

    public static void main(String[] args) {

        Student user1 = new Student();
        user1.setId(2000);
        user1.setName("Gülsün");
        user1.setSurname("Görgülü");
        user1.setStudentNumber(365);

        Instructor user2 = new Instructor();
        user2.setId(1993);
        user2.setName("Engin");
        user2.setSurname("Demiroğ");
        user2.setInstructorNumber(1234);

        UserManager userManager = new UserManager();
        userManager.login(user2);
        userManager.logout(user2);
        System.out.println("********************************");

        StudentManager studentManager = new StudentManager();
        studentManager.joinCourse(user1);
        studentManager.leftCourse(user1);
        System.out.println("*********************************");


        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addCourse();
        instructorManager.deleteCourse();
        System.out.println("**********************************");



    }

}
