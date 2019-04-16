package cubes.vakmaster.nikolov.ui.model;

public class SettingsItem {

    public String id;
    public String title;
    public boolean isSelected;

    public SettingsItem(String title, boolean isSelected) {
        this.title = title;
        this.isSelected = isSelected;
    }

    public SettingsItem() {

        title = "Low";
        title = "Normal";
        title = "Urgent";
        title = "New";
        title = "Approved";
        title = "in Progres";
        title = "Resolved";
        title = "Closed";
        title = "Feedback";
        title = "Category 1";
        title = "Category 2";
        title = "Category 3";
        isSelected = false;
    }

}
