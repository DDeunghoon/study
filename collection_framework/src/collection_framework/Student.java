package collection_framework;

public class Student {
    public int sno;
    public String name;

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student student = (Student) obj ;
            return (sno == student.sno) && (name.equals(student.name));
        }else{
            return false;
        }
//        public int hashCode(){
//            return sno + name.hashCode();
//        } //?? 책에서나온거랑 똑같이했는디 뭐 해시맵이그잼플로 ㄲ 
    }
}
