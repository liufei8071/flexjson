package flexjson.test.mock;

public class Group {

    private String groupName;
    private Person[] people;

    public Group() {
    }

    public Group(String groupName, Person... people) {
        this.groupName = groupName;
        this.people = people;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }
}
