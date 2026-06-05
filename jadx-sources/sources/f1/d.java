package f1;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6277a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6278b;

    public /* synthetic */ d() {
        this.f6277a = 4;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f6277a) {
            case 0:
                ((g) this.f6278b).cancel();
                break;
            case 1:
                float[] fArr = ((c2.k0) obj).f3015a;
                t2.w wVar = (t2.w) this.f6278b;
                if (wVar.E()) {
                    t2.z.h(wVar).p0(wVar, fArr);
                }
                break;
            case 2:
                e2.d dVar = (e2.d) obj;
                fj.l.f(dVar, "$this$record");
                e2.d.A0(dVar, new c2.g((Bitmap) this.f6278b), null, 62);
                break;
            case 3:
                e2.d dVar2 = (e2.d) obj;
                fj.l.f(dVar2, "$this$record");
                u6.v.C(dVar2, (f2.b) this.f6278b);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                p2.d0 d0Var = (p2.d0) this.f6278b;
                if (d0Var != null) {
                    d0Var.f12690d = zBooleanValue;
                }
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ d(Object obj, int i10) {
        this.f6277a = i10;
        this.f6278b = obj;
    }
}
