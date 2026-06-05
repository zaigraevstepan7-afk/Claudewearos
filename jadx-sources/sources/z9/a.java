package z9;

import ej.c;
import fi.e;
import fj.l;
import fj.w;
import pi.o;
import uk.d;
import yd.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20466a;

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f20466a) {
            case 0:
                wk.a aVar = (wk.a) obj;
                l.f(aVar, "$this$module");
                ua.a aVar2 = new ua.a(12);
                sk.b bVar = sk.b.f15087a;
                aVar.a(new d(new sk.a(al.a.f764e, w.a(x9.b.class), null, aVar2, bVar)));
                break;
            default:
                e eVar = (e) obj;
                l.f(eVar, "$this$drawBackdrop");
                hi.a.a(eVar);
                f.l(eVar, eVar.f6754a * 4.0f);
                float f10 = eVar.f6754a;
                a.a.J(eVar, 16.0f * f10, f10 * 32.0f, false, (12 & 8) == 0);
                break;
        }
        return o.f13011a;
    }
}
