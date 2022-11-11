public class Random {
    public static void main(String[] args) {
        int min = 1000;
        int max = 9999;
        int generate = (int)Math.floor(Math.random()*(max-min+1)+min);
        int generate2 = (int)Math.floor(Math.random()*(max-min+1)+min);
        int generate3 = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(generate);
        System.out.println(generate2);
        System.out.println(generate3);
    }
}
