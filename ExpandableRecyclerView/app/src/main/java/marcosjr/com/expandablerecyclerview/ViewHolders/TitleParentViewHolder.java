package marcosjr.com.expandablerecyclerview.ViewHolders;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;

import marcosjr.com.expandablerecyclerview.R;

public class TitleParentViewHolder extends ParentViewHolder {

    public TextView _textView1;
    public ImageButton _imageButton;


    public TitleParentViewHolder(View itemView) {
        super(itemView);

        _textView1 = (TextView)itemView.findViewById(R.id.parentTitle);
        _imageButton = (ImageButton)itemView.findViewById(R.id.expandArrow);

    }
}
