package v;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17234a;

    /* renamed from: b, reason: collision with root package name */
    public final s3.c f17235b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17236c;

    /* renamed from: d, reason: collision with root package name */
    public final b0.i1 f17237d;

    public j(Context context, s3.c cVar, long j, b0.i1 i1Var) {
        this.f17234a = context;
        this.f17235b = cVar;
        this.f17236c = j;
        this.f17237d = i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!j.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        fj.l.d(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        j jVar = (j) obj;
        return fj.l.b(this.f17234a, jVar.f17234a) && fj.l.b(this.f17235b, jVar.f17235b) && c2.w.d(this.f17236c, jVar.f17236c) && fj.l.b(this.f17237d, jVar.f17237d);
    }

    public final int hashCode() {
        int iHashCode = (this.f17235b.hashCode() + (this.f17234a.hashCode() * 31)) * 31;
        int i10 = c2.w.f3059i;
        return this.f17237d.hashCode() + gk.b.j(iHashCode, this.f17236c, 31);
    }
}
