package u8;

import h8.n;
import i8.j;
import r8.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final j f16863a;

    /* renamed from: b, reason: collision with root package name */
    public final r8.j f16864b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16865c;

    public c(j jVar, r8.j jVar2, int i10) {
        this.f16863a = jVar;
        this.f16864b = jVar2;
        this.f16865c = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // u8.g
    public final void a() {
        this.f16863a.getClass();
        r8.j jVar = this.f16864b;
        if (jVar.a() != null) {
            throw new UnsupportedOperationException();
        }
        boolean z2 = jVar instanceof p;
        a aVar = new a(jVar.b().f13882p, this.f16865c, (z2 && ((p) jVar).f13916g) ? false : true);
        if (z2) {
            n.c(aVar);
        } else {
            if (!(jVar instanceof r8.c)) {
                throw new b3.e();
            }
            n.c(aVar);
        }
    }
}
