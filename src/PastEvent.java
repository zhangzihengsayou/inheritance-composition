public class PastEvents  extends Event{
    private LocalDate eventStartDate;
    private LocalDate eventEndDate;
    private String paymentStatus;
    private boolean requiresExtension;
    private static final double eventCost = 10_000;

    public PastEvents(String eventName, LocalDate eventStartDate, LocalDate eventEndDate, String paymentStatus, boolean requiresExtension) {
        super(eventName);
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.paymentStatus = paymentStatus;
        this.requiresExtension = requiresExtension;
    }
    public String getpaymentStatus() {
        return paymentStatus;
    }
    public void setpaymentStatus(String paymentStatus){
        this.paymentStatus = paymentStatus;
    }
    public LocalDate eventEndDate() {
        return eventEndDate;
    }
    public void seteventEndDate(LocalDate eventEndDate){
        this.eventEndDate = eventEndDate;
    }
    public LocalDate eventStartDate() {
        return eventStartDate;
    }
    public void seteventStartDate(LocalDate eventStartDate){
        this.eventStartDate = eventStartDate;
    }
    public boolean requiresExtension() {
        return requiresExtension;
    }
    public void seteventStartDate(boolean requiresExtension){
        this.requiresExtension = requiresExtension;
    }
    public void setpaymentDetails(String paymentStatus,boolean requireExtension) {
       this.paymentDetails= "The event cost was " + eventCost + " and the payment status is " + paymentStatus + ". The Customer requires extension?: " + requiresExtension + ".";
    }
    public String getpaymentDetails(){
        return paymentDetails;
    }
    @Override
    public String toSring(){
        return "\n" + "Event ID:" + getEventID() + " \n" + "The past event details:" +"\n"
    }
}
