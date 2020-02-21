public class Teacher extends Person{
    private Section[] sections = new Section[10];
    private String subject;
    private int sectionCount;

    public Teacher(String name, String subject){
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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
        for(int i= 0; i<sectionCount; i++){
            x+= sections[i].getName() + " (" +sections[i].getCurrentSize() +"), ";
        }
        return this.name +" teaches the following sections: " +x;
    }
}
