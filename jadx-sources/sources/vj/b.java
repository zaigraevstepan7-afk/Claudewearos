package vj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import qj.i0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final d7.c f18083a = new d7.c("CLOSED");

    /* renamed from: b, reason: collision with root package name */
    public static final d7.c f18084b = new d7.c("UNDEFINED");

    /* renamed from: c, reason: collision with root package name */
    public static final d7.c f18085c = new d7.c("REUSABLE_CLAIMED");

    /* renamed from: d, reason: collision with root package name */
    public static final d7.c f18086d = new d7.c("NO_THREAD_ELEMENTS");

    /* renamed from: e, reason: collision with root package name */
    public static final ua.a f18087e = new ua.a(6);

    /* renamed from: f, reason: collision with root package name */
    public static final ua.a f18088f = new ua.a(7);

    /* renamed from: g, reason: collision with root package name */
    public static final ua.a f18089g = new ua.a(8);

    public static final void a(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(m6.a.d(i10, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(r rVar, long j, ej.e eVar) {
        while (true) {
            if (rVar.f18121c >= j && !rVar.d()) {
                return rVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f18090a;
            Object obj = atomicReferenceFieldUpdater.get(rVar);
            d7.c cVar = f18083a;
            if (obj == cVar) {
                return cVar;
            }
            r rVar2 = (r) ((c) obj);
            if (rVar2 == null) {
                rVar2 = (r) eVar.invoke(Long.valueOf(rVar.f18121c + 1), rVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(rVar, null, rVar2)) {
                    if (atomicReferenceFieldUpdater.get(rVar) != null) {
                        break;
                    }
                }
                if (rVar.d()) {
                    rVar.e();
                }
            }
            rVar = rVar2;
        }
    }

    public static final r c(Object obj) {
        if (obj != f18083a) {
            return (r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(Throwable th2, ti.h hVar) {
        Throwable runtimeException;
        Iterator it = e.f18093a.iterator();
        while (it.hasNext()) {
            try {
                ((qj.x) it.next()).l(th2, hVar);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    mk.b.i(runtimeException, th2);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            mk.b.i(th2, new f(hVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
    }

    public static final boolean e(Object obj) {
        return obj == f18083a;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(ti.h hVar, Object obj) {
        if (obj == f18086d) {
            return;
        }
        if (!(obj instanceof x)) {
            Object objF = hVar.F(f18088f, null);
            fj.l.d(objF, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((u) objF).a(obj);
            return;
        }
        x xVar = (x) obj;
        u[] uVarArr = xVar.f18132c;
        int length = uVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            u uVar = uVarArr[length];
            fj.l.c(uVar);
            uVar.a(xVar.f18131b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(java.lang.Object r9, ti.c r10) throws qj.i0 {
        /*
            boolean r0 = r10 instanceof vj.g
            if (r0 == 0) goto Lae
            vj.g r10 = (vj.g) r10
            qj.v r0 = r10.f18095d
            vi.c r1 = r10.f18096e
            java.lang.Throwable r2 = pi.k.a(r9)
            if (r2 != 0) goto L12
            r3 = r9
            goto L18
        L12:
            qj.t r3 = new qj.t
            r4 = 0
            r3.<init>(r4, r2)
        L18:
            ti.h r2 = r1.getContext()
            boolean r2 = j(r0, r2)
            r4 = 1
            if (r2 == 0) goto L2f
            r10.f18097f = r3
            r10.f13589c = r4
            ti.h r9 = r1.getContext()
            i(r0, r9, r10)
            return
        L2f:
            qj.w0 r0 = qj.v1.a()
            long r5 = r0.f13634c
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L46
            r10.f18097f = r3
            r10.f13589c = r4
            r0.j0(r10)
            goto La8
        L46:
            r0.l0(r4)
            ti.h r2 = r1.getContext()     // Catch: java.lang.Throwable -> L69
            qj.w r3 = qj.w.f13632b     // Catch: java.lang.Throwable -> L69
            ti.f r2 = r2.C(r3)     // Catch: java.lang.Throwable -> L69
            qj.e1 r2 = (qj.e1) r2     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L6b
            boolean r3 = r2.b()     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L6b
            java.util.concurrent.CancellationException r9 = r2.t()     // Catch: java.lang.Throwable -> L69
            pi.j r9 = uk.c.r(r9)     // Catch: java.lang.Throwable -> L69
            r10.resumeWith(r9)     // Catch: java.lang.Throwable -> L69
            goto L8d
        L69:
            r9 = move-exception
            goto La4
        L6b:
            java.lang.Object r2 = r10.f18098z     // Catch: java.lang.Throwable -> L69
            ti.h r3 = r1.getContext()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = n(r3, r2)     // Catch: java.lang.Throwable -> L69
            d7.c r5 = vj.b.f18086d     // Catch: java.lang.Throwable -> L69
            if (r2 == r5) goto L7e
            qj.c2 r5 = qj.b0.F(r1, r3, r2)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r1.resumeWith(r9)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L8a
            boolean r9 = r5.l0()     // Catch: java.lang.Throwable -> L69
            if (r9 == 0) goto L8d
        L8a:
            g(r3, r2)     // Catch: java.lang.Throwable -> L69
        L8d:
            boolean r9 = r0.n0()     // Catch: java.lang.Throwable -> L69
            if (r9 != 0) goto L8d
        L93:
            r0.i0(r4)
            goto La8
        L97:
            r9 = move-exception
            if (r5 == 0) goto La0
            boolean r1 = r5.l0()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto La3
        La0:
            g(r3, r2)     // Catch: java.lang.Throwable -> L69
        La3:
            throw r9     // Catch: java.lang.Throwable -> L69
        La4:
            r10.g(r9)     // Catch: java.lang.Throwable -> La9
            goto L93
        La8:
            return
        La9:
            r9 = move-exception
            r0.i0(r4)
            throw r9
        Lae:
            r10.resumeWith(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vj.b.h(java.lang.Object, ti.c):void");
    }

    public static final void i(qj.v vVar, ti.h hVar, Runnable runnable) throws i0 {
        try {
            vVar.e0(hVar, runnable);
        } catch (Throwable th2) {
            throw new i0(th2, vVar, hVar);
        }
    }

    public static final boolean j(qj.v vVar, ti.h hVar) throws i0 {
        try {
            return vVar.g0(hVar);
        } catch (Throwable th2) {
            throw new i0(th2, vVar, hVar);
        }
    }

    public static final long k(String str, long j, long j4, long j10) {
        String property;
        boolean z2;
        String str2;
        Long lValueOf;
        int i10 = t.f18123a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        x8.a.n(10);
        int length = property.length();
        if (length == 0) {
            str2 = property;
            lValueOf = null;
            break;
        }
        int i11 = 0;
        char cCharAt = property.charAt(0);
        long j11 = -9223372036854775807L;
        if (fj.l.h(cCharAt, 48) < 0) {
            z2 = true;
            if (length != 1) {
                if (cCharAt == '+') {
                    z2 = false;
                    i11 = 1;
                } else if (cCharAt == '-') {
                    j11 = Long.MIN_VALUE;
                    i11 = 1;
                }
            }
            str2 = property;
            lValueOf = null;
            break;
        }
        z2 = false;
        long j12 = 0;
        long j13 = -256204778801521550L;
        while (i11 < length) {
            int iDigit = Character.digit((int) property.charAt(i11), 10);
            if (iDigit >= 0) {
                if (j12 >= j13) {
                    str2 = property;
                } else if (j13 == -256204778801521550L) {
                    str2 = property;
                    j13 = j11 / 10;
                    if (j12 < j13) {
                    }
                    lValueOf = null;
                    break;
                }
                long j14 = j12 * 10;
                long j15 = iDigit;
                if (j14 < j11 + j15) {
                    lValueOf = null;
                    break;
                }
                j12 = j14 - j15;
                i11++;
                property = str2;
            }
            str2 = property;
            lValueOf = null;
            break;
        }
        str2 = property;
        lValueOf = z2 ? Long.valueOf(j12) : Long.valueOf(-j12);
        if (lValueOf == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long jLongValue = lValueOf.longValue();
        if (j4 <= jLongValue && jLongValue <= j10) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j4 + ".." + j10 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int l(int i10, int i11, String str) {
        return (int) k(str, i10, 1, (i11 & 8) != 0 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : 2097150);
    }

    public static final Object m(ti.h hVar) {
        Object objF = hVar.F(f18087e, 0);
        fj.l.c(objF);
        return objF;
    }

    public static final Object n(ti.h hVar, Object obj) {
        if (obj == null) {
            obj = m(hVar);
        }
        if (obj == 0) {
            return f18086d;
        }
        if (!(obj instanceof Integer)) {
            return ((u) obj).c(hVar);
        }
        return hVar.F(f18089g, new x(((Number) obj).intValue(), hVar));
    }
}
