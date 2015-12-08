package fabric;

import model.LocalUser;
import model.User;

/**
 * Created by iurii on 08.12.15.
 */
public class LocalUserFabric implements UserFabric {
    @Override
    public User getUser() {
        return new LocalUser();
    }
}
