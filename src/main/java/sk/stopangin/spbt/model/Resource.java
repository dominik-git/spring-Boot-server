package sk.stopangin.spbt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "Resource")
public class Resource implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String photo;

    public Resource() {
    }

    public Resource(String photo) {
        this.photo = photo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}


