package headfirst.designpatterns.decorator.Meeting;

import java.util.ArrayList;

public class Meeting {
    public static enum Location {IN_PERSON, ON_VIDEO};
    public Location location = Location.IN_PERSON;
    public ArrayList<String> participants;
    public String date_time; 

    public Meeting(ArrayList<String> participants, String date_time, Location location) {
        this.date_time = date_time;
        this.participants = participants;
        this.location = location;
    }

    public String getParticipantsForPrinting() {
        return participants.toString();
    }

    public ArrayList<String> getParticipants() {
        return this.participants; 
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    public Location getLocation() {
        return this.location; 
    }

    public String getDate_time() {
        return this.date_time; 
    }

    public String getInvite() {
        return "Meeting with " + this.getParticipants() + " at " + this.getDate_time() + " " + this.getLocation();
    }

    public Meeting removeDocument(String document) {
        return null;
    }

}
