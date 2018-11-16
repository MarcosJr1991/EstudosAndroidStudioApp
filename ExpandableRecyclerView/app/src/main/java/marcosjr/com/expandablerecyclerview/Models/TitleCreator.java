package marcosjr.com.expandablerecyclerview.Models;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class TitleCreator {

    static TitleCreator _titleCreator;
    List<TitleParent> _titleParents;

    public TitleCreator(Context context) {
        _titleParents = new ArrayList<>();
        for (int i=1 ; i<100; i++)
        {
            TitleParent title = new TitleParent(String.format("Caller #%d",i));
            _titleParents.add(title);
        }
    }

    public static TitleCreator get(Context context)
    {
        if (_titleCreator == null)
            _titleCreator = new TitleCreator(context);
        return _titleCreator;
    }

    public List<TitleParent> getAll() {
        return _titleParents;
    }
}
