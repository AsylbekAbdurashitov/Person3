public class Singer extends Person{
    private String bandName;
    public Singer(String name,String designation,String bandName){
        super(name,designation);
        this.bandName=bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }public void singing(){
        super.learn();
        super.walk();
        super.eat();
        System.out.println(getName()+"  singer sing");
    }public void playGuitar(){
        super.learn();
        super.walk();
        super.eat();
        System.out.println(getName()+"  play guiter");
    }

    @Override
    public String toString() {
        return
                "bandName: " + bandName
               ;
    }
}
