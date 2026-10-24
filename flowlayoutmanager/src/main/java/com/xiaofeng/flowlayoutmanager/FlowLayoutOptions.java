package com.xiaofeng.flowlayoutmanager;

/**
 * Layout options of a {@link FlowLayoutManager}: alignment, items per line and max lines.
 * Set them with the {@link FlowLayoutManager} builder methods.
 *
 * @author xhan
 */
public class FlowLayoutOptions {
    /** Value of {@link #itemsPerLine} that puts as many items in a line as fit. */
	public static final int ITEM_PER_LINE_NO_LIMIT = 0;
    /** Value of {@link #maxLines} that shows all lines. */
	public static final int MAX_LINES_NO_LIMIT = 0;
    /** Alignment of the items in each line, {@link Alignment#CENTER} by default. */
    public Alignment alignment = Alignment.CENTER;
    /**
     * Max number of items in a line. {@link #ITEM_PER_LINE_NO_LIMIT} (or any value &lt;= 0)
     * puts as many items as fit.
     */
    public int itemsPerLine = ITEM_PER_LINE_NO_LIMIT;
    /**
     * Max number of lines to show, items after the last line are not laid out.
     * {@link #MAX_LINES_NO_LIMIT} (or any value &lt;= 0) shows all lines.
     */
    public int maxLines = MAX_LINES_NO_LIMIT;

    /**
     * @param layoutOptions options to copy
     * @return a copy of {@code layoutOptions}
     */
	public static FlowLayoutOptions clone(FlowLayoutOptions layoutOptions) {
		FlowLayoutOptions result = new FlowLayoutOptions();
		result.alignment = layoutOptions.alignment;
		result.itemsPerLine = layoutOptions.itemsPerLine;
		result.maxLines = layoutOptions.maxLines;
		return result;
	}
}
