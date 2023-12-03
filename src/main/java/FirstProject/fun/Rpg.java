package FirstProject.fun;

import org.springframework.stereotype.Component;

@Component
public class Rpg implements Game{
    private Rpg() {
    }
    public static Rpg getRPG(){
        return new Rpg();
    }

    public void doWorkInit(){
    System.out.println("Work_Init");
}
public void doStopWorkInit(){
    System.out.println("Stop_Work_Init");
}

    @Override
    public String getSong() {
        return "Good Song!";
    }
}
