package p1;

import f1.n1;
import f1.q1;
import f1.u2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends m1.c implements n1 {

    /* renamed from: d, reason: collision with root package name */
    public static final i f12646d = new i(m1.m.f11248e, 0);

    @Override // m1.c, k1.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final h builder() {
        h hVar = new h(this);
        hVar.f12645z = this;
        return hVar;
    }

    @Override // m1.c, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof q1) {
            return super.containsKey((q1) obj);
        }
        return false;
    }

    @Override // qi.e, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof u2) {
            return super.containsValue((u2) obj);
        }
        return false;
    }

    public final i d(q1 q1Var, u2 u2Var) {
        k4.d dVarU = this.f11226a.u(q1Var, q1Var.hashCode(), 0, u2Var);
        return dVarU == null ? this : new i((m1.m) dVarU.f9421b, this.f11227b + dVarU.f9420a);
    }

    @Override // m1.c, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof q1) {
            return (u2) super.get((q1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof q1) ? obj2 : (u2) super.getOrDefault((q1) obj, (u2) obj2);
    }
}
