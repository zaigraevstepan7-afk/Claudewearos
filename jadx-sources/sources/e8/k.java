package e8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends i {
    public final boolean h(Object obj) {
        if (obj == null) {
            obj = i.f5826z;
        }
        if (!i.f5825f.n(this, null, obj)) {
            return false;
        }
        i.b(this);
        return true;
    }

    public final boolean i(Throwable th2) {
        if (!i.f5825f.n(this, null, new c(th2))) {
            return false;
        }
        i.b(this);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(mf.a r6) {
        /*
            r5 = this;
            r6.getClass()
            java.lang.Object r0 = r5.f5827a
            r1 = 0
            if (r0 != 0) goto L44
            boolean r0 = r6.isDone()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L20
            java.lang.Object r6 = e8.i.e(r6)
            wd.a r0 = e8.i.f5825f
            boolean r6 = r0.n(r5, r3, r6)
            if (r6 == 0) goto L4f
            e8.i.b(r5)
            return r2
        L20:
            e8.f r0 = new e8.f
            r0.<init>(r5, r6)
            wd.a r4 = e8.i.f5825f
            boolean r3 = r4.n(r5, r3, r0)
            if (r3 == 0) goto L42
            e8.j r1 = e8.j.f5830a     // Catch: java.lang.Throwable -> L33
            r6.addListener(r0, r1)     // Catch: java.lang.Throwable -> L33
            return r2
        L33:
            r6 = move-exception
            e8.c r1 = new e8.c     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            e8.c r1 = e8.c.f5807b
        L3c:
            wd.a r6 = e8.i.f5825f
            r6.n(r5, r0, r1)
            return r2
        L42:
            java.lang.Object r0 = r5.f5827a
        L44:
            boolean r2 = r0 instanceof e8.a
            if (r2 == 0) goto L4f
            e8.a r0 = (e8.a) r0
            boolean r0 = r0.f5804a
            r6.cancel(r0)
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.k.j(mf.a):boolean");
    }
}
