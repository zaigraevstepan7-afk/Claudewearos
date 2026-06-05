package p1;

import f1.c2;
import f1.d2;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final Set f12643a;

    /* renamed from: b, reason: collision with root package name */
    public final g1.e f12644b = new g1.e(new d2[16]);

    public g(Set set) {
        this.f12643a = set;
    }

    @Override // f1.c2
    public final void d() {
        g1.e eVar = this.f12644b;
        Object[] objArr = eVar.f7024a;
        int i10 = eVar.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            c2 c2VarA = ((d2) objArr[i11]).a();
            this.f12643a.remove(c2VarA);
            c2VarA.d();
        }
    }

    @Override // f1.c2
    public final void a() {
    }

    @Override // f1.c2
    public final void c() {
    }
}
