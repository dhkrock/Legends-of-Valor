public class NexusCell extends Cell {
    public NexusCell(int row, int col){
        super("N", row, col);
    }

//    //when a hero lands on a NexusCell
//    public void land(Hero hero){
//        if(getRow() == 7){
//            Factory fac = new Factory();
//            Markets m = fac.newMarkets();
//            m.storeConsole(hero);
//        }else if(getRow() == 0){
//             System.out.println("Congratulations! You won!");
//        }
//    }


    public void land(Hero hero){
        setHasHero(true);
    }

    public void leave(Hero hero){
        setHasHero(false);
    }

}
