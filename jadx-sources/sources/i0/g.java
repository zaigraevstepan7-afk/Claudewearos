package i0;

import pi.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8087a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8088b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ej.c f8089c;

    public /* synthetic */ g(ej.c cVar, boolean z2, int i10) {
        this.f8087a = i10;
        this.f8089c = cVar;
        this.f8088b = z2;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f8087a) {
            case 0:
                this.f8089c.invoke(Boolean.valueOf(!this.f8088b));
                break;
            case 1:
                if (this.f8088b) {
                    this.f8089c.invoke(Boolean.FALSE);
                }
                return o.f13011a;
            case 2:
                if (this.f8088b) {
                    this.f8089c.invoke(Boolean.TRUE);
                }
                return o.f13011a;
            case 3:
                this.f8089c.invoke(Boolean.valueOf(!this.f8088b));
                break;
            default:
                this.f8089c.invoke(Boolean.valueOf(!this.f8088b));
                break;
        }
        return o.f13011a;
    }

    public /* synthetic */ g(boolean z2, ej.c cVar, int i10) {
        this.f8087a = i10;
        this.f8088b = z2;
        this.f8089c = cVar;
    }
}
