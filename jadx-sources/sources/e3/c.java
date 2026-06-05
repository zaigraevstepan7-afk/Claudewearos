package e3;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f5761a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5762b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5763c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5764d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5765e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f5766f;

    /* renamed from: g, reason: collision with root package name */
    public final f0.d f5767g;

    public c(long j, long j4, long j10, long j11, long j12, float[] fArr, f0.d dVar) {
        this.f5761a = j;
        this.f5762b = j4;
        this.f5763c = j10;
        this.f5764d = j11;
        this.f5765e = j12;
        this.f5766f = fArr;
        this.f5767g = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L5
            goto L65
        L5:
            r1 = 0
            if (r7 == 0) goto L66
            java.lang.Class<e3.c> r2 = e3.c.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L11
            goto L66
        L11:
            e3.c r7 = (e3.c) r7
            long r2 = r6.f5761a
            long r4 = r7.f5761a
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L1c
            goto L66
        L1c:
            long r2 = r6.f5762b
            long r4 = r7.f5762b
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L25
            goto L66
        L25:
            long r2 = r6.f5765e
            long r4 = r7.f5765e
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L2e
            goto L66
        L2e:
            long r2 = r6.f5763c
            long r4 = r7.f5763c
            boolean r2 = s3.j.a(r2, r4)
            if (r2 != 0) goto L39
            goto L66
        L39:
            long r2 = r6.f5764d
            long r4 = r7.f5764d
            boolean r2 = s3.j.a(r2, r4)
            if (r2 != 0) goto L44
            goto L66
        L44:
            float[] r2 = r7.f5766f
            float[] r3 = r6.f5766f
            if (r3 != 0) goto L50
            if (r2 != 0) goto L4e
            r2 = r0
            goto L57
        L4e:
            r2 = r1
            goto L57
        L50:
            if (r2 != 0) goto L53
            goto L4e
        L53:
            boolean r2 = r3.equals(r2)
        L57:
            if (r2 != 0) goto L5a
            goto L66
        L5a:
            f0.d r2 = r6.f5767g
            f0.d r7 = r7.f5767g
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L65
            goto L66
        L65:
            return r0
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iJ = gk.b.j(gk.b.j(gk.b.j(gk.b.j(Long.hashCode(this.f5761a) * 31, this.f5762b, 31), this.f5765e, 31), this.f5763c, 31), this.f5764d, 31);
        float[] fArr = this.f5766f;
        return this.f5767g.hashCode() + ((iJ + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
