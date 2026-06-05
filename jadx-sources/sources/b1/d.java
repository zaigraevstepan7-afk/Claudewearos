package b1;

import android.content.Context;
import android.view.ViewGroup;
import com.anonlab.voidlauncher.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final int f1466a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1467b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1468c;

    /* renamed from: d, reason: collision with root package name */
    public final mh.g f1469d;

    /* renamed from: e, reason: collision with root package name */
    public int f1470e;

    public d(Context context) {
        super(context);
        this.f1466a = 5;
        ArrayList arrayList = new ArrayList();
        this.f1467b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f1468c = arrayList2;
        this.f1469d = new mh.g(2);
        setClipChildren(false);
        e eVar = new e(context);
        addView(eVar);
        arrayList.add(eVar);
        arrayList2.add(eVar);
        this.f1470e = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i10, int i11, int i12, int i13) {
    }
}
