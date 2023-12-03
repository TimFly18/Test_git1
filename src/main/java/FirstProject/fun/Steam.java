package FirstProject.fun;

public class Steam {
    public void setGame(Game game) {this.game = game;}

    private Game game;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

    public Steam(Game game) {this.game = game;}
    public Steam() {}
    public void playSteam(){
        System.out.println("play song -> " + game.getSong());
    }
}
