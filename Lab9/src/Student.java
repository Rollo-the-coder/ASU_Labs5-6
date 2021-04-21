class Student {

    //Member Variables
    private String fullName;
    private String id;
    private double grade;

    private int numUpdated = 3;
    private int numAccessed = 5;
    
    //Getter Methods
    String getFullName() {
        return fullName;
    }

    String getId() {
        return id;
    }

    double getGrade() {
        return grade;
    }

    int getNumUpdated() {
        return numUpdated;
    }

    int getNumAccessed() {
        return numAccessed;
    }

    //Setter Methods
    void setFullName(String name) {
        fullName = name;
    }

    void setId(String sid) {
        id = sid;
    }

    void setGrade(double sgrade) {
        grade = sgrade;
    }


}
