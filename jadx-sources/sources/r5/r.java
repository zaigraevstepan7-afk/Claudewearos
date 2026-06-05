package r5;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public int f13749a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final u f13750b;

    /* renamed from: c, reason: collision with root package name */
    public u f13751c;

    /* renamed from: d, reason: collision with root package name */
    public u f13752d;

    /* renamed from: e, reason: collision with root package name */
    public int f13753e;

    /* renamed from: f, reason: collision with root package name */
    public int f13754f;

    public r(u uVar) {
        this.f13750b = uVar;
        this.f13751c = uVar;
    }

    public final void a() {
        this.f13749a = 1;
        this.f13751c = this.f13750b;
        this.f13754f = 0;
    }

    public final boolean b() {
        s5.a aVarB = this.f13751c.f13764b.b();
        int iA = aVarB.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarB.f14538d).get(iA + aVarB.f14535a) == 0) || this.f13753e == 65039;
    }
}
