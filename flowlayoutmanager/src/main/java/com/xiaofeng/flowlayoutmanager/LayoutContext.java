package com.xiaofeng.flowlayoutmanager;

/**
 * State of a layout pass: the layout options and the number of items already placed in the
 * current line. Used internally by {@link FlowLayoutManager}.
 *
 * @author xhan
 */
public class LayoutContext {
	public FlowLayoutOptions layoutOptions;
	public int currentLineItemCount;

	public static LayoutContext clone(LayoutContext layoutContext) {
		LayoutContext resultContext = new LayoutContext();
		resultContext.currentLineItemCount = layoutContext.currentLineItemCount;
		resultContext.layoutOptions = FlowLayoutOptions.clone(layoutContext.layoutOptions);
		return resultContext;
	}

	public static LayoutContext fromLayoutOptions(FlowLayoutOptions layoutOptions) {
		LayoutContext layoutContext = new LayoutContext();
		layoutContext.layoutOptions = layoutOptions;
		return layoutContext;
	}
}
