package activities.HolidayCalendar;

import controlAppium.Button;
import controlAppium.TextBox;
import org.openqa.selenium.By;

public class ChangeBackgroudNote {
    public TextBox titleCheckTextBox = new TextBox(By.xpath("//android.widget.CheckedTextView[@content-desc=\"13\"]"));
    public TextBox NoteTextBox = new TextBox(By.xpath("com.angkormobi.ukcalendar:id/mainView"));
    public TextBox colorTextBox = new TextBox(By.id("com.angkormobi.ukcalendar:id/action_color"));
    public Button saveColorButton= new Button(By.xpath("com.angkormobi.ukcalendar:id/color1"));
    public TextBox exitTextBox = new TextBox(By.id("//android.widget.ImageButton[@content-desc=\"Navegar hacia arriba\"]"));

    public ChangeBackgroudNote(){}
}
