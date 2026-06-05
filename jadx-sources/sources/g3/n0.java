package g3;

import c2.v0;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final n0 f7150d = new n0(0, 0, null, null, null, 0, null, 0, 0, null, 16777215);

    /* renamed from: a, reason: collision with root package name */
    public final f0 f7151a;

    /* renamed from: b, reason: collision with root package name */
    public final t f7152b;

    /* renamed from: c, reason: collision with root package name */
    public final x f7153c;

    public n0(f0 f0Var, t tVar, x xVar) {
        this.f7151a = f0Var;
        this.f7152b = tVar;
        this.f7153c = xVar;
    }

    public static n0 a(n0 n0Var, long j, long j4, k3.s sVar, k3.j jVar, long j10, long j11, x xVar, r3.i iVar, int i10) {
        long jA = (i10 & 1) != 0 ? n0Var.f7151a.f7084a.a() : j;
        long j12 = (i10 & 2) != 0 ? n0Var.f7151a.f7085b : j4;
        k3.s sVar2 = (i10 & 4) != 0 ? n0Var.f7151a.f7086c : sVar;
        f0 f0Var = n0Var.f7151a;
        k3.o oVar = f0Var.f7087d;
        k3.p pVar = f0Var.f7088e;
        k3.j jVar2 = (i10 & 32) != 0 ? f0Var.f7089f : jVar;
        String str = f0Var.f7090g;
        long j13 = (i10 & 128) != 0 ? f0Var.f7091h : j10;
        r3.a aVar = f0Var.f7092i;
        r3.p pVar2 = f0Var.j;
        n3.b bVar = f0Var.f7093k;
        long j14 = f0Var.f7094l;
        r3.l lVar = f0Var.f7095m;
        v0 v0Var = f0Var.f7096n;
        e2.e eVar = f0Var.f7098p;
        t tVar = n0Var.f7152b;
        int i11 = tVar.f7176a;
        int i12 = tVar.f7177b;
        long j15 = (i10 & 131072) != 0 ? tVar.f7178c : j11;
        r3.q qVar = tVar.f7179d;
        x xVar2 = (i10 & 524288) != 0 ? n0Var.f7153c : xVar;
        return new n0(new f0(c2.w.d(jA, f0Var.f7084a.a()) ? f0Var.f7084a : jA != 16 ? new r3.c(jA) : r3.n.f13690a, j12, sVar2, oVar, pVar, jVar2, str, j13, aVar, pVar2, bVar, j14, lVar, v0Var, xVar2 != null ? xVar2.f7191a : null, eVar), new t(i11, i12, j15, qVar, xVar2 != null ? xVar2.f7192b : null, (i10 & 1048576) != 0 ? tVar.f7181f : iVar, tVar.f7182g, tVar.f7183h, tVar.f7184i), xVar2);
    }

    public static n0 e(n0 n0Var, long j, long j4, k3.s sVar, k3.j jVar, long j10, int i10, long j11, int i11) {
        long j12 = (i11 & 2) != 0 ? s3.o.f14757c : j4;
        k3.s sVar2 = (i11 & 4) != 0 ? null : sVar;
        k3.j jVar2 = (i11 & 32) != 0 ? null : jVar;
        long j13 = (i11 & 128) != 0 ? s3.o.f14757c : j10;
        long j14 = c2.w.f3058h;
        int i12 = (32768 & i11) != 0 ? 0 : i10;
        long j15 = (i11 & 131072) != 0 ? s3.o.f14757c : j11;
        f0 f0VarA = g0.a(n0Var.f7151a, j, null, Float.NaN, j12, sVar2, null, null, jVar2, null, j13, null, null, null, j14, null, null, null, null);
        t tVarA = u.a(n0Var.f7152b, i12, 0, j15, null, null, null, 0, 0, null);
        return (n0Var.f7151a == f0VarA && n0Var.f7152b == tVarA) ? n0Var : new n0(f0VarA, tVarA);
    }

    public final long b() {
        return this.f7151a.f7084a.a();
    }

    public final boolean c(n0 n0Var) {
        if (this != n0Var) {
            return fj.l.b(this.f7152b, n0Var.f7152b) && this.f7151a.a(n0Var.f7151a);
        }
        return true;
    }

    public final n0 d(n0 n0Var) {
        return (n0Var == null || n0Var.equals(f7150d)) ? this : new n0(this.f7151a.c(n0Var.f7151a), this.f7152b.a(n0Var.f7152b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return fj.l.b(this.f7151a, n0Var.f7151a) && fj.l.b(this.f7152b, n0Var.f7152b) && fj.l.b(this.f7153c, n0Var.f7153c);
    }

    public final int hashCode() {
        int iHashCode = (this.f7152b.hashCode() + (this.f7151a.hashCode() * 31)) * 31;
        x xVar = this.f7153c;
        return iHashCode + (xVar != null ? xVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextStyle(color=");
        sb2.append((Object) c2.w.j(b()));
        sb2.append(", brush=");
        f0 f0Var = this.f7151a;
        sb2.append(f0Var.f7084a.b());
        sb2.append(", alpha=");
        sb2.append(f0Var.f7084a.e());
        sb2.append(", fontSize=");
        sb2.append((Object) s3.o.d(f0Var.f7085b));
        sb2.append(", fontWeight=");
        sb2.append(f0Var.f7086c);
        sb2.append(", fontStyle=");
        sb2.append(f0Var.f7087d);
        sb2.append(", fontSynthesis=");
        sb2.append(f0Var.f7088e);
        sb2.append(", fontFamily=");
        sb2.append(f0Var.f7089f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(f0Var.f7090g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) s3.o.d(f0Var.f7091h));
        sb2.append(", baselineShift=");
        sb2.append(f0Var.f7092i);
        sb2.append(", textGeometricTransform=");
        sb2.append(f0Var.j);
        sb2.append(", localeList=");
        sb2.append(f0Var.f7093k);
        sb2.append(", background=");
        m1.q(f0Var.f7094l, sb2, ", textDecoration=");
        sb2.append(f0Var.f7095m);
        sb2.append(", shadow=");
        sb2.append(f0Var.f7096n);
        sb2.append(", drawStyle=");
        sb2.append(f0Var.f7098p);
        sb2.append(", textAlign=");
        t tVar = this.f7152b;
        sb2.append((Object) r3.k.b(tVar.f7176a));
        sb2.append(", textDirection=");
        sb2.append((Object) r3.m.a(tVar.f7177b));
        sb2.append(", lineHeight=");
        sb2.append((Object) s3.o.d(tVar.f7178c));
        sb2.append(", textIndent=");
        sb2.append(tVar.f7179d);
        sb2.append(", platformStyle=");
        sb2.append(this.f7153c);
        sb2.append(", lineHeightStyle=");
        sb2.append(tVar.f7181f);
        sb2.append(", lineBreak=");
        sb2.append((Object) r3.e.a(tVar.f7182g));
        sb2.append(", hyphens=");
        sb2.append((Object) r3.d.a(tVar.f7183h));
        sb2.append(", textMotion=");
        sb2.append(tVar.f7184i);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n0(f0 f0Var, t tVar) {
        w wVar = f0Var.f7097o;
        v vVar = tVar.f7180e;
        this(f0Var, tVar, (wVar == null && vVar == null) ? null : new x(wVar, vVar));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n0(long j, long j4, k3.s sVar, k3.o oVar, k3.j jVar, long j10, v0 v0Var, int i10, long j11, x xVar, int i11) {
        long j12 = (i11 & 1) != 0 ? c2.w.f3058h : j;
        long j13 = (i11 & 2) != 0 ? s3.o.f14757c : j4;
        k3.s sVar2 = (i11 & 4) != 0 ? null : sVar;
        k3.o oVar2 = (i11 & 8) != 0 ? null : oVar;
        k3.j jVar2 = (i11 & 32) != 0 ? null : jVar;
        long j14 = (i11 & 128) != 0 ? s3.o.f14757c : j10;
        long j15 = c2.w.f3058h;
        v0 v0Var2 = (i11 & 8192) != 0 ? null : v0Var;
        int i12 = (32768 & i11) != 0 ? 0 : i10;
        long j16 = (131072 & i11) != 0 ? s3.o.f14757c : j11;
        x xVar2 = (i11 & 524288) != 0 ? null : xVar;
        this(new f0(j12, j13, sVar2, oVar2, (k3.p) null, jVar2, (String) null, j14, (r3.a) null, (r3.p) null, (n3.b) null, j15, (r3.l) null, v0Var2, xVar2 != null ? xVar2.f7191a : null), new t(i12, 0, j16, null, xVar2 != null ? xVar2.f7192b : null, null, 0, 0, null), xVar2);
    }
}
