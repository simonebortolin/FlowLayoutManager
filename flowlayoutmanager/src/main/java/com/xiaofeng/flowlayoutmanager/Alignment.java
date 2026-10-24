package com.xiaofeng.flowlayoutmanager;

/**
 * Horizontal alignment of the items in each line of a {@link FlowLayoutManager}.
 *
 * @author xhan
 * @see FlowLayoutManager#setAlignment(Alignment)
 */
public enum Alignment {
    /** Items start from the left edge, lines are filled left to right. */
    LEFT,
    /** Items start from the right edge, lines are filled right to left. */
    RIGHT,
    /** Items are laid out left to right and each line is centered. */
    CENTER
}
