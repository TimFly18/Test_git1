package FirstProject.fun;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        /*Bean1 bean1 = context.getBean("bean1", Bean1.class);
        System.out.println(bean1.getName());*/
        // Game game = context.getBean("gamebean",Game.class );
        //Steam steam = new Steam(game);
        /*Steam steam = context.getBean("gamebean2", Steam.class);
        Steam steam2 = context.getBean("gamebean2", Steam.class);
        steam.playSteam();
        System.out.println(steam.getAge());
        System.out.println(steam.getName());
        steam2.setAge(55);
        System.out.println(steam2.getAge());
        context.close();
*//*
        Steam steam3 = context.getBean("gamebean2", Steam.class);
        steam3.playSteam();
        context.close();*/
       /* Game game = context.getBean("rpg", Rpg.class);
        Steam steam = new Steam(game);
        steam.playSteam();
        context.close();*/
       /* Steam steam = context.getBean("steam", Steam.class);
        steam.playSteam();*/

        Xbox xbox = context.getBean("xbox", Xbox.class);
        System.out.println(xbox);
        context.close();

    }
}
