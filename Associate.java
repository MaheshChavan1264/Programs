public class Associate {
    private int associateId;
    private String associateName;
    private String workStatus;

    public int getAssociateId() {
        return associateId;
    }

    public void setAssociateId(int associateId) {
        this.associateId = associateId;
    }

    public String getAssociateName() {
        return associateName;
    }

    public void setAssociateName(String associateName) {
        this.associateName = associateName;
    }

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    public void trackAssociateStatus(int noOfDays) {
        if ((noOfDays >= 0) && (noOfDays <= 20)) {
            setWorkStatus("Core skills");
        } else if ((noOfDays >= 21) && (noOfDays <= 40)) {
            setWorkStatus("Advanced modules");
        } else if ((noOfDays >= 40) && (noOfDays <= 60)) {
            setWorkStatus("Project phase");
        } else {
            setWorkStatus("Deployed in project");
        }
    }

    public void display() {
        System.out.println("The associate " + getAssociateName() + " work status:" + getWorkStatus());
    }
}