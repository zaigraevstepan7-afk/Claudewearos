package gb;

import androidx.lifecycle.h0;
import qj.b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hb.h f7271b;

    public /* synthetic */ b(hb.h hVar, int i10) {
        this.f7270a = i10;
        this.f7271b = hVar;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f7270a) {
            case 0:
                return new ji.f(this.f7271b.a(), 23, 0L);
            case 1:
                float fA = this.f7271b.a();
                return new ji.a(8.0f * fA, fA, 22);
            case 2:
                return ii.a.a(ii.a.f8575e, 0.0f, 0.0f, this.f7271b.a(), 11);
            case 3:
                return Float.valueOf(u3.c.l(1.0f, 1.2f, this.f7271b.a()));
            case 4:
                return ii.a.a(ii.a.f8575e, 0.0f, 0.0f, this.f7271b.a(), 11);
            case 5:
                float fA2 = this.f7271b.a();
                ii.a aVar = ii.a.f8576f;
                return ii.a.a(aVar, aVar.f8578a / 1.5f, aVar.f8579b / 1.5f, fA2, 8);
            case 6:
                float fA3 = this.f7271b.a();
                return new ji.a(4.0f * fA3, fA3, 22);
            case 7:
                hb.h hVar = this.f7271b;
                hVar.f7801e.invoke(hVar);
                b0.w(hVar.f7797a, null, new h0(hVar, (ti.c) null, 13), 3);
                return pi.o.f13011a;
            default:
                return Float.valueOf(((Number) this.f7271b.f7807l.e()).floatValue());
        }
    }
}
