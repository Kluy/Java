package Jackson;

import java.util.List;

public class User<Wife> {

    private String name;
    private int age;
    private boolean isAdmin;
    private List<String> courses;
    private Wife wife;

    public User(){}

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "Jackson.User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isAdmin=" + isAdmin +
                ", courses=" + courses +
                ", wife=" + wife +
                '}';
    }
}
