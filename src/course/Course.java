package course;

public class Course {

    private String name;
    private int numberOfClasses;
    private String codeName;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfClasses() {
        return this.numberOfClasses;
    }

    public void setLastName(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public String getCodeName() {
        return this.codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public Course() {
        this.name = "Software QA course";
        this.numberOfClasses = 50;
        this.codeName = "QA";
    }

    public Course(String name, int numberOfClasses, String codeName) {
        this.name = name;
        this.numberOfClasses = numberOfClasses;
        this.codeName = codeName;
    }

}
