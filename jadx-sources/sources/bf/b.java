package bf;

import android.graphics.Typeface;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b extends k4.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x8.a f1752e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f1753f;

    public b(d dVar, x8.a aVar) {
        this.f1753f = dVar;
        this.f1752e = aVar;
    }

    @Override // k4.b
    public final void g(int i10) {
        this.f1753f.f1770n = true;
        this.f1752e.R(i10);
    }

    @Override // k4.b
    public final void h(Typeface typeface) {
        d dVar = this.f1753f;
        dVar.f1772p = Typeface.create(typeface, dVar.f1761d);
        dVar.f1770n = true;
        this.f1752e.S(dVar.f1772p, false);
    }
}
