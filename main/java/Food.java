public class Food {
    private int x;
    private int y;

    public Food(){

    }

    public void random_spawn(Snake player){
        x = (int) (Math.random() * Game.width);
        y = (int)(Math.random() * Game.height);

        boolean onSnake = false;
        while(!onSnake){
            for (Rectangle r : player.getBody()){
                if(r.x == x && r.y == y){
                    onSnake = true;
                }
            }
        }
    }
}
