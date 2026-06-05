package w2;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i0 implements qj.z {

    /* renamed from: a, reason: collision with root package name */
    public final View f18295a;

    /* renamed from: b, reason: collision with root package name */
    public final l3.u f18296b;

    /* renamed from: c, reason: collision with root package name */
    public final qj.z f18297c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f18298d = new AtomicReference(null);

    public i0(View view, l3.u uVar, qj.z zVar) {
        this.f18295a = view;
        this.f18296b = uVar;
        this.f18297c = zVar;
    }

    @Override // qj.z
    public final ti.h Q() {
        return this.f18297c.Q();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(t0.q r6, vi.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof w2.h0
            if (r0 == 0) goto L13
            r0 = r7
            w2.h0 r0 = (w2.h0) r0
            int r1 = r0.f18290c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18290c = r1
            goto L18
        L13:
            w2.h0 r0 = new w2.h0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f18288a
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f18290c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            uk.c.R(r7)
            goto L51
        L2f:
            uk.c.R(r7)
            c2.p r7 = new c2.p
            r2 = 8
            r7.<init>(r2, r6, r5)
            t0.f r6 = new t0.f
            r2 = 9
            r4 = 0
            r6.<init>(r5, r4, r2)
            r0.f18290c = r3
            ab.q r2 = new ab.q
            java.util.concurrent.atomic.AtomicReference r3 = r5.f18298d
            r2.<init>(r7, r3, r6, r4)
            java.lang.Object r6 = qj.b0.h(r2, r0)
            if (r6 != r1) goto L51
            return
        L51:
            b3.e r6 = new b3.e
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.i0.a(t0.q, vi.c):void");
    }
}
