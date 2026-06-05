package g3;

import java.util.List;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final f f7117a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f7118b;

    /* renamed from: c, reason: collision with root package name */
    public final List f7119c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7120d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7121e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7122f;

    /* renamed from: g, reason: collision with root package name */
    public final s3.c f7123g;

    /* renamed from: h, reason: collision with root package name */
    public final s3.m f7124h;

    /* renamed from: i, reason: collision with root package name */
    public final k3.i f7125i;
    public final long j;

    public j0(f fVar, n0 n0Var, List list, int i10, boolean z2, int i11, s3.c cVar, s3.m mVar, k3.i iVar, long j) {
        this.f7117a = fVar;
        this.f7118b = n0Var;
        this.f7119c = list;
        this.f7120d = i10;
        this.f7121e = z2;
        this.f7122f = i11;
        this.f7123g = cVar;
        this.f7124h = mVar;
        this.f7125i = iVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return fj.l.b(this.f7117a, j0Var.f7117a) && fj.l.b(this.f7118b, j0Var.f7118b) && fj.l.b(this.f7119c, j0Var.f7119c) && this.f7120d == j0Var.f7120d && this.f7121e == j0Var.f7121e && this.f7122f == j0Var.f7122f && fj.l.b(this.f7123g, j0Var.f7123g) && this.f7124h == j0Var.f7124h && fj.l.b(this.f7125i, j0Var.f7125i) && s3.a.b(this.j, j0Var.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.f7125i.hashCode() + ((this.f7124h.hashCode() + ((this.f7123g.hashCode() + gk.b.g(this.f7122f, gk.b.i((gk.b.h(m1.d(this.f7118b, this.f7117a.hashCode() * 31, 31), 31, this.f7119c) + this.f7120d) * 31, 31, this.f7121e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextLayoutInput(text=");
        sb2.append((Object) this.f7117a);
        sb2.append(", style=");
        sb2.append(this.f7118b);
        sb2.append(", placeholders=");
        sb2.append(this.f7119c);
        sb2.append(", maxLines=");
        sb2.append(this.f7120d);
        sb2.append(", softWrap=");
        sb2.append(this.f7121e);
        sb2.append(", overflow=");
        int i10 = this.f7122f;
        sb2.append((Object) (i10 == 1 ? "Clip" : i10 == 2 ? "Ellipsis" : i10 == 5 ? "MiddleEllipsis" : i10 == 3 ? "Visible" : i10 == 4 ? "StartEllipsis" : "Invalid"));
        sb2.append(", density=");
        sb2.append(this.f7123g);
        sb2.append(", layoutDirection=");
        sb2.append(this.f7124h);
        sb2.append(", fontFamilyResolver=");
        sb2.append(this.f7125i);
        sb2.append(", constraints=");
        sb2.append((Object) s3.a.l(this.j));
        sb2.append(')');
        return sb2.toString();
    }
}
