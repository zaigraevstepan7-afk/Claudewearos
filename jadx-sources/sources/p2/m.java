package p2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final g1.e f12728a = new g1.e(new l[16]);

    /* renamed from: b, reason: collision with root package name */
    public final q.b0 f12729b = new q.b0(10);

    public boolean a(q.p pVar, t2.w wVar, h hVar, boolean z2) {
        g1.e eVar = this.f12728a;
        Object[] objArr = eVar.f7024a;
        int i10 = eVar.f7026c;
        boolean z10 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            z10 = ((l) objArr[i11]).a(pVar, wVar, hVar, z2) || z10;
        }
        return z10;
    }

    public void b(h hVar) {
        g1.e eVar = this.f12728a;
        int i10 = eVar.f7026c;
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            }
            if (((l) eVar.f7024a[i10]).f12718d.f9420a == 0) {
                eVar.l(i10);
            }
        }
    }
}
