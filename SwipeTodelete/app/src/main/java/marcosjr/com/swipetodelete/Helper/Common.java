package marcosjr.com.swipetodelete.Helper;

import marcosjr.com.swipetodelete.Remote.IMenuRequest;
import marcosjr.com.swipetodelete.Remote.RetrofitClient;

public class Common {

    public static IMenuRequest getMenuRequest ()
    {
        return RetrofitClient.getClient("https://api.androidhive.info/").create(IMenuRequest.class);
    }

}
