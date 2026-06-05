package g3;

import c2.v0;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f0 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final r3.o f7084a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7085b;

    /* renamed from: c, reason: collision with root package name */
    public final k3.s f7086c;

    /* renamed from: d, reason: collision with root package name */
    public final k3.o f7087d;

    /* renamed from: e, reason: collision with root package name */
    public final k3.p f7088e;

    /* renamed from: f, reason: collision with root package name */
    public final k3.j f7089f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7090g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7091h;

    /* renamed from: i, reason: collision with root package name */
    public final r3.a f7092i;
    public final r3.p j;

    /* renamed from: k, reason: collision with root package name */
    public final n3.b f7093k;

    /* renamed from: l, reason: collision with root package name */
    public final long f7094l;

    /* renamed from: m, reason: collision with root package name */
    public final r3.l f7095m;

    /* renamed from: n, reason: collision with root package name */
    public final v0 f7096n;

    /* renamed from: o, reason: collision with root package name */
    public final w f7097o;

    /* renamed from: p, reason: collision with root package name */
    public final e2.e f7098p;

    public f0(long j, long j4, k3.s sVar, k3.o oVar, k3.p pVar, k3.j jVar, String str, long j10, r3.a aVar, r3.p pVar2, n3.b bVar, long j11, r3.l lVar, v0 v0Var, w wVar) {
        this(j != 16 ? new r3.c(j) : r3.n.f13690a, j4, sVar, oVar, pVar, jVar, str, j10, aVar, pVar2, bVar, j11, lVar, v0Var, wVar, null);
    }

    public final boolean a(f0 f0Var) {
        if (this == f0Var) {
            return true;
        }
        return s3.o.a(this.f7085b, f0Var.f7085b) && fj.l.b(this.f7086c, f0Var.f7086c) && fj.l.b(this.f7087d, f0Var.f7087d) && fj.l.b(this.f7088e, f0Var.f7088e) && fj.l.b(this.f7089f, f0Var.f7089f) && fj.l.b(this.f7090g, f0Var.f7090g) && s3.o.a(this.f7091h, f0Var.f7091h) && fj.l.b(this.f7092i, f0Var.f7092i) && fj.l.b(this.j, f0Var.j) && fj.l.b(this.f7093k, f0Var.f7093k) && c2.w.d(this.f7094l, f0Var.f7094l) && fj.l.b(this.f7097o, f0Var.f7097o);
    }

    public final boolean b(f0 f0Var) {
        return fj.l.b(this.f7084a, f0Var.f7084a) && fj.l.b(this.f7095m, f0Var.f7095m) && fj.l.b(this.f7096n, f0Var.f7096n) && fj.l.b(this.f7098p, f0Var.f7098p);
    }

    public final f0 c(f0 f0Var) {
        if (f0Var == null) {
            return this;
        }
        r3.o oVar = f0Var.f7084a;
        return g0.a(this, oVar.a(), oVar.b(), oVar.e(), f0Var.f7085b, f0Var.f7086c, f0Var.f7087d, f0Var.f7088e, f0Var.f7089f, f0Var.f7090g, f0Var.f7091h, f0Var.f7092i, f0Var.j, f0Var.f7093k, f0Var.f7094l, f0Var.f7095m, f0Var.f7096n, f0Var.f7097o, f0Var.f7098p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return a(f0Var) && b(f0Var);
    }

    public final int hashCode() {
        r3.o oVar = this.f7084a;
        long jA = oVar.a();
        int i10 = c2.w.f3059i;
        int iHashCode = Long.hashCode(jA) * 31;
        c2.s sVarB = oVar.b();
        int iHashCode2 = (Float.hashCode(oVar.e()) + ((iHashCode + (sVarB != null ? sVarB.hashCode() : 0)) * 31)) * 31;
        s3.p[] pVarArr = s3.o.f14756b;
        int iJ = gk.b.j(iHashCode2, this.f7085b, 31);
        k3.s sVar = this.f7086c;
        int i11 = (iJ + (sVar != null ? sVar.f9401a : 0)) * 31;
        k3.o oVar2 = this.f7087d;
        int iHashCode3 = (i11 + (oVar2 != null ? Integer.hashCode(oVar2.f9392a) : 0)) * 31;
        k3.p pVar = this.f7088e;
        int iHashCode4 = (iHashCode3 + (pVar != null ? Integer.hashCode(pVar.f9393a) : 0)) * 31;
        k3.j jVar = this.f7089f;
        int iHashCode5 = (iHashCode4 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        String str = this.f7090g;
        int iJ2 = gk.b.j((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, this.f7091h, 31);
        r3.a aVar = this.f7092i;
        int iHashCode6 = (iJ2 + (aVar != null ? Float.hashCode(aVar.f13664a) : 0)) * 31;
        r3.p pVar2 = this.j;
        int iHashCode7 = (iHashCode6 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        n3.b bVar = this.f7093k;
        int iJ3 = gk.b.j((iHashCode7 + (bVar != null ? bVar.f11897a.hashCode() : 0)) * 31, this.f7094l, 31);
        r3.l lVar = this.f7095m;
        int i12 = (iJ3 + (lVar != null ? lVar.f13688a : 0)) * 31;
        v0 v0Var = this.f7096n;
        int iHashCode8 = (i12 + (v0Var != null ? v0Var.hashCode() : 0)) * 31;
        w wVar = this.f7097o;
        int iHashCode9 = (iHashCode8 + (wVar != null ? wVar.hashCode() : 0)) * 31;
        e2.e eVar = this.f7098p;
        return iHashCode9 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanStyle(color=");
        r3.o oVar = this.f7084a;
        sb2.append((Object) c2.w.j(oVar.a()));
        sb2.append(", brush=");
        sb2.append(oVar.b());
        sb2.append(", alpha=");
        sb2.append(oVar.e());
        sb2.append(", fontSize=");
        sb2.append((Object) s3.o.d(this.f7085b));
        sb2.append(", fontWeight=");
        sb2.append(this.f7086c);
        sb2.append(", fontStyle=");
        sb2.append(this.f7087d);
        sb2.append(", fontSynthesis=");
        sb2.append(this.f7088e);
        sb2.append(", fontFamily=");
        sb2.append(this.f7089f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(this.f7090g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) s3.o.d(this.f7091h));
        sb2.append(", baselineShift=");
        sb2.append(this.f7092i);
        sb2.append(", textGeometricTransform=");
        sb2.append(this.j);
        sb2.append(", localeList=");
        sb2.append(this.f7093k);
        sb2.append(", background=");
        m1.q(this.f7094l, sb2, ", textDecoration=");
        sb2.append(this.f7095m);
        sb2.append(", shadow=");
        sb2.append(this.f7096n);
        sb2.append(", platformStyle=");
        sb2.append(this.f7097o);
        sb2.append(", drawStyle=");
        sb2.append(this.f7098p);
        sb2.append(')');
        return sb2.toString();
    }

    public f0(r3.o oVar, long j, k3.s sVar, k3.o oVar2, k3.p pVar, k3.j jVar, String str, long j4, r3.a aVar, r3.p pVar2, n3.b bVar, long j10, r3.l lVar, v0 v0Var, w wVar, e2.e eVar) {
        this.f7084a = oVar;
        this.f7085b = j;
        this.f7086c = sVar;
        this.f7087d = oVar2;
        this.f7088e = pVar;
        this.f7089f = jVar;
        this.f7090g = str;
        this.f7091h = j4;
        this.f7092i = aVar;
        this.j = pVar2;
        this.f7093k = bVar;
        this.f7094l = j10;
        this.f7095m = lVar;
        this.f7096n = v0Var;
        this.f7097o = wVar;
        this.f7098p = eVar;
    }

    public f0(long j, long j4, k3.s sVar, k3.o oVar, k3.p pVar, k3.j jVar, String str, long j10, r3.a aVar, r3.p pVar2, n3.b bVar, long j11, r3.l lVar, v0 v0Var, int i10) {
        this((i10 & 1) != 0 ? c2.w.f3058h : j, (i10 & 2) != 0 ? s3.o.f14757c : j4, (i10 & 4) != 0 ? null : sVar, (i10 & 8) != 0 ? null : oVar, (i10 & 16) != 0 ? null : pVar, (i10 & 32) != 0 ? null : jVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? s3.o.f14757c : j10, (i10 & 256) != 0 ? null : aVar, (i10 & 512) != 0 ? null : pVar2, (i10 & 1024) != 0 ? null : bVar, (i10 & 2048) != 0 ? c2.w.f3058h : j11, (i10 & 4096) != 0 ? null : lVar, (i10 & 8192) != 0 ? null : v0Var, (w) null);
    }
}
