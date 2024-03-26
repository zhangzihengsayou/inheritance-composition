public class ConferenceEvent  {
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;
    private double eventCost;
    private double conferenceEventCost;
    private String eventID;
    private String eventName;
    private String eventPointOfContact;
    private String eventLocation;

    public ConferenceEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact,
                           double eventCost, int totalParticipants, int totalEventDays,
                           boolean breakfastRequired, double breakfastCost,
                           boolean lunchRequired, double lunchCost,
                           boolean dinnerRequired, double dinnerCost) {
        this.breakfastRequired = breakfastRequired;
        this.breakfastCost = breakfastCost;
        this.lunchRequired = lunchRequired;
        this.lunchCost = lunchCost;
        this.dinnerRequired = dinnerRequired;
        this.dinnerCost = dinnerCost;
        this.eventID=eventID;
        this.eventName=eventName;
        this.eventLocation=eventLocation;
        this.eventPointOfContack=pointOfContack;

    }
    public double getBreakfastCost(){
        return breakfastCost;
    }
    public void setBreakfastCost(double BreakfastCost){
        this.breakfastCost = breakfastCost;
    }
    public double getLunchCost() {
        return lunchCost;
    }
    public void setLunchCost(double LunchCost){
        this.lunchCost = lunchCost;
    }
    public double getDinnerCost() {
        return dinnerCost;
    }
    public void setDinnerCost(double DinnerCostt){
        this.dinnerCost = dinnerCost;
    }
    public double getEventCost() {
        return eventCost;
    }
    public void setEventCost(double EventCost){
        this.eventCost = eventCost;
    }
    public String getEventID() {
        return eventID;
    }
    public void setEventID(String eventID){
        this.eventID = eventID;
    }
    public String getEventName() {
        return eventID;
    }
    public void setEventName(String eventName){
        this.eventName = eventName;
    }
    public String geteventLocation() {
        return eventLocation;
    }
    public void seteventLocation(String eventLocation){
        this.eventLocation = eventLocation;
    }
    public String geteventPointOfContact() {
        return  eventPointOfContack;
    }
    public void seteventPointOfContact(String eventPointOfContact){
        this.eventPointOfContack = eventPointOfContact;
    }

    @Override
    public void calculateEventCost(){
       conferenceEventCost = getEventCost() + ((getBreakfastCost() + getLunchCost() + getDinnerCost()));
       eventCost = calculateEventCostObject.calculateEventCost() + (calculateEventCostObject.calculateEventCost() * 0.3);
    }

    @Override
    public String toString() {
        String eventDetails = super.toString();
        eventDetails += "\nBreakfast Required: " + breakfastRequired +
                "\nBreakfast Cost: $" + breakfastCost +
                "\nLunch Required: " + lunchRequired +
                "\nLunch Cost: $" + lunchCost +
                "\nDinner Required: " + dinnerRequired +
                "\nDinner Cost: $" + dinnerCost;

        return eventDetails;
    }
    
}

