package com.yohn.test.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by admin on 2018/1/16.
 */

public class FooterBehaviorDepency extends CoordinatorLayout.Behavior<View>{
    public FooterBehaviorDepency(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
        return dependency instanceof AppBarLayout;
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
        float translationY=Math.abs(dependency.getTranslationY());
        child.setTranslationY(translationY);
        return true;
    }

}
