package block_1_4;

public class House {
    final int n;

    public House(int n) {
        this.n = n;
    }

    public String toString() {
        if(n % 10 == 1 && n % 100 != 11){
            return("Дом с " + n + " этажом");
        }else{
            return("Дом с " + n + " 'этажами");
        }
    }
}
