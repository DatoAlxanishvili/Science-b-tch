package assign2.alkhanishvili.davit.breakingbad;

import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by dalkh on 30-Oct-15.
 */
public class Hero implements Serializable {
    private String name, surname, image, description;





    public Hero(String name, String surname, String image,String description) {
        this.name = name;
        this.surname = surname;
        this.image=image;
        this.description=description;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surnameame) {

        this.surname = surname;
    }

    public String getImage() {

        return image;
    }

    public void setImage(String image) {

        this.image=image;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
