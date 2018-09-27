package com.pbn.ui.library.textview;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * function:
 * 提供可以高亮滚动的textview
 *
 * @author peiboning
 * @DATE 2018/09/27
 */
public class HighLightTextView extends TextView{
    private Paint mPaint;
    private LinearGradient mLinearGradient;
    private Matrix mMatrix;
    private int mTranslateX;
    private int mViewWidth;

    public HighLightTextView(Context context) {
        super(context);
    }

    public HighLightTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public HighLightTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        //我们可以在这里拿到measure后的结果
        if(mViewWidth == 0){
            mViewWidth = getMeasuredWidth();
            if(mViewWidth > 0){
                mLinearGradient =
                        new LinearGradient(0, getMeasuredHeight(), mViewWidth, 0, )
            }
        }
    }
}
