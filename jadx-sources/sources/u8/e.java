package u8;

import i8.j;
import r8.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final j f16866a;

    /* renamed from: b, reason: collision with root package name */
    public final r8.j f16867b;

    public e(j jVar, r8.j jVar2) {
        this.f16866a = jVar;
        this.f16867b = jVar2;
    }

    @Override // u8.g
    public final void a() {
        r8.j jVar = this.f16867b;
        boolean z2 = jVar instanceof p;
        j jVar2 = this.f16866a;
        if (z2) {
            h8.j jVar3 = ((p) jVar).f13910a;
            jVar2.getClass();
        } else {
            if (!(jVar instanceof r8.c)) {
                throw new b3.e();
            }
            h8.j jVar4 = ((r8.c) jVar).f13828a;
            jVar2.getClass();
        }
    }
}
