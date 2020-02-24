package ClassRoom;

public class ClassRoom {

    public ClassRoom(){
        System.out.println("Classroom is empty");
    }
    public ClassRoom(Pupil pupil){
        pupil.relax();
        pupil.write();
        pupil.read();
        pupil.study();
    }
    public ClassRoom(Pupil pupil, Pupil pupil1){
        this(pupil);
        pupil1.write();
        pupil1.study();
        pupil1.relax();
        pupil1.read();
    }
    public ClassRoom(Pupil pupil, Pupil pupil1, Pupil pupil2){
        this(pupil, pupil1);
        pupil2.write();
        pupil2.relax();
        pupil2.study();
        pupil2.read();
    }
    public ClassRoom(Pupil pupil, Pupil pupil1, Pupil pupil2, Pupil pupil3){
        this(pupil, pupil1, pupil2);
        pupil3.write();
        pupil3.study();
        pupil3.relax();
        pupil3.read();
    }
}