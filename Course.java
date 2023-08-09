public class Course {
    Teachers teach;
    String name;
    String code;
    String prefix;
    int note;


    int noteS;


    Course(String name, String code, String prefix, Teachers teach) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.teach = teach;


    }

    void AddTeacher(Teachers teach) {
        if(teach.branch.equals(this.prefix)){
            this.teach = teach;
        }else {
            System.out.println("Öğretmen Kodu Ders İle Uyumlu Değildir!");
        }
        printTeacherInfo();
    }


    void printTeacherInfo() {
        this.teach.print();
    }


}


