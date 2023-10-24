package bean;

public class Student {
    int Id;
    String fname;
    String lname;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Student(int id, String fname, String lname) {
        Id = id;
        this.fname = fname;
        this.lname = lname;
    }
}
