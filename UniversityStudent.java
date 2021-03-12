public class UniversityStudent extends Student{
    private int level;

    UniversityStudent(){
        super();
        this.level = 1;
    }

    UniversityStudent(String name, int level){
        super(name);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() +  " Level : " + getLevel();
    }
}