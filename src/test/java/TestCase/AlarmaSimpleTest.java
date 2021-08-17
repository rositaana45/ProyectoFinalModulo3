package TestCase;

import Session.Session;
import activities.AlarmaSimpleGratis.CreateAlarmScreen;
import activities.AlarmaSimpleGratis.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

public class AlarmaSimpleTest {
    private MainScreen mainScreen= new MainScreen();
    private CreateAlarmScreen createAlarmScreen = new CreateAlarmScreen();


    @Test
    public void verifyCreateAlarm() throws MalformedURLException {
        String Mensaje= "AlarmaPrueba";
        mainScreen.addAlarmButton.click();
        createAlarmScreen.nro1Button.click();
        createAlarmScreen.nro2Button.click();
        createAlarmScreen.nro3Button.click();
        createAlarmScreen.nro4Button.click();
        createAlarmScreen.mensajeTextBox.setValor(Mensaje);
        createAlarmScreen.saveButton.click();


        Assertions.assertEquals(Mensaje,mainScreen.nameAlarmLabel.getText(),"ERROR: no se creó la Alarma");
    }

    @AfterEach
    public void close() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
