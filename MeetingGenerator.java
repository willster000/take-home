package headfirst.designpatterns.decorator.Meeting;
import java.util.ArrayList;
import java.util.Arrays;

// main class for generating meetings
public class MeetingGenerator {
    public static void main(String[] args) {
 
        Meeting meeting = new Meeting(new ArrayList<String>(Arrays.asList("John", "Jane")), "Feb 27, 10:00am", Meeting.Location.IN_PERSON);
        System.out.println(meeting.getInvite());
     
        Meeting meeting2 = new Meeting(new ArrayList<String>(Arrays.asList("John", "Jane", "Jim")), "March 5, 11:00am", Meeting.Location.ON_VIDEO);
        System.out.println(meeting2.getInvite());

        Meeting meeting3 = new DocumentDecorator("Goals", new Meeting(new ArrayList<String>(Arrays.asList("John", "Jane", "Jim")), "12:00", Meeting.Location.IN_PERSON));
        System.out.println(meeting3.getInvite());

        Meeting meeting4 = new DocumentDecorator("Slideshow", new Meeting(new ArrayList<String>(Arrays.asList("John", "Jane", "Jim")), "Jan 14, 2025, 13:00", Meeting.Location.ON_VIDEO));
        System.out.println(meeting4.getInvite());

        Meeting meeting5 = new DocumentDecorator("Pictures", new Meeting(new ArrayList<String>(Arrays.asList("John", "Jane", "Jim")), "14:00", Meeting.Location.IN_PERSON));
        System.out.println(meeting5.getInvite());
     
        Meeting meeting6 = new DocumentDecorator("Q4", new Meeting(new ArrayList<String>(Arrays.asList("John", "Jane", "Jim")), "15:00", Meeting.Location.ON_VIDEO));
        System.out.println(meeting6.getInvite());
    
        Meeting meeting7 = new DocumentDecorator("Stats", new Meeting(new ArrayList<String>(Arrays.asList("John", "Jane", "Jim")), "16:00", Meeting.Location.IN_PERSON));
        System.out.println(meeting7.getInvite());

        meeting7 = meeting7.removeDocument("Stats");
        System.out.println(meeting7.getInvite());
    }
}
