package FirstProject.fun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Steam {
/*   *//* @Autowired
    public void setGame(Game game) {
        this.game = game;
    }


    private G*//*ame game;*/

/*    public Steam(Game game) {
        this.game =game ;
    }*/

private Rpg rpg;
private Jrpg jrpg;

@Autowired
    public Steam(Rpg rpg, Jrpg jrpg) {
        this.rpg = rpg;
        this.jrpg = jrpg;
    }


    public String playSteam() {
      return   "play song -> " + rpg.getSong();

    }
}
