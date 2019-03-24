package testbuilder;

import java.util.List;

public class CookieRobotBuildable implements RobotBuildable {
    private List<Integer> actions;

    CookieRobotBuildable() {

    }

    @Override
    public void go() {
        for (Integer i: actions) {
            switch (i)  {
                case 1:
                    start();
                    break;
                case 2:
                    getParts();
                    break;
                case 3:
                    assemble();
                    break;
                case 4:
                    test();
                    break;
                case 5:
                    stop();
                    break;
            }
        }
    }

    public void loadActions(List<Integer> actions) {
        this.actions = actions;
    }

    public void start() {
        System.out.println(" Starting .....");
    }
    public void getParts() {
        System.out.println(" Getting the flavor and sugar .....");
    }
    public void assemble() {
        System.out.println(" Baking a cookie .....");
    }
    public void test() {
        System.out.println(" Crunching a cookie .....");
    }
    public void stop() {
        System.out.println(" Stopping .....");
    }
}
