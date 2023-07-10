public class BlockTest {
    //클래스 변수 초기화 block
    static{
        System.out.println("static {}");
    }
    {
        System.out.println("{  }");
    }

    public BlockTest(){
        System.out.println("생성자 호출");
    }

    public static void main(String[] args){
        BlockTest bt = new BlockTest();

    }
}

