public class Main {
    public static void main(String[] args) {

        ArrayList numbers = new ArrayList();

        numbers.set(x, y);
        System.out.println("Pocet ulozenych cisel: " + numbers.size());
        System.out.println("Je seznam prazdny? " + numbers.isEmpty());
        System.out.println(numbers.get(1));
        System.out.println("Pozice čísla x: " + numbers.indexOf(x));
        System.out.println(" " + numbers.get(x));
        System.out.println("Obsahuje x? " + numbers.contains(x));
        System.out.println("Posledni index cisla v seznamu: " + numbers.lastIndexOf(x));
    }
}
