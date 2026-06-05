package a4;

import b4.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public int f93b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f94c;

    /* renamed from: d, reason: collision with root package name */
    public final d f95d;

    /* renamed from: e, reason: collision with root package name */
    public final int f96e;

    /* renamed from: f, reason: collision with root package name */
    public c f97f;

    /* renamed from: i, reason: collision with root package name */
    public y3.f f100i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f92a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f98g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f99h = Integer.MIN_VALUE;

    public c(d dVar, int i10) {
        this.f95d = dVar;
        this.f96e = i10;
    }

    public final void a(c cVar, int i10) {
        b(cVar, i10, Integer.MIN_VALUE, false);
    }

    public final boolean b(c cVar, int i10, int i11, boolean z2) {
        if (cVar == null) {
            j();
            return true;
        }
        if (!z2 && !i(cVar)) {
            return false;
        }
        this.f97f = cVar;
        if (cVar.f92a == null) {
            cVar.f92a = new HashSet();
        }
        HashSet hashSet = this.f97f.f92a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f98g = i10;
        this.f99h = i11;
        return true;
    }

    public final void c(int i10, n nVar, ArrayList arrayList) {
        HashSet hashSet = this.f92a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                b4.h.b(((c) it.next()).f95d, i10, arrayList, nVar);
            }
        }
    }

    public final int d() {
        if (this.f94c) {
            return this.f93b;
        }
        return 0;
    }

    public final int e() {
        c cVar;
        if (this.f95d.f112f0 == 8) {
            return 0;
        }
        int i10 = this.f99h;
        return (i10 == Integer.MIN_VALUE || (cVar = this.f97f) == null || cVar.f95d.f112f0 != 8) ? this.f98g : i10;
    }

    public final c f() {
        int i10 = this.f96e;
        int iB = y3.e.b(i10);
        d dVar = this.f95d;
        switch (iB) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return dVar.J;
            case 2:
                return dVar.K;
            case 3:
                return dVar.H;
            case 4:
                return dVar.I;
            default:
                throw new AssertionError(m6.a.A(i10));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f92a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f97f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(a4.c r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L5
            goto L65
        L5:
            a4.d r1 = r11.f95d
            int r11 = r11.f96e
            r2 = 6
            int r3 = r10.f96e
            r4 = 1
            if (r11 != r3) goto L1c
            if (r3 != r2) goto L63
            boolean r11 = r1.D
            if (r11 == 0) goto L65
            a4.d r11 = r10.f95d
            boolean r11 = r11.D
            if (r11 != 0) goto L63
            goto L65
        L1c:
            int r5 = y3.e.b(r3)
            r6 = 8
            r7 = 9
            r8 = 4
            r9 = 2
            switch(r5) {
                case 0: goto L65;
                case 1: goto L53;
                case 2: goto L3f;
                case 3: goto L53;
                case 4: goto L3f;
                case 5: goto L3a;
                case 6: goto L33;
                case 7: goto L65;
                case 8: goto L65;
                default: goto L29;
            }
        L29:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.String r0 = m6.a.A(r3)
            r11.<init>(r0)
            throw r11
        L33:
            if (r11 == r2) goto L65
            if (r11 == r6) goto L65
            if (r11 == r7) goto L65
            goto L63
        L3a:
            if (r11 == r9) goto L65
            if (r11 != r8) goto L63
            goto L65
        L3f:
            r2 = 3
            if (r11 == r2) goto L48
            r2 = 5
            if (r11 != r2) goto L46
            goto L48
        L46:
            r2 = r0
            goto L49
        L48:
            r2 = r4
        L49:
            boolean r1 = r1 instanceof a4.h
            if (r1 == 0) goto L52
            if (r2 != 0) goto L63
            if (r11 != r7) goto L65
            goto L63
        L52:
            return r2
        L53:
            if (r11 == r9) goto L5a
            if (r11 != r8) goto L58
            goto L5a
        L58:
            r2 = r0
            goto L5b
        L5a:
            r2 = r4
        L5b:
            boolean r1 = r1 instanceof a4.h
            if (r1 == 0) goto L64
            if (r2 != 0) goto L63
            if (r11 != r6) goto L65
        L63:
            return r4
        L64:
            return r2
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.c.i(a4.c):boolean");
    }

    public final void j() {
        HashSet hashSet;
        c cVar = this.f97f;
        if (cVar != null && (hashSet = cVar.f92a) != null) {
            hashSet.remove(this);
            if (this.f97f.f92a.size() == 0) {
                this.f97f.f92a = null;
            }
        }
        this.f92a = null;
        this.f97f = null;
        this.f98g = 0;
        this.f99h = Integer.MIN_VALUE;
        this.f94c = false;
        this.f93b = 0;
    }

    public final void k() {
        y3.f fVar = this.f100i;
        if (fVar == null) {
            this.f100i = new y3.f(1);
        } else {
            fVar.e();
        }
    }

    public final void l(int i10) {
        this.f93b = i10;
        this.f94c = true;
    }

    public final String toString() {
        return this.f95d.f114g0 + ":" + m6.a.A(this.f96e);
    }
}
