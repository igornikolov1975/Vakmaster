package cubes.vakmaster.nikolov.ui.model;

public class CheckBox {

    public String checkBox;
    public boolean isSelected;

    public CheckBox(String title, boolean isSelected) {
        this.checkBox = title;
        this.isSelected = isSelected;
    }

    public CheckBox() {

        checkBox = "Low";
        checkBox = "Normal";
        checkBox = "Urgent";
        checkBox = "New";
        checkBox = "Approved";
        checkBox = "in Progres";
        checkBox = "Resolved";
        checkBox = "Closed";
        checkBox = "Feedback";
        checkBox = "Category 1";
        checkBox = "Category 2";
        checkBox = "Category 3";
        isSelected = false;
    }
}
