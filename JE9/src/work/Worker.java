package work;

public class Worker {
    private String name;
    private String job;
    private int year;

    public Worker(){}

    public Worker(String name, String job, int year) {
        this.name = name;
        this.job = job;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", year=" + year +
                '}';
    }
}
