package g3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t implements a {

    /* renamed from: a, reason: collision with root package name */
    public final int f7176a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7177b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7178c;

    /* renamed from: d, reason: collision with root package name */
    public final r3.q f7179d;

    /* renamed from: e, reason: collision with root package name */
    public final v f7180e;

    /* renamed from: f, reason: collision with root package name */
    public final r3.i f7181f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7182g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7183h;

    /* renamed from: i, reason: collision with root package name */
    public final r3.s f7184i;

    public t(int i10, int i11, long j, r3.q qVar, v vVar, r3.i iVar, int i12, int i13, r3.s sVar) {
        this.f7176a = i10;
        this.f7177b = i11;
        this.f7178c = j;
        this.f7179d = qVar;
        this.f7180e = vVar;
        this.f7181f = iVar;
        this.f7182g = i12;
        this.f7183h = i13;
        this.f7184i = sVar;
        if (s3.o.a(j, s3.o.f14757c) || s3.o.c(j) >= 0.0f) {
            return;
        }
        m3.a.b("lineHeight can't be negative (" + s3.o.c(j) + ')');
    }

    public final t a(t tVar) {
        return tVar == null ? this : u.a(this, tVar.f7176a, tVar.f7177b, tVar.f7178c, tVar.f7179d, tVar.f7180e, tVar.f7181f, tVar.f7182g, tVar.f7183h, tVar.f7184i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f7176a == tVar.f7176a && this.f7177b == tVar.f7177b && s3.o.a(this.f7178c, tVar.f7178c) && fj.l.b(this.f7179d, tVar.f7179d) && fj.l.b(this.f7180e, tVar.f7180e) && fj.l.b(this.f7181f, tVar.f7181f) && this.f7182g == tVar.f7182g && this.f7183h == tVar.f7183h && fj.l.b(this.f7184i, tVar.f7184i);
    }

    public final int hashCode() {
        int iG = gk.b.g(this.f7177b, Integer.hashCode(this.f7176a) * 31, 31);
        s3.p[] pVarArr = s3.o.f14756b;
        int iJ = gk.b.j(iG, this.f7178c, 31);
        r3.q qVar = this.f7179d;
        int iHashCode = (iJ + (qVar != null ? qVar.hashCode() : 0)) * 31;
        v vVar = this.f7180e;
        int iHashCode2 = (iHashCode + (vVar != null ? vVar.hashCode() : 0)) * 31;
        r3.i iVar = this.f7181f;
        int iG2 = gk.b.g(this.f7183h, gk.b.g(this.f7182g, (iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31, 31), 31);
        r3.s sVar = this.f7184i;
        return iG2 + (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) r3.k.b(this.f7176a)) + ", textDirection=" + ((Object) r3.m.a(this.f7177b)) + ", lineHeight=" + ((Object) s3.o.d(this.f7178c)) + ", textIndent=" + this.f7179d + ", platformStyle=" + this.f7180e + ", lineHeightStyle=" + this.f7181f + ", lineBreak=" + ((Object) r3.e.a(this.f7182g)) + ", hyphens=" + ((Object) r3.d.a(this.f7183h)) + ", textMotion=" + this.f7184i + ')';
    }
}
