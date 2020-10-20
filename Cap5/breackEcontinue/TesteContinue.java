package Cap5.breackEcontinue;

public class TesteContinue {
    public static void main(String[] args) {
        
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                //System.out.printf("Numero %d é Par%n", i);
                continue;
            }
            System.out.printf("%d ",i);
        }
    }
}