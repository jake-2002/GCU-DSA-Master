package model;

public class Task {

    private ListType theList;
    private ADTDate aDueDate;
    private String aTask;
    private TeamMember allocatedTeamMember;
    private String taskComments;
    private String taskTags;

    public Task() {
    }

    public ListType getTheListType() {
        return theList;
    }

    public void setTheListType(ListType theListType) {
        this.theList = theListType;
    }

    public ADTDate getTheDueDate() {
        return this.aDueDate;
    }

    public void setTheDueDate(ADTDate aDueDate) {
        this.aDueDate = aDueDate;
    }

    public String getTheTask() {
        return this.aTask;
    }

    public void setTheTask(String aTask) {
        this.aTask = aTask;
    }

    public TeamMember getAllocatedTeamMember() {
        return this.allocatedTeamMember;
    }

    public void setAllocatedTeamMember(TeamMember allocatedToTM) {
        this.allocatedTeamMember = allocatedToTM;
    }

    public String getTaskComments() {
        return this.taskComments;
    }

    public void setTaskComments(String theTaskComments) {
        this.taskComments = theTaskComments;
    }

    public String getTheTags() {
        return this.taskTags;
    }

    public void setTheTags(String taskTags) {
        this.taskTags = taskTags;
    }


    public String CSVFormat(){
        // Add your code here
        return "";  // Add your return type here
    }

    @Override
    public String toString() {
        return "Task{" + getTheTask() +
                "Due Date" + getTheDueDate() +
                "Team Member" + getAllocatedTeamMember() +
                "Task Comments" + getTaskComments() +
                "Task Tags" + getTheTags() +
                '}';
    }
}
