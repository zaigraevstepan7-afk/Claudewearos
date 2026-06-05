package z5;

import android.util.LogPrinter;
import android.view.View;
import androidx.gridlayout.widget.GridLayout;
import t4.m0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public int f20411a;

    /* renamed from: b, reason: collision with root package name */
    public int f20412b;

    /* renamed from: c, reason: collision with root package name */
    public int f20413c;

    public h() {
        c();
    }

    public int a(GridLayout gridLayout, View view, u0.b bVar, int i10, boolean z2) {
        int i11 = this.f20411a;
        int i12 = m0.f15749a;
        return i11 - bVar.g(view, i10, gridLayout.getLayoutMode());
    }

    public void b(int i10, int i11) {
        this.f20411a = Math.max(this.f20411a, i10);
        this.f20412b = Math.max(this.f20412b, i11);
    }

    public void c() {
        this.f20411a = Integer.MIN_VALUE;
        this.f20412b = Integer.MIN_VALUE;
        this.f20413c = 2;
    }

    public int d(boolean z2) {
        if (!z2) {
            int i10 = this.f20413c;
            LogPrinter logPrinter = GridLayout.B;
            if ((i10 & 2) != 0) {
                return 100000;
            }
        }
        return this.f20411a + this.f20412b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Bounds{before=");
        sb2.append(this.f20411a);
        sb2.append(", after=");
        return m6.a.g(sb2, this.f20412b, '}');
    }
}
