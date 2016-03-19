package parse_table_generator;

/**
 *
 * @author Kevin Dittmar
 * @version Mar 19, 2016
 */
public class EndSymbol extends Terminal {
    public EndSymbol(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof EndSymbol)) {
            return false;
        } else {
            EndSymbol es = (EndSymbol) o;
            return this.getName().equals(es.getName());
        }
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.getName().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return quietToString();
        //return verboseToString();
    }

    public String quietToString() {
        return this.getName();
    }

    public String verboseToString() {
        return "EndSymbol[name=\"" + this.getName() + "\"]";
    }
}
