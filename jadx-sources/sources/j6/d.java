package j6;

import java.util.LinkedHashSet;
import wh.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public cg.b f8702a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8703b;

    /* renamed from: c, reason: collision with root package name */
    public s f8704c;

    public abstract void a();

    public abstract void b();

    public abstract void c(b bVar);

    public abstract void d(b bVar);

    public final void e() {
        s sVar = this.f8704c;
        if (sVar == null || !((LinkedHashSet) sVar.f19381c).remove(this)) {
            return;
        }
        g gVar = (g) sVar.f19380b;
        gVar.getClass();
        if (equals(gVar.f8714f)) {
            if (gVar.f8715g == -1) {
                a();
            }
            gVar.f8714f = null;
            gVar.f8715g = 0;
            gVar.f8716h = null;
        }
        gVar.f8712d.remove(this);
        gVar.f8713e.remove(this);
        this.f8704c = null;
        gVar.b();
    }

    public final void f(boolean z2) {
        g gVar;
        if (this.f8703b == z2) {
            return;
        }
        this.f8703b = z2;
        s sVar = this.f8704c;
        if (sVar == null || (gVar = (g) sVar.f19380b) == null) {
            return;
        }
        gVar.b();
    }
}
