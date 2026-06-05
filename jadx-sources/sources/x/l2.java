package x;

import android.view.ViewTreeObserver;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public f2 f19613a;

    /* renamed from: b, reason: collision with root package name */
    public v.i f19614b;

    /* renamed from: c, reason: collision with root package name */
    public s0 f19615c;

    /* renamed from: d, reason: collision with root package name */
    public o1 f19616d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19617e;

    /* renamed from: f, reason: collision with root package name */
    public o2.d f19618f;

    /* renamed from: g, reason: collision with root package name */
    public final e2 f19619g;

    /* renamed from: h, reason: collision with root package name */
    public final b2 f19620h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19621i;
    public int j = 1;

    /* renamed from: k, reason: collision with root package name */
    public s1 f19622k = y1.f19762b;

    /* renamed from: l, reason: collision with root package name */
    public final j2 f19623l = new j2(this);

    /* renamed from: m, reason: collision with root package name */
    public final q0.i f19624m = new q0.i(this, 15);

    public l2(f2 f2Var, v.i iVar, s0 s0Var, o1 o1Var, boolean z2, o2.d dVar, e2 e2Var, b2 b2Var) {
        this.f19613a = f2Var;
        this.f19614b = iVar;
        this.f19615c = s0Var;
        this.f19616d = o1Var;
        this.f19617e = z2;
        this.f19618f = dVar;
        this.f19619g = e2Var;
        this.f19620h = b2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r12, vi.c r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof x.g2
            if (r0 == 0) goto L13
            r0 = r14
            x.g2 r0 = (x.g2) r0
            int r1 = r0.f19537d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19537d = r1
            goto L18
        L13:
            x.g2 r0 = new x.g2
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f19535b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f19537d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            fj.u r12 = r0.f19534a
            uk.c.R(r14)     // Catch: java.lang.Throwable -> L2b
            r6 = r11
            goto L59
        L2b:
            r0 = move-exception
            r12 = r0
            r6 = r11
            goto L69
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            uk.c.R(r14)
            fj.u r7 = new fj.u
            r7.<init>()
            r7.f6806a = r12
            r11.f19621i = r4
            v.f1 r14 = v.f1.f17189a     // Catch: java.lang.Throwable -> L66
            x.i2 r5 = new x.i2     // Catch: java.lang.Throwable -> L66
            r10 = 0
            r6 = r11
            r8 = r12
            r5.<init>(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L63
            r0.f19534a = r7     // Catch: java.lang.Throwable -> L63
            r0.f19537d = r4     // Catch: java.lang.Throwable -> L63
            java.lang.Object r12 = r11.f(r14, r5, r0)     // Catch: java.lang.Throwable -> L63
            if (r12 != r1) goto L58
            return r1
        L58:
            r12 = r7
        L59:
            r6.f19621i = r3
            long r12 = r12.f6806a
            s3.q r14 = new s3.q
            r14.<init>(r12)
            return r14
        L63:
            r0 = move-exception
        L64:
            r12 = r0
            goto L69
        L66:
            r0 = move-exception
            r6 = r11
            goto L64
        L69:
            r6.f19621i = r3
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: x.l2.a(long, vi.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r4, boolean r6, vi.i r7) {
        /*
            r3 = this;
            pi.o r0 = pi.o.f13011a
            if (r6 == 0) goto Ld
            x.s0 r6 = r3.f19615c
            ta.n r1 = x.y1.f19761a
            boolean r6 = r6 instanceof x.m
            if (r6 == 0) goto Ld
            goto L4f
        Ld:
            x.o1 r6 = r3.f19616d
            x.o1 r1 = x.o1.f19665b
            r2 = 0
            if (r6 != r1) goto L1a
            r6 = 1
        L15:
            long r4 = s3.q.a(r4, r2, r2, r6)
            goto L1c
        L1a:
            r6 = 2
            goto L15
        L1c:
            x.k2 r6 = new x.k2
            r1 = 0
            r6.<init>(r3, r1)
            v.i r1 = r3.f19614b
            if (r1 == 0) goto L3f
            x.f2 r2 = r3.f19613a
            boolean r2 = r2.d()
            if (r2 != 0) goto L36
            x.f2 r2 = r3.f19613a
            boolean r2 = r2.c()
            if (r2 == 0) goto L3f
        L36:
            java.lang.Object r4 = r1.b(r4, r6, r7)
            ui.a r5 = ui.a.f17085a
            if (r4 != r5) goto L4f
            return r4
        L3f:
            x.k2 r6 = new x.k2
            r6.<init>(r3, r7)
            r6.f19596c = r4
            java.lang.Object r4 = r6.invokeSuspend(r0)
            ui.a r5 = ui.a.f17085a
            if (r4 != r5) goto L4f
            return r4
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x.l2.b(long, boolean, vi.i):java.lang.Object");
    }

    public final long c(s1 s1Var, long j, int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        o2.i iVar = this.f19618f.f12377a;
        o2.i iVarR1 = iVar != null ? iVar.r1() : null;
        long jC0 = iVarR1 != null ? iVarR1.c0(i10, j) : 0L;
        long jE = b2.b.e(j, jC0);
        long jE2 = e(h(s1Var.a(g(e(this.f19616d == o1.f19665b ? b2.b.a(0.0f, 1, jE) : b2.b.a(0.0f, 2, jE))))));
        e2 e2Var = this.f19619g;
        if (e2Var.G) {
            ViewTreeObserver viewTreeObserver = ((w2.t) v2.n.z(e2Var)).getViewTreeObserver();
            try {
                if (w2.t.f18381l1 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    w2.t.f18381l1 = declaredMethod;
                }
                Method method = w2.t.f18381l1;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long jE3 = b2.b.e(jE, jE2);
        o2.i iVar2 = this.f19618f.f12377a;
        o2.i iVarR12 = iVar2 != null ? iVar2.r1() : null;
        return b2.b.f(b2.b.f(jC0, jE2), iVarR12 != null ? iVarR12.G0(i10, jE2, jE3) : 0L);
    }

    public final float d(float f10) {
        return this.f19617e ? f10 * (-1) : f10;
    }

    public final long e(long j) {
        return this.f19617e ? b2.b.g(j, -1.0f) : j;
    }

    public final Object f(v.f1 f1Var, ej.e eVar, vi.c cVar) {
        Object objB = this.f19613a.b(f1Var, new w6.z(this, eVar, null, 7), cVar);
        return objB == ui.a.f17085a ? objB : pi.o.f13011a;
    }

    public final float g(long j) {
        return Float.intBitsToFloat((int) (this.f19616d == o1.f19665b ? j >> 32 : j & 4294967295L));
    }

    public final long h(float f10) {
        long jFloatToRawIntBits;
        long j;
        if (f10 == 0.0f) {
            return 0L;
        }
        if (this.f19616d == o1.f19665b) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f10);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(f10);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (jFloatToRawIntBits & 4294967295L);
    }

    public final float i(long j) {
        int i10 = (int) (4294967295L & j);
        int i11 = (int) (j >> 32);
        if (((float) Math.atan2(Math.abs(Float.intBitsToFloat(i10)), Math.abs(Float.intBitsToFloat(i11)))) >= 0.7853981633974483d) {
            if (this.f19616d == o1.f19664a) {
                return Float.intBitsToFloat(i10);
            }
            return 0.0f;
        }
        if (this.f19616d == o1.f19665b) {
            return Float.intBitsToFloat(i11);
        }
        return 0.0f;
    }
}
