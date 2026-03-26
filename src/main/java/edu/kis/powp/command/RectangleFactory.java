package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class RectangleFactory {
    public static ComplexCommand rectangleCommand(Job2dDriver driver, int x, int y, int width, int length){
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(driver, x, y));
        command.addCommand(new SetPositionCommand(driver, x + length, y));
        command.addCommand(new SetPositionCommand(driver, x + length, y + width));
        command.addCommand(new SetPositionCommand(driver, x, y + width));
        command.addCommand(new SetPositionCommand(driver, x, y));
        return command;
    }
}
