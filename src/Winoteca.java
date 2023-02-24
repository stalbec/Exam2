public class Winoteca implements NewWine {
    private Wine[] wines;

    public Winoteca(Wine[] wines) {
        this.wines = wines;
    }

    public Wine[] getWines() {
        return wines;
    }

    public void setWines(Wine[] wines) {
        this.wines = wines;
    }

    @Override
    public Wine addNewWine(String brend) {
        for (Wine w:wines) {


        }
        return null;
    }
}
