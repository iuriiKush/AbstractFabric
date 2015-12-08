import fabric.LocalUserFabric;
import fabric.RemoteUserFabric;
import fabric.UserFabric;

/**
 * Created by iurii on 08.12.15.
 */
public class Main {
    public static void main(String[] args) {
        UserFabric localFabric = new LocalUserFabric();
        UserFabric remoteFabric = new RemoteUserFabric();

        System.out.println(localFabric.getUser().getName());
        System.out.println(remoteFabric.getUser().getName());
    }
}
