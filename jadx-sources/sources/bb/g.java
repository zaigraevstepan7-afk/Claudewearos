package bb;

import fj.s;
import qj.b0;
import qj.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f1676b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f1677c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f1678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t.c f1679e;

    public /* synthetic */ g(float f10, s sVar, z zVar, t.c cVar, int i10) {
        this.f1675a = i10;
        this.f1676b = f10;
        this.f1677c = sVar;
        this.f1678d = zVar;
        this.f1679e = cVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        t.c cVar = (t.c) obj;
        switch (this.f1675a) {
            case 0:
                fj.l.f(cVar, "$this$animateDecay");
                if (Math.signum(((Number) cVar.e()).floatValue()) != this.f1676b) {
                    this.f1677c.f6804a -= ((Number) cVar.f15107a.f15250b.invoke(cVar.f15109c.f15212c)).floatValue();
                    b0.w(this.f1678d, null, new ab.o(this.f1679e, null, 2), 3);
                }
                break;
            case 1:
                fj.l.f(cVar, "$this$animateDecay");
                if (Math.signum(((Number) cVar.e()).floatValue()) != this.f1676b) {
                    this.f1677c.f6804a -= ((Number) cVar.f15107a.f15250b.invoke(cVar.f15109c.f15212c)).floatValue();
                    b0.w(this.f1678d, null, new ab.o(this.f1679e, null, 3), 3);
                }
                break;
            default:
                fj.l.f(cVar, "$this$animateDecay");
                if (Math.signum(((Number) cVar.e()).floatValue()) != this.f1676b) {
                    this.f1677c.f6804a -= ((Number) cVar.f15107a.f15250b.invoke(cVar.f15109c.f15212c)).floatValue();
                    b0.w(this.f1678d, null, new ab.o(this.f1679e, null, 7), 3);
                }
                break;
        }
        return pi.o.f13011a;
    }
}
