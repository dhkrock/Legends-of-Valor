public class PlainCell extends Cell {
    private final String type = "PlainCell";

    public PlainCell(int row, int col){
        super("P", row, col);
    }

//    public void land(){
//        increaseHeroCount();
//    }

    public void land(Hero hero){
        setHasHero(true);
    }

    public void leave(Hero hero){
        setHasHero(false);
    }

}
