package testbuilder;

import java.util.ArrayList;
import java.util.List;

public class CookieRobotBuilder implements RobotBuilder {
    private List<Integer> actions;
    private CookieRobotBuildable robot;

    CookieRobotBuilder() {
        robot = new CookieRobotBuildable();
        actions = new ArrayList<>();
    }

    @Override
    public void addStart() {
        actions.add(1);
    }

    @Override
    public void addGetParts() {
        actions.add(2);
    }

    @Override
    public void addAssemble() {
        actions.add(3);
    }

    @Override
    public void addTest() {
        actions.add(4);
    }

    @Override
    public void addStop() {
        actions.add(5);
    }

    public RobotBuildable getRobot() {
        robot.loadActions(actions);
        return robot;
    }
}
