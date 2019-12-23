package guru.springframework.sfgpetclinic.model;

import lombok.Data;

import java.util.Objects;

//@Entity
@Data
public class BaseEntity {

    private Long id;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseEntity)) return false;
        BaseEntity that = (BaseEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
