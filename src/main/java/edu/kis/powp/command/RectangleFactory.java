package edu.kis.powp.command;

public class RectangleFactory {
    public static ComplexCommand rectangleCommand(int x, int y, int width, int length) {
        int right = x + length;
        int bottom = y + width;

        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(x, y));
        command.addCommand(new OperateToCommand(right, y));
        command.addCommand(new OperateToCommand(right, bottom));
        command.addCommand(new OperateToCommand(x, bottom));
        command.addCommand(new OperateToCommand(x, y));
        return command;
    }
}
