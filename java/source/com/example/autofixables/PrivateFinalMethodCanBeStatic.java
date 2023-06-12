public class PrivateFinalMethodCanBeStatic {

    private final void shouldBeStatic() {
        System.out.println("Not accessing any member fields");
        System.out.println("Neither calling any member methods");
    }
}
