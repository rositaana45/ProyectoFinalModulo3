package activities.HolidayCalendar;


import controlAppium.Button;
import controlAppium.Label;
import org.openqa.selenium.By;

public class MainCalendar {
    public Button addNoteButton = new Button(By.id("com.angkormobi.ukcalendar:id/fab"));
    public Button notesButton= new Button(By.id("com.angkormobi.ukcalendar:id/menu_notes"));
    public Label nameNoteLabel = new Label(By.id("com.angkormobi.ukcalendar:id/textHolidayText"));
    public MainCalendar(){}
}
