package model;


/**
 * Created by iurii on 08.12.15.
 */
public class LocalUser implements User {

    @Override
    public String getId() {
        return "Local user id";
    }

    @Override
    public String getName() {
        return "Local name";
    }

    @Override
    public String getImageId() {
        return "Local image id";
    }
}
