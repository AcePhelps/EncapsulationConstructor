package lesson11;

public class Team {
    private Person leader;
    private Person member;

    public Team(Person leader, Person member) {
        this.leader = leader;
        this.member = member;
    }

    public Person getLeader() {
        return leader;
    }

    public void setLeader(Person leader) {
        this.leader = leader;
    }

    public Person getMember() {
        return member;
    }

    public void setMember(Person member) {
        this.member = member;
    }
}
