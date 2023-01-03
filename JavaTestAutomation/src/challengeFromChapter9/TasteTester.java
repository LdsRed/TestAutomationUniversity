package challengeFromChapter9;

public class TasteTester {
    public static void main(String[] args) {
        WeddingCake weddingccake = new WeddingCake();
        BirthdayCake birthdayCake = new BirthdayCake();

        System.out.println("The wedding Cake has a flavor of: " + weddingccake.getFlavor() + " and it's price is: " + weddingccake.getPrice());
        System.out.println("The Birth Day cake has a flavor of: " + birthdayCake.getFlavor() + " and it's price is of: "+ birthdayCake.getPrice() );

    }
}
