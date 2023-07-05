package EX5_6;

public class Main {
    public static void main(String[] args){
        Web_Store webStore = new Web_Store("Ngoc Website","ngoc.com.vn","HTML,CSS");
        System.out.println(webStore.toString());
        Restaurant restaurant = new Restaurant("Ngoc Restaurant",20,100.4);
        System.out.println(restaurant.toString());
    }
}
