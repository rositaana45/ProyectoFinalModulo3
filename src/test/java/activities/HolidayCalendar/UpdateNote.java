package activities.HolidayCalendar;

import controlAppium.Button;
import controlAppium.Label;
import controlAppium.TextBox;
import org.openqa.selenium.By;

public class UpdateNote {
    public Label titlenotaLabel = new Label(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout"));
    //public TextBox titleAntTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));
    //public TextBox titleUpdateTextBox = new TextBox(By.xpath("//android.widget.CheckedTextView[@content-desc=\"13\"]"));
    public TextBox titleUpdateTextBox = new TextBox(By.id("com.angkormobi.ukcalendar:id/editNoteContent"));
    //public TextBox descriptionUpdateTextBox = new TextBox(By.id("com.angkormobi.ukcalendar:id/editNoteContent"));
    public Button save2Button= new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Navegar hacia arriba\"]"));
    public UpdateNote(){}
}
