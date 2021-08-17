package activities.HolidayCalendar;

import controlAppium.Button;
import controlAppium.TextBox;
import org.openqa.selenium.By;

public class DeleteNote {
    public TextBox titleDelTextBox = new TextBox(By.id("//android.widget.CheckedTextView[@content-desc=\"13\"]"));
    public TextBox deleteTextbox= new TextBox(By.id("com.angkormobi.ukcalendar:id/mainView"));
    public TextBox optionsTextbox= new TextBox(By.xpath("//android.widget.ImageView[@content-desc=\"Más opciones\"]"));
    public Button deleteButton= new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView"));
    public Button acceptDeleteButton= new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]"));
    public TextBox vistTextbox= new TextBox(By.id("com.angkormobi.ukcalendar:id/textDate"));
    public TextBox panelTextbox= new TextBox(By.id("com.angkormobi.ukcalendar:id/month_name"));

    public DeleteNote(){}
}
