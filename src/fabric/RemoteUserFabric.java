package fabric;

import model.RemoteUser;
import model.User;

/**
 * Created by iurii on 08.12.15.
 */
public class RemoteUserFabric implements UserFabric {
    @Override
    public User getUser() {
        return new RemoteUser();
    }
}
