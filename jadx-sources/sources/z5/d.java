package z5;

import android.view.View;
import androidx.gridlayout.widget.GridLayout;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends h {

    /* renamed from: d, reason: collision with root package name */
    public int f20382d;

    @Override // z5.h
    public final int a(GridLayout gridLayout, View view, u0.b bVar, int i10, boolean z2) {
        return Math.max(0, super.a(gridLayout, view, bVar, i10, z2));
    }

    @Override // z5.h
    public final void b(int i10, int i11) {
        super.b(i10, i11);
        this.f20382d = Math.max(this.f20382d, i10 + i11);
    }

    @Override // z5.h
    public final void c() {
        super.c();
        this.f20382d = Integer.MIN_VALUE;
    }

    @Override // z5.h
    public final int d(boolean z2) {
        return Math.max(super.d(z2), this.f20382d);
    }
}
