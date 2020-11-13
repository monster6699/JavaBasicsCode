package mathDemo;

import java.util.Objects;

public class Fu {
    private String name;

    public Fu(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fu{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fu fu = (Fu) o;
        return Objects.equals(name, fu.name);
    }

}
