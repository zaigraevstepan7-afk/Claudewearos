package s1;

import android.os.Bundle;
import androidx.lifecycle.v;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i implements e, a7.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f14731a;

    /* renamed from: b, reason: collision with root package name */
    public v f14732b;

    /* renamed from: c, reason: collision with root package name */
    public t0.j f14733c;

    public i(f fVar) {
        this.f14731a = fVar;
        Object objD = fVar.d("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objD instanceof Bundle ? (Bundle) objD : null;
        if (bundle != null && this.f14733c == null) {
            t0.j jVar = new t0.j(new c7.b(this, new a7.e(this, 0)));
            this.f14733c = jVar;
            jVar.r(bundle);
        }
        fVar.e("androidx.savedstate.SavedStateRegistry", new q0.k(this, 7));
    }

    @Override // s1.e
    public final boolean b(Object obj) {
        return this.f14731a.b(obj);
    }

    @Override // s1.e
    public final Map c() {
        return this.f14731a.c();
    }

    @Override // s1.e
    public final Object d(String str) {
        return this.f14731a.d(str);
    }

    @Override // s1.e
    public final d e(String str, ej.a aVar) {
        return this.f14731a.e(str, aVar);
    }

    @Override // a7.f
    public final mh.g g() {
        t0.j jVar = this.f14733c;
        if (jVar == null) {
            t0.j jVar2 = new t0.j(new c7.b(this, new a7.e(this, 0)));
            this.f14733c = jVar2;
            jVar2.r(null);
            jVar = jVar2;
        }
        return (mh.g) jVar.f15364c;
    }

    @Override // androidx.lifecycle.t
    public final v h() {
        v vVar = this.f14732b;
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v(this, false);
        this.f14732b = vVar2;
        return vVar2;
    }
}
