package marcosjr.com.searchdialog.Model;

import ir.mirrajabi.searchdialog.core.Searchable;

public class SearchModel implements Searchable {

    private String mTitle;

    public SearchModel(String mTitle) {
        this.mTitle = mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    @Override
    public String getTitle() {
        return mTitle;
    }
}
