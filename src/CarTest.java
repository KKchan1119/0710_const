public class CarTest {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        //인스턴스 변수를 직접 초기화 하는 것 보다는
        //매개변수 생성자를 이용하는 것이 깔끔함.
        Car c2 = new Car("white", "auto", 4);

        System.out.println("c1객체" + c1.color + ", " + c1.gearType + ", " + c1.door);
        System.out.println("c2객체" + c2.color + ", " + c2.gearType + ", " + c2.door);
    }
}
class Car{
    String color;
    String gearType;
    int door;
    //기본생성자
    Car () {
        //생성자 안에서 생성자 호출. this 키워드 사용
        this("black", "manual", 6);
    }
    Car(String color){
        this(color, "manual", 6);
    }
    //매개변수가 있는 생성자.
    Car(String c, String g, int d) {
        this.color = c;
        this.gearType = g;
        this.door = d;
    }
}