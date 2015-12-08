package model;

/**
 * Created by iurii on 08.12.15.
 */
public class RemoteUser implements User{
    @Override
    public String getId() {
        return "Remote user id";
    }

    @Override
    public String getName() {
        return "Remote name";
    }

    @Override
    public String getImageId() {
        return "Remote image id";
    }
}
