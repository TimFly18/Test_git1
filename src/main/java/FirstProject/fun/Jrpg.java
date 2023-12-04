package FirstProject.fun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Jrpg implements Game {
    @Override
    public String getSong() {
        return "Japan good Song";
    }
}
