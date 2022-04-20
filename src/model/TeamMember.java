package model;

public class TeamMember {
    private String fName;
    private String lName;
    private Role tmRole;

    public TeamMember() {
        this.fName = "John";
        this.lName = "Smith";
        this.tmRole = Role.ANALYST;
    }

    public TeamMember(String theFirstname, String theLastname, Role theRole) {
        this.fName = theFirstname;
        this.lName = theLastname;
        this.tmRole = theRole;
    }

    public String getFirstname() {
        return this.fName;
    }

    public void setFirstname(String firstname) {
        this.fName = firstname;
    }

    public String getLastname() {
        return this.lName;
    }

    public void setLastname(String lastname) {
        this.lName = lastname;
    }

    public Role getTmRole() {
        return this.tmRole;
    }

    public void setTmRole(Role tmRole) {
        this.tmRole = tmRole;
    }

    public String getRoleAsString(){
        return "Team Role: " + this.tmRole;
    }

    public String getAllocatedTo(){
        return "Allocated To: " + getFirstname() + " " + getLastname();
    }

    public String CSVFormat(){
        // Add your code here
        return "";  // Add your return type here
    }

    @Override
    public String toString() {
        return "TeamMember{" + getFirstname() + " " + getLastname() +
                "Team Role" + getTmRole() +
                '}';
    }
}
