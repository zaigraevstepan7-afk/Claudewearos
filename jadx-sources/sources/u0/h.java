package u0;

import g3.n0;
import java.util.List;
import t.m1;
import v2.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final g3.f f16528b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f16529c;

    /* renamed from: d, reason: collision with root package name */
    public final k3.i f16530d;

    /* renamed from: e, reason: collision with root package name */
    public final ej.c f16531e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16532f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f16533g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16534h;

    /* renamed from: i, reason: collision with root package name */
    public final int f16535i;
    public final List j;

    /* renamed from: k, reason: collision with root package name */
    public final ej.c f16536k;

    /* renamed from: l, reason: collision with root package name */
    public final ej.c f16537l;

    public h(g3.f fVar, n0 n0Var, k3.i iVar, ej.c cVar, int i10, boolean z2, int i11, int i12, List list, ej.c cVar2, ej.c cVar3) {
        this.f16528b = fVar;
        this.f16529c = n0Var;
        this.f16530d = iVar;
        this.f16531e = cVar;
        this.f16532f = i10;
        this.f16533g = z2;
        this.f16534h = i11;
        this.f16535i = i12;
        this.j = list;
        this.f16536k = cVar2;
        this.f16537l = cVar3;
    }

    @Override // v2.x0
    public final v1.n d() {
        k kVar = new k();
        kVar.H = this.f16528b;
        kVar.I = this.f16529c;
        kVar.J = this.f16530d;
        kVar.K = this.f16531e;
        kVar.L = this.f16532f;
        kVar.M = this.f16533g;
        kVar.N = this.f16534h;
        kVar.O = this.f16535i;
        kVar.P = this.j;
        kVar.Q = this.f16536k;
        kVar.R = this.f16537l;
        return kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return fj.l.b(this.f16528b, hVar.f16528b) && fj.l.b(this.f16529c, hVar.f16529c) && fj.l.b(this.j, hVar.j) && fj.l.b(this.f16530d, hVar.f16530d) && this.f16531e == hVar.f16531e && this.f16537l == hVar.f16537l && this.f16532f == hVar.f16532f && this.f16533g == hVar.f16533g && this.f16534h == hVar.f16534h && this.f16535i == hVar.f16535i && this.f16536k == hVar.f16536k;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // v2.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(v1.n r18) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.h.g(v1.n):void");
    }

    public final int hashCode() {
        int iHashCode = (this.f16530d.hashCode() + m1.d(this.f16529c, this.f16528b.hashCode() * 31, 31)) * 31;
        ej.c cVar = this.f16531e;
        int i10 = (((gk.b.i(gk.b.g(this.f16532f, (iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31, 31), 31, this.f16533g) + this.f16534h) * 31) + this.f16535i) * 31;
        List list = this.j;
        int iHashCode2 = (i10 + (list != null ? list.hashCode() : 0)) * 31;
        ej.c cVar2 = this.f16536k;
        int iHashCode3 = (iHashCode2 + (cVar2 != null ? cVar2.hashCode() : 0)) * 29791;
        ej.c cVar3 = this.f16537l;
        return iHashCode3 + (cVar3 != null ? cVar3.hashCode() : 0);
    }
}
