public class Main {
    public static void main(String[] args) {
        final double weightPerson = 52.5;
        final double heightPerson = 175;

        final double idealWeight = (heightPerson - 100) - (heightPerson * 0.1);
        System.out.println("idealWeight = " + idealWeight);

        if ((weightPerson > (idealWeight - 6)) && (weightPerson < (idealWeight + 6))) {
            System.out.println("Ваш вес = " + weightPerson + " кг идеальный!");
        } else {
            System.out.println("Ваш вес = " + weightPerson + " кг не идеальный!");
        }
    }
}
