package l7;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u extends q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10076a;

    /* renamed from: b, reason: collision with root package name */
    public p f10077b;

    public /* synthetic */ u() {
        this.f10076a = 1;
    }

    @Override // l7.q, l7.m
    public void b(p pVar) {
        switch (this.f10076a) {
            case 0:
                a aVar = (a) this.f10077b;
                aVar.V.remove(pVar);
                if (!aVar.s()) {
                    aVar.w(aVar, o.f10059n, false);
                    aVar.K = true;
                    aVar.w(aVar, o.f10058m, false);
                    break;
                }
                break;
        }
    }

    @Override // l7.q, l7.m
    public void c(p pVar) {
        switch (this.f10076a) {
            case 1:
                a aVar = (a) this.f10077b;
                if (!aVar.Y) {
                    aVar.J();
                    aVar.Y = true;
                    break;
                }
                break;
        }
    }

    @Override // l7.q, l7.m
    public void f(p pVar) {
        switch (this.f10076a) {
            case 1:
                a aVar = (a) this.f10077b;
                int i10 = aVar.X - 1;
                aVar.X = i10;
                if (i10 == 0) {
                    aVar.Y = false;
                    aVar.m();
                }
                pVar.z(this);
                break;
            case 2:
                this.f10077b.B();
                pVar.z(this);
                break;
        }
    }

    public /* synthetic */ u(p pVar, int i10) {
        this.f10076a = i10;
        this.f10077b = pVar;
    }
}
