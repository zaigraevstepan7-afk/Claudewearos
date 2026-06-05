package f2;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import c2.e0;
import c2.l0;
import c2.m0;
import c2.n0;
import c2.r0;
import c2.x0;
import java.util.Locale;
import s3.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d f6514a;

    /* renamed from: f, reason: collision with root package name */
    public Outline f6519f;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public e0 f6523k;

    /* renamed from: l, reason: collision with root package name */
    public c2.j f6524l;

    /* renamed from: m, reason: collision with root package name */
    public c2.j f6525m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6526n;

    /* renamed from: o, reason: collision with root package name */
    public e2.b f6527o;

    /* renamed from: p, reason: collision with root package name */
    public c2.h f6528p;

    /* renamed from: q, reason: collision with root package name */
    public int f6529q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6531s;

    /* renamed from: t, reason: collision with root package name */
    public long f6532t;

    /* renamed from: u, reason: collision with root package name */
    public long f6533u;

    /* renamed from: v, reason: collision with root package name */
    public long f6534v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6535w;

    /* renamed from: x, reason: collision with root package name */
    public RectF f6536x;

    /* renamed from: b, reason: collision with root package name */
    public s3.c f6515b = e2.c.f5741a;

    /* renamed from: c, reason: collision with root package name */
    public m f6516c = m.f14752a;

    /* renamed from: d, reason: collision with root package name */
    public ej.c f6517d = a.f6511b;

    /* renamed from: e, reason: collision with root package name */
    public final x0 f6518e = new x0(this, 4);

    /* renamed from: g, reason: collision with root package name */
    public boolean f6520g = true;

    /* renamed from: h, reason: collision with root package name */
    public long f6521h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f6522i = 9205357640488583168L;

    /* renamed from: r, reason: collision with root package name */
    public final b1.i f6530r = new b1.i();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        fj.l.e(lowerCase, "toLowerCase(...)");
        lowerCase.equals("robolectric");
    }

    public b(d dVar) {
        this.f6514a = dVar;
        dVar.q(false);
        this.f6532t = 0L;
        this.f6533u = 0L;
        this.f6534v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.f6520g) {
            boolean z2 = this.f6535w;
            Outline outline2 = null;
            d dVar = this.f6514a;
            if (z2 || dVar.P() > 0.0f) {
                c2.j jVar = this.f6524l;
                if (jVar != null) {
                    RectF rectF = this.f6536x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f6536x = rectF;
                    }
                    boolean z10 = jVar instanceof c2.j;
                    if (!z10) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    jVar.f3006a.computeBounds(rectF, false);
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 > 28 || jVar.f3006a.isConvex()) {
                        outline = this.f6519f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f6519f = outline;
                        }
                        if (i10 >= 30) {
                            if (!z10) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setPath(jVar.f3006a);
                        } else {
                            if (!z10) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(jVar.f3006a);
                        }
                        this.f6526n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f6519f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f6526n = true;
                        outline = null;
                    }
                    this.f6524l = jVar;
                    if (outline != null) {
                        outline.setAlpha(dVar.e());
                        outline2 = outline;
                    }
                    dVar.r(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.f6526n && this.f6535w) {
                        dVar.q(false);
                        dVar.x();
                    } else {
                        dVar.q(this.f6535w);
                    }
                } else {
                    dVar.q(this.f6535w);
                    Outline outline4 = this.f6519f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f6519f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jS = cg.b.S(this.f6533u);
                    long j = this.f6521h;
                    long j4 = this.f6522i;
                    long j10 = j4 == 9205357640488583168L ? jS : j4;
                    int i11 = (int) (j >> 32);
                    int i12 = (int) (j & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat(i12)), Math.round(Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat((int) (4294967295L & j10)) + Float.intBitsToFloat(i12)), this.j);
                    outline5.setAlpha(dVar.e());
                    dVar.r(outline5, cg.b.K(j10));
                }
            } else {
                dVar.q(false);
                dVar.r(null, 0L);
            }
        }
        this.f6520g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r15 = this;
            boolean r0 = r15.f6531s
            if (r0 == 0) goto L75
            int r0 = r15.f6529q
            if (r0 != 0) goto L75
            b1.i r0 = r15.f6530r
            java.lang.Object r1 = r0.f1488b
            f2.b r1 = (f2.b) r1
            if (r1 == 0) goto L1c
            int r2 = r1.f6529q
            int r2 = r2 + (-1)
            r1.f6529q = r2
            r1.b()
            r1 = 0
            r0.f1488b = r1
        L1c:
            java.lang.Object r0 = r0.f1490d
            q.h0 r0 = (q.h0) r0
            if (r0 == 0) goto L70
            java.lang.Object[] r1 = r0.f13082b
            long[] r2 = r0.f13081a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L6d
            r4 = 0
            r5 = r4
        L2d:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L68
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L47:
            if (r10 >= r8) goto L66
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L62
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            f2.b r11 = (f2.b) r11
            int r12 = r11.f6529q
            int r12 = r12 + (-1)
            r11.f6529q = r12
            r11.b()
        L62:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L47
        L66:
            if (r8 != r9) goto L6d
        L68:
            if (r5 == r3) goto L6d
            int r5 = r5 + 1
            goto L2d
        L6d:
            r0.b()
        L70:
            f2.d r0 = r15.f6514a
            r0.x()
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.b.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(e2.d r15) {
        /*
            r14 = this;
            b1.i r0 = r14.f6530r
            java.lang.Object r1 = r0.f1488b
            f2.b r1 = (f2.b) r1
            r0.f1489c = r1
            java.lang.Object r1 = r0.f1490d
            q.h0 r1 = (q.h0) r1
            if (r1 == 0) goto L29
            boolean r2 = r1.h()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.f1491e
            q.h0 r2 = (q.h0) r2
            if (r2 != 0) goto L23
            q.h0 r2 = q.o0.f13110a
            q.h0 r2 = new q.h0
            r2.<init>()
            r0.f1491e = r2
        L23:
            r2.k(r1)
            r1.b()
        L29:
            r1 = 1
            r0.f1487a = r1
            ej.c r1 = r14.f6517d
            r1.invoke(r15)
            r15 = 0
            r0.f1487a = r15
            java.lang.Object r1 = r0.f1489c
            f2.b r1 = (f2.b) r1
            if (r1 == 0) goto L43
            int r2 = r1.f6529q
            int r2 = r2 + (-1)
            r1.f6529q = r2
            r1.b()
        L43:
            java.lang.Object r0 = r0.f1491e
            q.h0 r0 = (q.h0) r0
            if (r0 == 0) goto L9c
            boolean r1 = r0.h()
            if (r1 == 0) goto L9c
            java.lang.Object[] r1 = r0.f13082b
            long[] r2 = r0.f13081a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L99
            r4 = r15
        L59:
            r5 = r2[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L94
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r15
        L73:
            if (r9 >= r7) goto L92
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L8e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            f2.b r10 = (f2.b) r10
            int r11 = r10.f6529q
            int r11 = r11 + (-1)
            r10.f6529q = r11
            r10.b()
        L8e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L73
        L92:
            if (r7 != r8) goto L99
        L94:
            if (r4 == r3) goto L99
            int r4 = r4 + 1
            goto L59
        L99:
            r0.b()
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.b.c(e2.d):void");
    }

    public final e0 d() {
        e0 m0Var;
        e0 e0Var = this.f6523k;
        c2.j jVar = this.f6524l;
        if (e0Var != null) {
            return e0Var;
        }
        if (jVar != null) {
            l0 l0Var = new l0(jVar);
            this.f6523k = l0Var;
            return l0Var;
        }
        long jS = cg.b.S(this.f6533u);
        long j = this.f6521h;
        long j4 = this.f6522i;
        if (j4 != 9205357640488583168L) {
            jS = j4;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jS >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jS & 4294967295L)) + fIntBitsToFloat2;
        if (this.j > 0.0f) {
            m0Var = new n0(wd.a.h(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            m0Var = new m0(new b2.c(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f6523k = m0Var;
        return m0Var;
    }

    public final void e(s3.c cVar, m mVar, long j, ej.c cVar2) {
        boolean zB = s3.l.b(this.f6533u, j);
        d dVar = this.f6514a;
        if (!zB) {
            this.f6533u = j;
            long j4 = this.f6532t;
            dVar.y((int) (j4 >> 32), j, (int) (j4 & 4294967295L));
            if (this.f6522i == 9205357640488583168L) {
                this.f6520g = true;
                a();
            }
        }
        this.f6515b = cVar;
        this.f6516c = mVar;
        this.f6517d = cVar2;
        dVar.J(cVar, mVar, this, this.f6518e);
    }

    public final void f(float f10) {
        d dVar = this.f6514a;
        if (dVar.e() == f10) {
            return;
        }
        dVar.m(f10);
    }

    public final void g(boolean z2) {
        if (this.f6535w != z2) {
            this.f6535w = z2;
            this.f6520g = true;
            a();
        }
    }

    public final void h(r0 r0Var) {
        d dVar = this.f6514a;
        if (fj.l.b(dVar.l(), r0Var)) {
            return;
        }
        dVar.k(r0Var);
    }

    public final void i(long j, long j4, float f10) {
        if (b2.b.c(this.f6521h, j) && b2.e.a(this.f6522i, j4) && this.j == f10 && this.f6524l == null) {
            return;
        }
        this.f6523k = null;
        this.f6524l = null;
        this.f6520g = true;
        this.f6526n = false;
        this.f6521h = j;
        this.f6522i = j4;
        this.j = f10;
        a();
    }
}
