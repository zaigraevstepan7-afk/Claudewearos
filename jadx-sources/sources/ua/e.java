package ua;

import java.util.Set;
import pi.o;
import qi.u;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pi.c f16905b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f16906c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16907d;

    public /* synthetic */ e(ej.c cVar, boolean z2, Set set, int i10) {
        this.f16904a = i10;
        this.f16905b = cVar;
        this.f16906c = z2;
        this.f16907d = set;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f16904a) {
            case 0:
                ej.c cVar = (ej.c) this.f16905b;
                Object obj = (Set) this.f16907d;
                if (this.f16906c) {
                    obj = u.f13522a;
                }
                cVar.invoke(obj);
                break;
            case 1:
                ej.c cVar2 = (ej.c) this.f16905b;
                Object obj2 = (Set) this.f16907d;
                if (this.f16906c) {
                    obj2 = u.f13522a;
                }
                cVar2.invoke(obj2);
                break;
            default:
                ej.a aVar = (ej.a) this.f16905b;
                ej.a aVar2 = (ej.a) this.f16907d;
                if (!this.f16906c) {
                    aVar2.a();
                } else if (aVar != null) {
                    aVar.a();
                }
                return o.f13011a;
        }
        return o.f13011a;
    }

    public /* synthetic */ e(boolean z2, ej.a aVar, ej.a aVar2) {
        this.f16904a = 2;
        this.f16906c = z2;
        this.f16905b = aVar;
        this.f16907d = aVar2;
    }
}
