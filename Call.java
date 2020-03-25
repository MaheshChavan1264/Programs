import java.util.Scanner;

public class Call {
    private int callId;
    private long calledNumber;
    private float duration;
    public int getCallId() {
        return callId;
    }
    public void setCallId(int callId) {
        this.callId = callId;
    }
    public long getCalledNumber() {
        return calledNumber;
    }
    public void setCalledNumber(long calledNumber) {
        this.calledNumber = calledNumber;
    }
    public float getDuration() {
        return duration;
    }
    public void setDuration(float duration) {
        this.duration = duration;
    }
    public void parseData(String details){
        String callid=details.substring(0,3);
        String callednumber=details.substring(4,14);
        String duration=details.substring(15,details.length());
        setCallId(Integer.parseInt(callid));
        setCalledNumber(Long.parseLong(callednumber));
        setDuration(Float.parseFloat(duration));
    }
    public void display(){
        System.out.println("Call id:"+getCallId());
        System.out.println("Called number:"+getCalledNumber());
        System.out.println("Duration:"+getDuration());
    }
}
