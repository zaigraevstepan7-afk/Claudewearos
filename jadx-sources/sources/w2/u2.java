package w2;

import com.anonlab.voidlauncher.R;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u2 implements f1.o, androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final t f18431a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.r f18432b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18433c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.v f18434d;

    /* renamed from: e, reason: collision with root package name */
    public ej.e f18435e = z0.f18469a;

    public u2(t tVar, f1.r rVar) {
        this.f18431a = tVar;
        this.f18432b = rVar;
    }

    public final void a() {
        if (!this.f18433c) {
            this.f18433c = true;
            this.f18431a.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.v vVar = this.f18434d;
            if (vVar != null) {
                vVar.f(this);
            }
            this.f18434d = null;
        }
        this.f18432b.m();
    }

    public final void c(ej.e eVar) {
        this.f18431a.setOnReadyForComposition(new c2.p(12, this, eVar));
    }

    @Override // androidx.lifecycle.r
    public final void e(androidx.lifecycle.t tVar, androidx.lifecycle.n nVar) {
        if (nVar == androidx.lifecycle.n.ON_DESTROY) {
            a();
        } else {
            if (nVar != androidx.lifecycle.n.ON_CREATE || this.f18433c) {
                return;
            }
            c(this.f18435e);
        }
    }
}
