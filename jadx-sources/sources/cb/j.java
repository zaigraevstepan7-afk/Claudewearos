package cb;

import f1.i0;
import f1.s;
import lb.r;
import pi.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3183c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej.c f3184d;

    public /* synthetic */ j(String str, boolean z2, ej.c cVar, int i10, int i11) {
        this.f3181a = i11;
        this.f3182b = str;
        this.f3183c = z2;
        this.f3184d = cVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f3181a;
        i0 i0Var = (i0) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                a.d(this.f3182b, this.f3183c, this.f3184d, i0Var, s.O(7));
                break;
            default:
                r.e(this.f3182b, this.f3183c, this.f3184d, i0Var, s.O(391));
                break;
        }
        return o.f13011a;
    }
}
