package i2;

import android.graphics.Path;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends c0 {

    /* renamed from: b, reason: collision with root package name */
    public c2.s f8251b;

    /* renamed from: c, reason: collision with root package name */
    public float f8252c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public List f8253d;

    /* renamed from: e, reason: collision with root package name */
    public float f8254e;

    /* renamed from: f, reason: collision with root package name */
    public float f8255f;

    /* renamed from: g, reason: collision with root package name */
    public c2.s f8256g;

    /* renamed from: h, reason: collision with root package name */
    public int f8257h;

    /* renamed from: i, reason: collision with root package name */
    public int f8258i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f8259k;

    /* renamed from: l, reason: collision with root package name */
    public float f8260l;

    /* renamed from: m, reason: collision with root package name */
    public float f8261m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8262n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8263o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8264p;

    /* renamed from: q, reason: collision with root package name */
    public e2.h f8265q;

    /* renamed from: r, reason: collision with root package name */
    public final c2.j f8266r;

    /* renamed from: s, reason: collision with root package name */
    public c2.j f8267s;

    /* renamed from: t, reason: collision with root package name */
    public c2.j f8268t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f8269u;

    public h() {
        int i10 = h0.f8270a;
        this.f8253d = qi.s.f13520a;
        this.f8254e = 1.0f;
        this.f8257h = 0;
        this.f8258i = 0;
        this.j = 4.0f;
        this.f8260l = 1.0f;
        this.f8262n = true;
        this.f8263o = true;
        c2.j jVarA = c2.l.a();
        this.f8266r = jVarA;
        this.f8267s = jVarA;
        this.f8269u = u6.v.P(pi.f.f12998b, g.f8241b);
    }

    @Override // i2.c0
    public final void a(e2.d dVar) {
        e2.d dVar2;
        e2.h hVar;
        if (this.f8262n) {
            b.e(this.f8253d, this.f8266r);
            e();
        } else if (this.f8264p) {
            e();
        }
        this.f8262n = false;
        this.f8264p = false;
        c2.s sVar = this.f8251b;
        if (sVar != null) {
            dVar2 = dVar;
            e2.d.B0(dVar2, this.f8267s, sVar, this.f8252c, null, 56);
        } else {
            dVar2 = dVar;
        }
        c2.s sVar2 = this.f8256g;
        if (sVar2 != null) {
            e2.h hVar2 = this.f8265q;
            if (this.f8263o || hVar2 == null) {
                e2.h hVar3 = new e2.h(this.f8257h, this.f8258i, this.f8255f, this.j, 16);
                this.f8265q = hVar3;
                this.f8263o = false;
                hVar = hVar3;
            } else {
                hVar = hVar2;
            }
            e2.d.B0(dVar2, this.f8267s, sVar2, this.f8254e, hVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, pi.e] */
    public final void e() {
        float f10 = this.f8259k;
        c2.j jVar = this.f8266r;
        if (f10 == 0.0f && this.f8260l == 1.0f) {
            this.f8267s = jVar;
            return;
        }
        if (fj.l.b(this.f8267s, jVar)) {
            this.f8267s = c2.l.a();
        } else {
            Path.FillType fillType = this.f8267s.f3006a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z2 = fillType == fillType2;
            this.f8267s.k();
            Path path = this.f8267s.f3006a;
            if (!z2) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        ?? r02 = this.f8269u;
        ((c2.k) r02.getValue()).f3014a.setPath(jVar != null ? jVar.f3006a : null, false);
        float length = ((c2.k) r02.getValue()).f3014a.getLength();
        float f11 = this.f8259k;
        float f12 = this.f8261m;
        float f13 = ((f11 + f12) % 1.0f) * length;
        float f14 = ((this.f8260l + f12) % 1.0f) * length;
        if (f13 <= f14) {
            ((c2.k) r02.getValue()).a(f13, f14, this.f8267s);
            return;
        }
        c2.j jVarA = this.f8268t;
        if (jVarA == null) {
            jVarA = c2.l.a();
            this.f8268t = jVarA;
        }
        jVarA.j();
        ((c2.k) r02.getValue()).a(f13, length, jVarA);
        c2.j.a(this.f8267s, jVarA);
        jVarA.j();
        ((c2.k) r02.getValue()).a(0.0f, f14, jVarA);
        c2.j.a(this.f8267s, jVarA);
    }

    public final String toString() {
        return this.f8266r.toString();
    }
}
