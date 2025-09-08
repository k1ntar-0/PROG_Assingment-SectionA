
package tv_manager;
/*
Student Number: 10487456
Student Name: Ndaedzo Given Tshiovhe
Section A
*/
public class SeriesModel {
    private int id;
    private String name;
    private int ageRestriction;
    private int episodes;

    public SeriesModel(int id, String name, int ageRestriction, int episodes) {
        this.id = id;
        this.name = name;
        this.ageRestriction = ageRestriction;
        this.episodes = episodes;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAgeRestriction() { return ageRestriction; }
    public int getEpisodes() { return episodes; }

    public void setName(String name) { this.name = name; }
    public void setAgeRestriction(int ageRestriction) { this.ageRestriction = ageRestriction; }
    public void setEpisodes(int episodes) { this.episodes = episodes; }

    @Override
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Age Restriction: " + ageRestriction + "+ | Episodes: " + episodes;
    }
}
