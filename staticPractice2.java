public class staticPractice2 {
    public static void main(String args[]){
        HondaCity h1 = new HondaCity();
        HondaCity h2 = new HondaCity();
        // System.out.println(h1.onRoadPrice("Delhi"));
        System.out.println(HondaCity.onRoadPrice("Delhi"));
    }
}
class HondaCity{
    static long price = 1_00_000;
    int a, b;
    static double onRoadPrice (String city){
        switch(city){
            case "Delhi": return price + price * .1;
            case "Mumbai": return price + price * .8;
        }
        return price;
    }
}