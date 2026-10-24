package com.xiaofeng.flowlayoutmanager;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

/**
 * A view measured in a line, laid out once the line is complete so that it can be shifted
 * for {@link Alignment#CENTER}. Used internally by {@link FlowLayoutManager}.
 *
 * @author Anton Dudakov
 */
public class LayoutManagerAppender {

    View mView;
    RecyclerView.LayoutManager mLayoutManager;
    Rect mRect;
    Alignment alignment;

    public LayoutManagerAppender(View view, RecyclerView.LayoutManager layoutManager, Rect rect, Alignment alignment) {
        mView = view;
        mLayoutManager = layoutManager;
        this.mRect = new Rect(rect);
        this.alignment = alignment;
    }

    public void layout(int addition) {
        if (alignment == Alignment.CENTER)
            mLayoutManager.layoutDecorated(mView, mRect.left + addition, mRect.top, mRect.right + addition, mRect.bottom);
        else
            mLayoutManager.layoutDecorated(mView, mRect.left, mRect.top, mRect.right, mRect.bottom);

    }
}
