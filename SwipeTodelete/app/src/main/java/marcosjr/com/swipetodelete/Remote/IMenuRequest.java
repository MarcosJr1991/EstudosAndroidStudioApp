package marcosjr.com.swipetodelete.Remote;

import java.util.List;

import marcosjr.com.swipetodelete.Model.Item;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface IMenuRequest {
    @GET
    Call<List<Item>> getMenuList (@Url String url);
}
