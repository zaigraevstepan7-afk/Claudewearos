package w6;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f18847a;

    /* renamed from: b, reason: collision with root package name */
    public final ej.a f18848b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f18849c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public int f18850d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18851e;

    /* renamed from: f, reason: collision with root package name */
    public final h[] f18852f;

    /* renamed from: g, reason: collision with root package name */
    public final yj.i f18853g;

    /* renamed from: h, reason: collision with root package name */
    public final qi.j f18854h;

    public r(int i10, ej.a aVar) {
        this.f18847a = i10;
        this.f18848b = aVar;
        this.f18852f = new h[i10];
        int i11 = yj.j.f20326a;
        this.f18853g = new yj.i(i10);
        this.f18854h = new qi.j(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(vi.c r7) {
        /*
            r6 = this;
            qi.j r0 = r6.f18854h
            boolean r1 = r7 instanceof w6.p
            if (r1 == 0) goto L15
            r1 = r7
            w6.p r1 = (w6.p) r1
            int r2 = r1.f18840c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f18840c = r2
            goto L1a
        L15:
            w6.p r1 = new w6.p
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.f18838a
            ui.a r2 = ui.a.f17085a
            int r3 = r1.f18840c
            yj.i r4 = r6.f18853g
            r5 = 1
            if (r3 == 0) goto L33
            if (r3 != r5) goto L2b
            uk.c.R(r7)
            goto L3f
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            uk.c.R(r7)
            r1.f18840c = r5
            java.lang.Object r7 = r4.a(r1)
            if (r7 != r2) goto L3f
            return r2
        L3f:
            java.util.concurrent.locks.ReentrantLock r7 = r6.f18849c     // Catch: java.lang.Throwable -> L79
            r7.lock()     // Catch: java.lang.Throwable -> L79
            boolean r1 = r6.f18851e     // Catch: java.lang.Throwable -> L7b
            if (r1 != 0) goto L7d
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L6f
            int r1 = r6.f18850d     // Catch: java.lang.Throwable -> L7b
            int r2 = r6.f18847a     // Catch: java.lang.Throwable -> L7b
            if (r1 < r2) goto L55
            goto L6f
        L55:
            w6.h r1 = new w6.h     // Catch: java.lang.Throwable -> L7b
            ej.a r2 = r6.f18848b     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r2 = r2.a()     // Catch: java.lang.Throwable -> L7b
            e7.a r2 = (e7.a) r2     // Catch: java.lang.Throwable -> L7b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7b
            w6.h[] r2 = r6.f18852f     // Catch: java.lang.Throwable -> L7b
            int r3 = r6.f18850d     // Catch: java.lang.Throwable -> L7b
            int r5 = r3 + 1
            r6.f18850d = r5     // Catch: java.lang.Throwable -> L7b
            r2[r3] = r1     // Catch: java.lang.Throwable -> L7b
            r0.addLast(r1)     // Catch: java.lang.Throwable -> L7b
        L6f:
            java.lang.Object r0 = r0.removeLast()     // Catch: java.lang.Throwable -> L7b
            w6.h r0 = (w6.h) r0     // Catch: java.lang.Throwable -> L7b
            r7.unlock()     // Catch: java.lang.Throwable -> L79
            return r0
        L79:
            r7 = move-exception
            goto L8a
        L7b:
            r0 = move-exception
            goto L86
        L7d:
            java.lang.String r0 = "Connection pool is closed"
            r1 = 21
            uk.c.S(r1, r0)     // Catch: java.lang.Throwable -> L7b
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L7b
        L86:
            r7.unlock()     // Catch: java.lang.Throwable -> L79
            throw r0     // Catch: java.lang.Throwable -> L79
        L8a:
            r4.d()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.r.a(vi.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:11|(2:48|12)|24|44|29|(1:(1:39)(2:35|(1:37)))(1:31)|38|19|46|20|(1:22)(10:23|24|44|29|(0)(0)|38|19|46|20|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        r12 = r12;
        r11 = r11;
        r2 = r0;
        r0 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:29:0x006d, B:31:0x0071, B:35:0x0079, B:39:0x0080), top: B:44:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v10, types: [ej.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005a -> B:24:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r9, q0.k r11, vi.c r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof w6.q
            if (r0 == 0) goto L13
            r0 = r12
            w6.q r0 = (w6.q) r0
            int r1 = r0.f18846f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18846f = r1
            goto L18
        L13:
            w6.q r0 = new w6.q
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.f18844d
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f18846f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            long r9 = r0.f18841a
            fj.v r11 = r0.f18843c
            ej.a r2 = r0.f18842b
            uk.c.R(r12)     // Catch: java.lang.Throwable -> L2e
            goto L5c
        L2e:
            r12 = move-exception
            goto L68
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            uk.c.R(r12)
        L3b:
            fj.v r12 = new fj.v
            r12.<init>()
            ab.s r2 = new ab.s     // Catch: java.lang.Throwable -> L66
            r5 = 29
            r2.<init>(r12, r8, r4, r5)     // Catch: java.lang.Throwable -> L66
            r0.f18842b = r11     // Catch: java.lang.Throwable -> L66
            r0.f18843c = r12     // Catch: java.lang.Throwable -> L66
            r0.f18841a = r9     // Catch: java.lang.Throwable -> L66
            r0.f18846f = r3     // Catch: java.lang.Throwable -> L66
            long r5 = qj.b0.D(r9)     // Catch: java.lang.Throwable -> L66
            java.lang.Object r2 = qj.b0.H(r5, r2, r0)     // Catch: java.lang.Throwable -> L66
            if (r2 != r1) goto L5a
            return r1
        L5a:
            r2 = r11
            r11 = r12
        L5c:
            r12 = r11
            r11 = r2
            r2 = r0
            r0 = r4
            goto L6d
        L61:
            r7 = r2
            r2 = r11
            r11 = r12
            r12 = r7
            goto L68
        L66:
            r2 = move-exception
            goto L61
        L68:
            r7 = r12
            r12 = r11
            r11 = r2
            r2 = r0
            r0 = r7
        L6d:
            boolean r5 = r0 instanceof qj.y1     // Catch: java.lang.Throwable -> L75
            if (r5 == 0) goto L77
            r11.a()     // Catch: java.lang.Throwable -> L75
            goto L7e
        L75:
            r9 = move-exception
            goto L81
        L77:
            if (r0 != 0) goto L80
            java.lang.Object r12 = r12.f6807a     // Catch: java.lang.Throwable -> L75
            if (r12 == 0) goto L7e
            return r12
        L7e:
            r0 = r2
            goto L3b
        L80:
            throw r0     // Catch: java.lang.Throwable -> L75
        L81:
            java.lang.Object r10 = r12.f6807a
            w6.h r10 = (w6.h) r10
            if (r10 == 0) goto L8a
            r8.e(r10)
        L8a:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.r.b(long, q0.k, vi.c):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f18849c;
        reentrantLock.lock();
        try {
            this.f18851e = true;
            for (h hVar : this.f18852f) {
                if (hVar != null) {
                    hVar.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder sb2) {
        qi.j jVar = this.f18854h;
        ReentrantLock reentrantLock = this.f18849c;
        reentrantLock.lock();
        try {
            ri.c cVarR = yd.f.r();
            int i10 = jVar.f13518c;
            for (int i11 = 0; i11 < i10; i11++) {
                cVarR.add(jVar.get(i11));
            }
            ri.c cVarM = yd.f.m(cVarR);
            sb2.append('\t' + toString() + " (");
            sb2.append("capacity=" + this.f18847a + ", ");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("permits=");
            yj.i iVar = this.f18853g;
            iVar.getClass();
            sb3.append(Math.max(yj.h.f20323z.get(iVar), 0));
            sb3.append(", ");
            sb2.append(sb3.toString());
            sb2.append("queue=(size=" + cVarM.b() + ")[" + qi.l.E0(cVarM, null, null, null, null, 63) + ']');
            sb2.append(")");
            sb2.append('\n');
            h[] hVarArr = this.f18852f;
            int length = hVarArr.length;
            int i12 = 0;
            for (int i13 = 0; i13 < length; i13++) {
                h hVar = hVarArr[i13];
                i12++;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("\t\t[");
                sb4.append(i12);
                sb4.append("] - ");
                sb4.append(hVar != null ? hVar.f18809a.toString() : null);
                sb2.append(sb4.toString());
                sb2.append('\n');
                if (hVar != null) {
                    hVar.g(sb2);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void e(h hVar) {
        fj.l.f(hVar, "connection");
        ReentrantLock reentrantLock = this.f18849c;
        reentrantLock.lock();
        try {
            this.f18854h.addLast(hVar);
            reentrantLock.unlock();
            this.f18853g.d();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
