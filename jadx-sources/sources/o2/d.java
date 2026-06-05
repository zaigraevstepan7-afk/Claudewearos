package o2;

import a2.f0;
import fj.m;
import qj.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public i f12377a;

    /* renamed from: b, reason: collision with root package name */
    public i f12378b;

    /* renamed from: c, reason: collision with root package name */
    public m f12379c = new f0(this, 7);

    /* renamed from: d, reason: collision with root package name */
    public z f12380d;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r14 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        if (r14 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r10, long r12, vi.c r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof o2.b
            if (r0 == 0) goto L14
            r0 = r14
            o2.b r0 = (o2.b) r0
            int r1 = r0.f12373c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f12373c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            o2.b r0 = new o2.b
            r0.<init>(r9, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f12371a
            ui.a r0 = ui.a.f17085a
            int r1 = r6.f12373c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            uk.c.R(r14)
            goto L76
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            uk.c.R(r14)
            goto L59
        L38:
            uk.c.R(r14)
            o2.i r14 = r9.f12377a
            r1 = 0
            if (r14 == 0) goto L45
            o2.i r14 = r14.r1()
            goto L46
        L45:
            r14 = r1
        L46:
            r4 = 0
            if (r14 != 0) goto L5e
            o2.i r1 = r9.f12378b
            if (r1 == 0) goto L7c
            r6.f12373c = r3
            r2 = r10
            r4 = r12
            java.lang.Object r14 = r1.Z0(r2, r4, r6)
            if (r14 != r0) goto L59
            goto L75
        L59:
            s3.q r14 = (s3.q) r14
            long r4 = r14.f14760a
            goto L7c
        L5e:
            r7 = r12
            r12 = r2
            r2 = r10
            r10 = r4
            r4 = r7
            o2.i r13 = r9.f12377a
            if (r13 == 0) goto L6b
            o2.i r1 = r13.r1()
        L6b:
            if (r1 == 0) goto L7b
            r6.f12373c = r12
            java.lang.Object r14 = r1.Z0(r2, r4, r6)
            if (r14 != r0) goto L76
        L75:
            return r0
        L76:
            s3.q r14 = (s3.q) r14
            long r4 = r14.f14760a
            goto L7c
        L7b:
            r4 = r10
        L7c:
            s3.q r10 = new s3.q
            r10.<init>(r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.d.a(long, long, vi.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r5, vi.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof o2.c
            if (r0 == 0) goto L13
            r0 = r7
            o2.c r0 = (o2.c) r0
            int r1 = r0.f12376c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12376c = r1
            goto L18
        L13:
            o2.c r0 = new o2.c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f12374a
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f12376c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            uk.c.R(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            uk.c.R(r7)
            o2.i r7 = r4.f12377a
            if (r7 == 0) goto L3b
            o2.i r7 = r7.r1()
            goto L3c
        L3b:
            r7 = 0
        L3c:
            if (r7 == 0) goto L4c
            r0.f12376c = r3
            java.lang.Object r7 = r7.v0(r5, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            s3.q r7 = (s3.q) r7
            long r5 = r7.f14760a
            goto L4e
        L4c:
            r5 = 0
        L4e:
            s3.q r7 = new s3.q
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.d.b(long, vi.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ej.a, fj.m] */
    public final z c() {
        z zVar = (z) this.f12379c.a();
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
