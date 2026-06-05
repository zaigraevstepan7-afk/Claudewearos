package re;

import android.view.View;
import androidx.datastore.preferences.protobuf.j;
import java.util.Iterator;
import java.util.List;
import t4.m1;
import t4.v0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b extends j {

    /* renamed from: c, reason: collision with root package name */
    public final View f14374c;

    /* renamed from: d, reason: collision with root package name */
    public int f14375d;

    /* renamed from: e, reason: collision with root package name */
    public int f14376e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f14377f;

    public b(View view) {
        super(0);
        this.f14377f = new int[2];
        this.f14374c = view;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void k(v0 v0Var) {
        this.f14374c.setTranslationY(0.0f);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void l(v0 v0Var) {
        View view = this.f14374c;
        int[] iArr = this.f14377f;
        view.getLocationOnScreen(iArr);
        this.f14375d = iArr[1];
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final m1 m(m1 m1Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((v0) it.next()).f15784a.d() & 8) != 0) {
                this.f14374c.setTranslationY(ne.a.c(r0.f15784a.c(), this.f14376e, 0));
                break;
            }
        }
        return m1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final q5.b n(v0 v0Var, q5.b bVar) {
        View view = this.f14374c;
        int[] iArr = this.f14377f;
        view.getLocationOnScreen(iArr);
        int i10 = this.f14375d - iArr[1];
        this.f14376e = i10;
        view.setTranslationY(i10);
        return bVar;
    }
}
