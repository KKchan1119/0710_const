public class ProductTest {
    public static void main(String[] args){
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();

        System.out.println("p1의 serialNo : " + p1.serialNo);
        System.out.println("p2의 serialNo : " + p2.serialNo);
        System.out.println("p3의 serialNo : " + p3.serialNo);
        System.out.println("p4의 serialNo : " + p4.serialNo);

        System.out.println("총 생산된 제품의 수량은 " + Product.count);
    }
}
class Product{
    //클래스 변수 => Product class로 만들어진 모든 객체간에 공유가 가능.
    static int count = 0;
    //인스턴스 변수 =>
    int serialNo;

    //인스턴스 변수 초기화 block
    //객체가 생성될 때 마다 호출됨.=>생성자가 호출 될 때마다
    {
        ++count;//클래스 변수
        serialNo = count;
    }
}