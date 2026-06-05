package androidx.appcompat.view.menu;

import ac.d;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import l.g;
import l.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements g, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f769a = {R.attr.background, R.attr.divider};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        d dVarF = d.F(context, attributeSet, f769a, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) dVarF.f374c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(dVarF.l(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(dVarF.l(1));
        }
        dVarF.I();
    }

    @Override // l.g
    public final boolean a(i iVar) {
        throw null;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
        throw null;
    }
}
