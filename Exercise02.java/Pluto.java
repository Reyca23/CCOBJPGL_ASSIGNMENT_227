public class Pluto implements Planet{
    @Override
    public void accept(Explorer explorer) {
        explorer.visit(this);
    }
}
