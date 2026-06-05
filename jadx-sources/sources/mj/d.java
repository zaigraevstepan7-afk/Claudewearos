package mj;

import i1.l;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11817a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11818b;

    /* renamed from: c, reason: collision with root package name */
    public final pi.c f11819c;

    public /* synthetic */ d(int i10, ej.c cVar, Object obj) {
        this.f11817a = i10;
        this.f11818b = obj;
        this.f11819c = cVar;
    }

    @Override // mj.f
    public final Iterator iterator() {
        switch (this.f11817a) {
            case 0:
                return new c(this);
            case 1:
                return new e(this);
            default:
                return new l(this);
        }
    }

    public d(CharSequence charSequence, ej.e eVar) {
        this.f11817a = 2;
        fj.l.f(charSequence, "input");
        this.f11818b = charSequence;
        this.f11819c = eVar;
    }
}
