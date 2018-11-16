package marcosjr.com.swipetodelete.Helper;

import android.support.v7.widget.RecyclerView;

public interface RecyclerItemTounchHelperListener {

    void onSwiped (RecyclerView.ViewHolder viewHolder,int direction, int position);

}
