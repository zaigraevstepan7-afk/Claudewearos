package a4;

import b4.n;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class i extends d {

    /* renamed from: p0, reason: collision with root package name */
    public d[] f176p0 = new d[4];

    /* renamed from: q0, reason: collision with root package name */
    public int f177q0 = 0;

    public final void M(int i10, n nVar, ArrayList arrayList) {
        for (int i11 = 0; i11 < this.f177q0; i11++) {
            d dVar = this.f176p0[i11];
            ArrayList arrayList2 = nVar.f1560a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i12 = 0; i12 < this.f177q0; i12++) {
            b4.h.b(this.f176p0[i12], i10, arrayList, nVar);
        }
    }

    public void N() {
    }
}
