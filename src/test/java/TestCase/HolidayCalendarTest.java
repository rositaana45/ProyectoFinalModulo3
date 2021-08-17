package TestCase;

import activities.HolidayCalendar.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Session.Session;

import java.net.MalformedURLException;

public class HolidayCalendarTest {
    private MainCalendar mainCalendar= new MainCalendar();
    private CreateNote createNote= new CreateNote();
    private UpdateNote updateNote=new UpdateNote();
    private ChangeBackgroudNote changeNote= new ChangeBackgroudNote();
    private CheckNote checkNote=new CheckNote();
    private DeleteNote deleteNote=new DeleteNote();

    @Test
    public void verifyCreateNote1() throws MalformedURLException {
        String title="Cumplea";
        String titleUpdate="Cumple2";
        mainCalendar.addNoteButton.click();
       createNote.titleTextBox.setValor(title);
        //createNote.titleTextBox.setValue("title");
        createNote.reminderTextBox.click();
        createNote.AcceptDateButton.click();
        createNote.AcceptimeButton.click();
        createNote.save1Button.click();
        mainCalendar.notesButton.click();

      Assertions.assertEquals(title,mainCalendar.nameNoteLabel.getText(),"ERROR! task was not created");

        updateNote.titlenotaLabel.click();
        updateNote.titleUpdateTextBox.setValor(titleUpdate);
        updateNote.save2Button.click();

      Assertions.assertEquals(titleUpdate,mainCalendar.nameNoteLabel.getText(),"ERROR! task was not updated");


    }

    @AfterEach
    public void close() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}


