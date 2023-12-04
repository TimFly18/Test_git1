package FirstProject.fun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Xbox {
    private int id;
@Autowired
    public Xbox(Steam steam) {
        this.steam = steam;
        this.id=25;
    }

    private Steam steam;


    @Override
    public String toString() {
        return "Xbox " + id + steam.playSteam();
    }
}
