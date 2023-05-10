public class Programmer extends Person{
    private String kompanyName;

    public String getKompanyName() {
        return kompanyName;
    }

    public void setKompanyName(String kompanyName) {
        this.kompanyName = kompanyName;
    }

    public Programmer(String name, String designation, String kompanyName){
        super(name,designation);
        this.kompanyName=kompanyName;

     }public void coding(){
    super.learn();
    super.walk();
    super.eat();
    System.out.println(getName()+"  write coding");}

    @Override
    public String toString() {
        return
                "kompanyName: " + kompanyName ;
    }
}
