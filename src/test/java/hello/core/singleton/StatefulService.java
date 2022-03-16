package hello.core.singleton;

public class StatefulService {

    private int price; // 상태를 유지하는 필드

    public void order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        this.price = price; // 여기가 문제
//        return price; 공유되는 변수를 사용하지않고 price를 바로 반환해버리는 방법이 있음.
    }

    public int getPrice() {
        return price;
    }
}
