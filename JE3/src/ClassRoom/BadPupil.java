package ClassRoom;

public class BadPupil extends Pupil {

    @Override
    public void study (){
        System.out.println("Bad study");
    }
    public void read (){
        System.out.println("Bad read");
    }
    public void write (){
        System.out.println("Bad write");
    }
    public void relax (){
        System.out.println("Bad relax");
    }
}
