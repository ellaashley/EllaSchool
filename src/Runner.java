public class Runner {
    public static void main(String[] args){
        School bhs = new School("Berkeley High");
        Section math = new Section("Math");
        Section compsci = new Section("Computer Science");
        Section bio = new Section("Biology");
        Teacher alby = new Teacher("Albinson", "Computer Science");
        Teacher albrecht = new Teacher("Albrecht", "Math");
        Teacher muel = new Teacher("Mueller", "Biology");
        Student ella = new Student("Ella", 11);
        Student flynn = new Student("Flynn", 11);
        Student dash = new Student("Dashiell", 11);
        Student bella = new Student("Bella", 11);
        Student safiya = new Student("Safiya", 11);
        Student tai = new Student("Tai", 11);

        bhs.addSection(math);
        bhs.addSection(compsci);
        bhs.addSection(bio);

        alby.addSection(compsci);
        albrecht.addSection(math);
        muel.addSection(bio);

        math.setTeacher(albrecht);
        compsci.setTeacher(alby);
        bio.setTeacher(muel);

        math.addStudents(ella);
        math.addStudents(flynn);
        math.addStudents(dash);
        math.addStudents(bella);
        math.addStudents(safiya);
        math.addStudents(tai);
        bio.addStudents(ella);
        bio.addStudents(flynn);
        bio.addStudents(dash);
        bio.addStudents(bella);
        bio.addStudents(safiya);
        bio.addStudents(tai);
        compsci.addStudents(ella);
        compsci.addStudents(flynn);
        compsci.addStudents(dash);
        compsci.addStudents(bella);
        compsci.addStudents(safiya);
        compsci.addStudents(tai);

        ella.addSection(math);
        ella.addSection(bio);
        ella.addSection(compsci);
        flynn.addSection(math);
        flynn.addSection(bio);
        flynn.addSection(compsci);
        dash.addSection(math);
        dash.addSection(bio);
        dash.addSection(compsci);
        bella.addSection(math);
        bella.addSection(bio);
        bella.addSection(compsci);
        safiya.addSection(math);
        safiya.addSection(bio);
        safiya.addSection(compsci);
        tai.addSection(math);
        tai.addSection(bio);
        tai.addSection(compsci);

        System.out.println(bhs.toString());
        System.out.println(ella.toString());
        System.out.println(flynn.toString());
        System.out.println(dash.toString());
        System.out.println(bella.toString());
        System.out.println(safiya.toString());
        System.out.println(tai.toString());
        System.out.println(alby.toString());
        System.out.println(muel.toString());
        System.out.println(albrecht.toString());
        System.out.println(math.toString());
        System.out.println(bio.toString());
        System.out.println(compsci.toString());
    }
}
