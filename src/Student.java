public class Student extends Person{
    private Section[] sections = new Section[10];
    private int grade;
    private int sectionCount;


    public Student(String name, int grade){
        super(name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Section[] getSections() {
        return sections;
    }

    public void addSection(Section s){
        this.sections[sectionCount] = s;
        sectionCount++;
    }

    public String toString(){
        String x = "";
        for(int i=0; i<sectionCount; i++){
            x += sections[i].getName() + "(" + sections[i].getTeacher().getName() +"), ";
        }
        return this.name + " is in " + this.grade + " grade and is enrolled in the following sections: " +x;
    }
}
