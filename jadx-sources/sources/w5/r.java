package w5;

import android.view.View;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r extends u1.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f18728d;

    public r(t tVar) {
        this.f18728d = tVar;
    }

    @Override // u1.b
    public final View t(int i10) {
        t tVar = this.f18728d;
        View view = tVar.Z;
        if (view != null) {
            return view.findViewById(i10);
        }
        throw new IllegalStateException("Fragment " + tVar + " does not have a view");
    }

    @Override // u1.b
    public final boolean u() {
        return this.f18728d.Z != null;
    }
}
