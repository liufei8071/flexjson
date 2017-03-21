package flexjson.test.mock.superhero;

public class SecretIdentity {

    private String name;

    protected SecretIdentity() {
    }

    public SecretIdentity( String name ) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SecretIdentity that = (SecretIdentity) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    public int hashCode() {
        return (name != null ? name.hashCode() : 0);
    }
}
