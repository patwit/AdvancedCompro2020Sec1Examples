public class Example {
    
    public static void main(String[] args){
        UniversityStudent u1 = new UniversityStudent();
        System.out.println(u1);
        UniversityStudent u2 = new UniversityStudent("B", 2);
        System.out.println(u2);
        ENUniversityStudent e1 = new ENUniversityStudent();
        System.out.println(e1);
        ENUniversityStudent e2 = new ENUniversityStudent("C", 3, "ENV");
        System.out.println(e2);
    }
}
