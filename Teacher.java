public class Teacher {
    public String branch;
    String name;
    String mpno;
    String brach;

    Teacher(String name,String brach,String mpno){
        this.name=name;
        this.brach=brach;
        this.mpno=mpno;
    }

    void print(){
        System.out.println("Adı = "+this.name);
        System.out.println("Bölümü = "+this.brach);
        System.out.println("Telefon numarası = "+this.mpno);


    }
}
