package w2;

import android.view.ViewGroup;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class w2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f18450a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final w2.u2 a(w2.a r7, w2.d1 r8, p1.e r9) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = w2.k1.f18309a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L43
            r0 = 6
            sj.c r0 = u6.v.a(r2, r0, r3)
            pi.m r4 = w2.l0.F
            java.lang.Object r4 = r4.getValue()
            ti.h r4 = (ti.h) r4
            vj.d r4 = qj.b0.b(r4)
            ab.s r5 = new ab.s
            r6 = 28
            r5.<init>(r0, r3, r6)
            r6 = 3
            qj.b0.w(r4, r3, r5, r6)
            c2.x0 r4 = new c2.x0
            r5 = 24
            r4.<init>(r0, r5)
            java.lang.Object r0 = t1.m.f15471c
            monitor-enter(r0)
            java.lang.Object r5 = t1.m.f15477i     // Catch: java.lang.Throwable -> L40
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L40
            java.util.ArrayList r4 = qi.l.J0(r5, r4)     // Catch: java.lang.Throwable -> L40
            t1.m.f15477i = r4     // Catch: java.lang.Throwable -> L40
            monitor-exit(r0)
            t1.m.a()
            goto L43
        L40:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L43:
            int r0 = r7.getChildCount()
            if (r0 <= 0) goto L5d
            android.view.View r0 = r7.getChildAt(r1)
            boolean r1 = r0 instanceof w2.t
            if (r1 == 0) goto L54
            w2.t r0 = (w2.t) r0
            goto L55
        L54:
            r0 = r3
        L55:
            if (r0 == 0) goto L5b
            r0.setComposeViewContext(r8)
            goto L61
        L5b:
            r0 = r3
            goto L61
        L5d:
            r7.removeAllViews()
            goto L5b
        L61:
            if (r0 != 0) goto L75
            w2.t r0 = new w2.t
            android.content.Context r1 = r7.getContext()
            r0.<init>(r1, r8)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r4 = w2.w2.f18450a
            r7.addView(r1, r4)
        L75:
            r0.setComposeViewContext(r8)
            w2.d1 r7 = r7.getComposeViewContext$ui()
            if (r7 == 0) goto L84
            r8.c()
            r0.setComposeViewContextIncrementedDuringInit$ui(r2)
        L84:
            r7 = 2131362362(0x7f0a023a, float:1.8344502E38)
            java.lang.Object r1 = r0.getTag(r7)
            boolean r2 = r1 instanceof w2.u2
            if (r2 == 0) goto L92
            r3 = r1
            w2.u2 r3 = (w2.u2) r3
        L92:
            if (r3 != 0) goto Lac
            w2.u2 r3 = new w2.u2
            v2.f2 r1 = new v2.f2
            v2.f0 r2 = r0.getRoot()
            r1.<init>(r2)
            f1.p r2 = r8.f18227b
            f1.r r4 = new f1.r
            r4.<init>(r2, r1)
            r3.<init>(r0, r4)
            r0.setTag(r7, r3)
        Lac:
            r3.c(r9)
            f1.p r7 = r8.f18227b
            w2.v2 r8 = new w2.v2
            r8.<init>(r7)
            r0.setFrameEndScheduler$ui(r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.w2.a(w2.a, w2.d1, p1.e):w2.u2");
    }
}
