package g6;

import androidx.lifecycle.x0;
import q.q0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class d extends x0 {

    /* renamed from: d, reason: collision with root package name */
    public static final c f7220d = new c(0);

    /* renamed from: b, reason: collision with root package name */
    public final q0 f7221b = new q0(0);

    /* renamed from: c, reason: collision with root package name */
    public boolean f7222c = false;

    @Override // androidx.lifecycle.x0
    public final void d() {
        q0 q0Var = this.f7221b;
        int i10 = q0Var.f13123c;
        for (int i11 = 0; i11 < i10; i11++) {
            a aVar = (a) q0Var.e(i11);
            ld.d dVar = aVar.f7213l;
            dVar.a();
            dVar.f10910c = true;
            b bVar = aVar.f7215n;
            if (bVar != null) {
                aVar.h(bVar);
            }
            a aVar2 = dVar.f10908a;
            if (aVar2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (aVar2 != aVar) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            dVar.f10908a = null;
            if (bVar != null) {
                boolean z2 = bVar.f7217b;
            }
            dVar.f10911d = true;
            dVar.f10909b = false;
            dVar.f10910c = false;
            dVar.f10912e = false;
        }
        int i12 = q0Var.f13123c;
        Object[] objArr = q0Var.f13122b;
        for (int i13 = 0; i13 < i12; i13++) {
            objArr[i13] = null;
        }
        q0Var.f13123c = 0;
    }
}
