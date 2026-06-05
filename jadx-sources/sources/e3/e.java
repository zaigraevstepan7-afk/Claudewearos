package e3;

import q.l;
import q.v;
import s3.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final v f5776a;

    /* renamed from: b, reason: collision with root package name */
    public d f5777b;

    /* renamed from: c, reason: collision with root package name */
    public long f5778c;

    /* renamed from: d, reason: collision with root package name */
    public long f5779d;

    /* renamed from: e, reason: collision with root package name */
    public long f5780e;

    /* renamed from: f, reason: collision with root package name */
    public long f5781f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f5782g;

    public e() {
        v vVar = l.f13102a;
        this.f5776a = new v();
        this.f5778c = -1L;
        this.f5779d = 0L;
        this.f5780e = 0L;
    }

    public final void a(d dVar, long j, long j4, float[] fArr, long j10) {
        long j11 = dVar.f5774g;
        if (j10 - j11 > 0 || j11 == Long.MIN_VALUE) {
            dVar.f5774g = j10;
            dVar.a(dVar.f5772e, dVar.f5773f, j, j4, fArr);
        }
    }

    public final boolean b(long j, long j4, float[] fArr, int i10, int i11) {
        boolean z2;
        if (j.a(j4, this.f5779d)) {
            z2 = false;
        } else {
            this.f5779d = j4;
            z2 = true;
        }
        if (!j.a(j, this.f5780e)) {
            this.f5780e = j;
            z2 = true;
        }
        if (fArr != null) {
            this.f5782g = fArr;
            z2 = true;
        }
        long j10 = (i10 << 32) | (i11 & 4294967295L);
        if (j10 == this.f5781f) {
            return z2;
        }
        this.f5781f = j10;
        return true;
    }
}
