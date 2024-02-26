package headfirst.designpatterns.decorator.Meeting;

// Absract class for decorating meetings with documents
// implement everything that's common and make 
// abstract everything that's variable among 
// subclasses
public class DocumentDecorator extends Meeting {
    protected String document;
    protected Meeting meeting;
    public Meeting editedMeeting;

    public DocumentDecorator(String document, Meeting meeting) {
        super(meeting.participants, meeting.date_time, meeting.location);
        this.document = document;
        this.meeting = meeting;
    }

    @Override
    public String getInvite() {
        return super.getInvite() + " with document " + this.document;
    }

    @Override
     
    public Meeting removeDocument(String document) {
        if (this.document.equals(document)) {
            return new Meeting(meeting.getParticipants(), meeting.getDate_time(), meeting.getLocation());
        } else {
            return this;
        }
    }
}
