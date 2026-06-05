package r5;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends uk.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f13726d;

    public e(f fVar) {
        this.f13726d = fVar;
    }

    @Override // uk.c
    public final void H(Throwable th2) {
        ((k) this.f13726d.f13728b).f(th2);
    }

    @Override // uk.c
    public final void I(a8.j jVar) {
        f fVar = this.f13726d;
        fVar.f13729c = jVar;
        a8.j jVar2 = (a8.j) fVar.f13729c;
        k kVar = (k) fVar.f13728b;
        fVar.f13727a = new p1.l(jVar2, kVar.f13740g, kVar.f13742i, Build.VERSION.SDK_INT >= 34 ? o.a() : wd.a.B());
        k kVar2 = (k) fVar.f13728b;
        kVar2.getClass();
        ArrayList arrayList = new ArrayList();
        kVar2.f13734a.writeLock().lock();
        try {
            kVar2.f13736c = 1;
            arrayList.addAll(kVar2.f13735b);
            kVar2.f13735b.clear();
            kVar2.f13734a.writeLock().unlock();
            kVar2.f13737d.post(new b8.f(arrayList, kVar2.f13736c, (Throwable) null));
        } catch (Throwable th2) {
            kVar2.f13734a.writeLock().unlock();
            throw th2;
        }
    }
}
