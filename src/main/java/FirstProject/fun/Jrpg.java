package FirstProject.fun;

import org.springframework.stereotype.Component;

@Component("someJrpg")
public class Jrpg implements Game {
    @Override
    public String getSong() {
        return "Japan good Song";
    }
}
