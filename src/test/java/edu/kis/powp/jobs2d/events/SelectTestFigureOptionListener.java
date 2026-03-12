package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Consumer;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;

public class SelectTestFigureOptionListener implements ActionListener {

	private final DriverManager driverManager;
	private final Consumer<Job2dDriver> drawingAction;

	public SelectTestFigureOptionListener(DriverManager driverManager, Consumer<Job2dDriver> drawingAction) {
		this.driverManager = driverManager;
        this.drawingAction = drawingAction;
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		Job2dDriver driver = driverManager.getCurrentDriver();
		drawingAction.accept(driver);
	}
}
