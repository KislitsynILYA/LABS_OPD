//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package lesson1.task2;

public class Client {
    private String first_name;
    private String last_name;

    public Client(String first_name) {
        this.first_name = first_name;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Client(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public Client() {
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Client)) {
            return false;
        } else {
            Client other = (Client)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$first_name = this.getFirst_name();
                Object other$first_name = other.getFirst_name();
                if (this$first_name == null) {
                    if (other$first_name != null) {
                        return false;
                    }
                } else if (!this$first_name.equals(other$first_name)) {
                    return false;
                }

                Object this$last_name = this.getLast_name();
                Object other$last_name = other.getLast_name();
                if (this$last_name == null) {
                    if (other$last_name != null) {
                        return false;
                    }
                } else if (!this$last_name.equals(other$last_name)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Client;
    }

    public int hashCode() {
        int result = 1;
        Object $first_name = this.getFirst_name();
        result = result * 59 + ($first_name == null ? 43 : $first_name.hashCode());
        Object $last_name = this.getLast_name();
        result = result * 59 + ($last_name == null ? 43 : $last_name.hashCode());
        return result;
    }
}
