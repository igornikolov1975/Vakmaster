package cubes.vakmaster.nikolov.ui.model;

import java.io.Serializable;

import cubes.vakmaster.nikolov.R;


public class BuildingItem implements Serializable {

    public  int id;
    public String title;
    public String tasks;
    public String description;
    public String image;

    public BuildingItem(){

        this.title = "Stepa Stepanovic";
        this.description = "Vase Smajevica";


    }

    public BuildingItem(int id, String title, String tasks, String description, String image) {
        this.id = id;
        this.title = title;
        this.tasks = tasks;
        this.description = description;
        this.image = image;
    }
}
