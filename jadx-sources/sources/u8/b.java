package u8;

import i8.j;
import k8.h;
import r8.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: b, reason: collision with root package name */
    public final int f16862b;

    public b(int i10) {
        this.f16862b = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // u8.f
    public final g a(j jVar, r8.j jVar2) {
        return !(jVar2 instanceof p) ? new e(jVar, jVar2) : ((p) jVar2).f13912c == h.f9472a ? new e(jVar, jVar2) : new c(jVar, jVar2, this.f16862b);
    }
}
