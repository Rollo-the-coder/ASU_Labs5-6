/*-------------------------------------------------------------
//AUTHOR: Erik Christian Gotta
//FILENAME: Lab9.java
//SPECIFICATION: A program that creates Student objects to fill in name, id, grade with getter and setter mthods.
//FOR: CSE 110 - Lab #9
//TIME SPENT: 45 minutes
//-----------------------------------------------------------*/

class Student {

    //Member Variables
    private String fullName;
    private String id;
    private double grade;

    private int numUpdated;
    private int numAccessed;

    //Default constructor 
    Student() {
        numUpdated = 3;
        numAccessed = 5;
    }

    
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
