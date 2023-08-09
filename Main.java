public class Main {
    public static void main(String[] args) {

        Teachers t1 = new Teachers("Mahmut", "135790", "Tarih");
        Teachers t2 = new Teachers("Ahmet", "246810", "Kimya");
        Teachers t3 = new Teachers("Leyla", "12340000", "Müzik");

        Course Tarih = new Course("Tarih" ,"101" , "Tarih" , t1);
        Course Kimya = new Course("Kimya", "102" , "Kimya" , t2  );
        Course Muzik =  new Course("Müzik" , "107" , "Müzik" , t3);

        Tarih.printTeacherInfo();

        Students s1=new Students("Mert Can","2121","4",Tarih ,Muzik ,Kimya);
        s1.addBulkExamNote(100,73,56,56,31,89);
        s1.isPass();
    }
}