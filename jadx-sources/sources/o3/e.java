package o3;

import android.graphics.Paint;
import android.text.TextPaint;
import c2.e0;
import c2.s;
import c2.v0;
import c2.w;
import f1.y;
import r3.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends TextPaint {

    /* renamed from: a, reason: collision with root package name */
    public c2.h f12404a;

    /* renamed from: b, reason: collision with root package name */
    public l f12405b;

    /* renamed from: c, reason: collision with root package name */
    public int f12406c;

    /* renamed from: d, reason: collision with root package name */
    public v0 f12407d;

    /* renamed from: e, reason: collision with root package name */
    public w f12408e;

    /* renamed from: f, reason: collision with root package name */
    public s f12409f;

    /* renamed from: g, reason: collision with root package name */
    public y f12410g;

    /* renamed from: h, reason: collision with root package name */
    public b2.e f12411h;

    /* renamed from: i, reason: collision with root package name */
    public e2.e f12412i;

    public final c2.h a() {
        c2.h hVar = this.f12404a;
        if (hVar != null) {
            return hVar;
        }
        c2.h hVar2 = new c2.h(this);
        this.f12404a = hVar2;
        return hVar2;
    }

    public final void b(int i10) {
        if (i10 == this.f12406c) {
            return;
        }
        a().d(i10);
        this.f12406c = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(final c2.s r6, final long r7, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.f12410g = r0
            r5.f12409f = r0
            r5.f12411h = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof c2.z0
            if (r1 == 0) goto L1d
            c2.z0 r6 = (c2.z0) r6
            long r6 = r6.f3065a
            long r6 = mk.b.A(r6, r9)
            r5.d(r6)
            return
        L1d:
            boolean r1 = r6 instanceof c2.u0
            if (r1 == 0) goto L71
            c2.s r1 = r5.f12409f
            boolean r1 = fj.l.b(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            b2.e r1 = r5.f12411h
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.f1514a
            boolean r1 = b2.e.a(r3, r7)
        L36:
            if (r1 != 0) goto L58
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L42
            r2 = 1
        L42:
            if (r2 == 0) goto L58
            r5.f12409f = r6
            b2.e r1 = new b2.e
            r1.<init>(r7)
            r5.f12411h = r1
            o3.d r1 = new o3.d
            r1.<init>()
            f1.y r6 = f1.s.q(r1)
            r5.f12410g = r6
        L58:
            c2.h r6 = r5.a()
            f1.y r7 = r5.f12410g
            if (r7 == 0) goto L67
            java.lang.Object r7 = r7.getValue()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L68
        L67:
            r7 = r0
        L68:
            r6.h(r7)
            r5.f12408e = r0
            o3.j.c(r5, r9)
            return
        L71:
            b3.e r6 = new b3.e
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.e.c(c2.s, long, float):void");
    }

    public final void d(long j) {
        w wVar = this.f12408e;
        if (wVar == null ? false : w.d(wVar.f3060a, j)) {
            return;
        }
        if (j != 16) {
            this.f12408e = new w(j);
            setColor(e0.E(j));
            this.f12410g = null;
            this.f12409f = null;
            this.f12411h = null;
            setShader(null);
        }
    }

    public final void e(e2.e eVar) {
        if (eVar == null || fj.l.b(this.f12412i, eVar)) {
            return;
        }
        this.f12412i = eVar;
        if (eVar.equals(e2.g.f5743a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(eVar instanceof e2.h)) {
            throw new b3.e();
        }
        a().l(1);
        e2.h hVar = (e2.h) eVar;
        a().k(hVar.f5744a);
        c2.h hVarA = a();
        hVarA.f2999a.setStrokeMiter(hVar.f5745b);
        a().j(hVar.f5747d);
        a().i(hVar.f5746c);
        a().f2999a.setPathEffect(null);
    }

    public final void f(v0 v0Var) {
        if (v0Var == null || fj.l.b(this.f12407d, v0Var)) {
            return;
        }
        this.f12407d = v0Var;
        if (v0Var.equals(v0.f3048d)) {
            clearShadowLayer();
            return;
        }
        v0 v0Var2 = this.f12407d;
        float f10 = v0Var2.f3051c;
        if (f10 == 0.0f) {
            f10 = Float.MIN_VALUE;
        }
        setShadowLayer(f10, Float.intBitsToFloat((int) (v0Var2.f3050b >> 32)), Float.intBitsToFloat((int) (this.f12407d.f3050b & 4294967295L)), e0.E(this.f12407d.f3049a));
    }

    public final void g(l lVar) {
        if (lVar == null || fj.l.b(this.f12405b, lVar)) {
            return;
        }
        this.f12405b = lVar;
        int i10 = lVar.f13688a;
        setUnderlineText((i10 | 1) == i10);
        int i11 = this.f12405b.f13688a;
        setStrikeThruText((i11 | 2) == i11);
    }
}
