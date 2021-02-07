class ENUniversityStudent extends UniversityStudent{
    private String dept;
    
    public ENUniversityStudent(){
        super();
        dept = "CoE";
    }

    ENUniversityStudent(String name, int level, String dept){
        super(name, level);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Dept : " + getDept();
    }
}