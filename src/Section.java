public class Section {
    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize;

    public Section(String name){
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudents(Student s){
        this.students[currentSize] = s;
        currentSize++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public String toString(){
        String x = "";
        for(int i=0; i<currentSize; i++){
            x += students[i].getName() +", ";
        }
        return this.name +" is taught by " +this.teacher.getName() + " and has " +this.currentSize +" students: " +x;
    }
}
