import java.sql.SQLOutput;

public class Teachers {

    String name;
    String phoneNumber;
    String branch;

    Teachers(String name , String phoneNumber , String  branch){ //constructor method
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.branch = branch;

    }

    void print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Telefonu : " + this.phoneNumber);
        System.out.println("Bölümü  : " + this.branch);

    }



}
