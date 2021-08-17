package activities.AlarmaSimpleGratis;

import controlAppium.Button;
import controlAppium.Label;
import org.openqa.selenium.By;

public class MainScreen {
    public Button addAlarmButton = new Button(By.id("ar.com.basejuegos.simplealarm:id/emptyListLayout"));
    public Label nameAlarmLabel = new Label(By.id("ar.com.basejuegos.simplealarm:id/alarmMessageText"));


    public MainScreen(){}
}
