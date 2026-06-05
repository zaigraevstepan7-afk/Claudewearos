package ef;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class k extends a.a {
    @Override // a.a
    public final void B(w wVar, float f10, float f11) {
        float f12 = f11 * f10;
        wVar.d(f12, 180.0f, 90.0f);
        float f13 = f12 * 2.0f;
        s sVar = new s(0.0f, 0.0f, f13, f13);
        sVar.f6052f = 180.0f;
        sVar.f6053g = 90.0f;
        wVar.f6064f.add(sVar);
        q qVar = new q(sVar);
        wVar.a(180.0f);
        wVar.f6065g.add(qVar);
        wVar.f6062d = 270.0f;
        float f14 = (0.0f + f13) * 0.5f;
        float f15 = (f13 - 0.0f) / 2.0f;
        double d10 = 270.0f;
        wVar.f6060b = (((float) Math.cos(Math.toRadians(d10))) * f15) + f14;
        wVar.f6061c = (f15 * ((float) Math.sin(Math.toRadians(d10)))) + f14;
    }
}
