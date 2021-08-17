package activities.HolidayCalendar;

import controlAppium.Button;
import controlAppium.TextBox;
import org.openqa.selenium.By;

public class CreateNote {
    public TextBox titleTextBox = new TextBox(By.id("com.angkormobi.ukcalendar:id/editNoteContent"));
    public TextBox reminderTextBox = new TextBox(By.id("com.angkormobi.ukcalendar:id/textReminder"));
    public TextBox dateTextBox = new TextBox(By.xpath("//android.view.View[@content-desc=\"13 agosto 2021\"]"));
    public Button AcceptDateButton= new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[3]"));
    public Button AcceptimeButton= new Button(By.id("android:id/button1"));
    public Button save1Button= new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Navegar hacia arriba\"]"));

    public CreateNote(){}
}
