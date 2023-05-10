public class Main {
    public static void main(String[] args) {
/***БУЛ ТАПШЫРМАДА PERSON ДЕГЕН КЛАСС ТУЗОСУЗДОР.

 ПОЛЕЛЕРИН ЖАНА МЕТОДТОРУН СУРОТТО КОРСОТУЛГОНДОЙ

 КЫЛЫП  ТУЗОСУЗДОР.


 АЛ КЛАССТЫ 3 БАШКА КЛАСС МУРАСТАШЫ  КЕРЕК.

 АЛ 3 КЛАССТЫН ОЗДОРУНУН УНИКАЛДУУ ПОЛЕЛЕРИ ЖАНА

 МЕТОДТОРУ БАР СУРОТТОГУДОЙ.



 КОНСТРУКТОР ТУЗОСУЗДОР ЖАНА ОЗДОРУНУН УНИКАЛДУУ МЕТОДТОРУН ДА ТУЗОСУЗДОР.



 МЕЙН МЕТОДКО 3 КЛАССТЫН ОБЪЕКТИЛЕРИН ТУЗОСУЗДОР, ПОЛЕЛЕРИНЕ КОНСТРУКТОР МЕНЕН МААНИ БЕРИП,

 КОНСОЛГО TOSTRING() МЕТОДУН КОЛДОНУП МААЛЫМАТТАРЫН  ЧЫГАРЫНЫЗДАР.*/
        System.out.println("Programmer:");
Programmer programmer=new Programmer("Abu","back devoloper","Amazon");
programmer.coding();
        System.out.println(programmer);
        System.out.println("---------------------------------------");
        System.out.println("Dancer");
        Dancer dancer=new Dancer("Atay","Biichi","Tumar");
        dancer.dancing();
        System.out.println(dancer);
        System.out.println("------------------------------------------");
        System.out.println("Singer:");
        Singer singer=new Singer("Myzyr","Singer","Kenesh tobu");
        singer.getBandName();
        singer.playGuitar();

        System.out.println(singer);


    }
}