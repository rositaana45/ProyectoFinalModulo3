package activities.HolidayCalendar;

import controlAppium.Button;
import controlAppium.TextBox;
import org.openqa.selenium.By;

public class CheckNote {
    public TextBox titleCheckTextBox = new TextBox(By.xpath("//android.widget.CheckedTextView[@content-desc=\"13\"]"));
    public TextBox NoteTextBox = new TextBox(By.xpath("com.angkormobi.ukcalendar:id/mainView"));
    public TextBox optionsTextBox = new TextBox(By.id("//android.widget.ImageView[@content-desc=\"Más opciones\"]"));
    public Button save3Button= new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));
    public TextBox markTextBox = new TextBox(By.id("com.angkormobi.ukcalendar:id/editNoteContent"));

    public CheckNote(){}
}
