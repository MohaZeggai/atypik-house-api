package fr.atypikhouse.api.Entities;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private User user;

    @NotNull
    private String titre;

    @NotNull
    private String description;

    @NotNull
    private String surface;

    @NotNull
    private String image;

    @NotNull
    private String planning;

    @NotNull
    private Double prix;

    @NotNull
    private String adresse;

    public Location() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPlanning() {
        return planning;
    }

    public void setPlanning(String planning) {
        this.planning = planning;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", user=" + user +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", surface='" + surface + '\'' +
                ", image='" + image + '\'' +
                ", planning='" + planning + '\'' +
                ", prix=" + prix +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}