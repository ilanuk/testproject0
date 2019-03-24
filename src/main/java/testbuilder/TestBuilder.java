package testbuilder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestBuilder {
    public static void main(String[] args) {
        RobotBuilder builder;
        RobotBuildable robot;
        String response = "a";
        System.out.println("Do you want a cookie robot(c) or an automitive robot9a)?");

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        try {
            response = reader.readLine();
        }
        catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
        }

        if(response.equalsIgnoreCase("c")) {
            builder = new CookieRobotBuilder();
        }
        else {
            builder = new AutomtiveRobotBuilder();
        }

        //start the construction process

        builder.addStart();
        builder.addGetParts();
        builder.addTest();
        builder.addAssemble();
        builder.addStop();
        robot = builder.getRobot();
        robot.go();
    }
}
