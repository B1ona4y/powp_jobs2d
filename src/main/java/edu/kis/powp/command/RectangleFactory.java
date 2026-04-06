package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class RectangleFactory {
    public static ComplexCommand rectangleCommand(Job2dDriver driver, int x, int y, int width, int length) {
        int right = x + length;
        int bottom = y + width;

        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(driver, x, y));
        command.addCommand(new OperateToCommand(driver, right, y));
        command.addCommand(new OperateToCommand(driver, right, bottom));
        command.addCommand(new OperateToCommand(driver, x, bottom));
        command.addCommand(new OperateToCommand(driver, x, y));
        return command;
    }
}
