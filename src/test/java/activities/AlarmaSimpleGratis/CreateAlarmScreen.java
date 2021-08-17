package activities.AlarmaSimpleGratis;

import controlAppium.Button;
import controlAppium.TextBox;
import org.openqa.selenium.By;

public class CreateAlarmScreen {

  //  public TextBox horaTextBox = new TextBox(By.id("ar.com.basejuegos.simplealarm:id/displayAlarm"));
    public Button nro1Button = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.Button[1]"));
    public Button nro2Button= new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.Button[2]"));
    public Button nro3Button= new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.Button[3]"));
    public Button nro4Button= new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.Button[4]"));
    //public Button aceptarButton= new Button(By.id("ar.com.basejuegos.simplealarm:id/text_view_ok"));
    public Button diaLunesButton= new Button(By.xpath("//android.widget.TextView[@content-desc=Lunes Activado]"));
   // public Button diaLunesButton= new Button(By.id("ar.com.basejuegos.simplealarm:id/text_view_monday"));
    public TextBox mensajeTextBox = new TextBox(By.id("ar.com.basejuegos.simplealarm:id/editTextMessageAlarm"));
   // public TextBox mensajeTextBox = new TextBox(By.id("ar.com.basejuegos.simplealarm:id/alarmMessageArea"));
    public Button saveButton= new Button(By.id("ar.com.basejuegos.simplealarm:id/saveAlarmButton"));


    public void CreateTaskScreen(){}
}
