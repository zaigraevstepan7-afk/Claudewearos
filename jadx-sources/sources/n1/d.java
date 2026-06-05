package n1;

import fj.y;
import java.util.ConcurrentModificationException;
import mj.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends e {
    public int A;

    /* renamed from: e, reason: collision with root package name */
    public final c f11864e;

    /* renamed from: f, reason: collision with root package name */
    public Object f11865f;

    /* renamed from: z, reason: collision with root package name */
    public boolean f11866z;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(c cVar) {
        Object obj = cVar.f11861b;
        m1.e eVar = cVar.f11863d;
        super(obj, eVar);
        this.f11864e = cVar;
        this.A = eVar.f11235e;
    }

    @Override // mj.e, java.util.Iterator
    public final Object next() {
        if (this.f11864e.f11863d.f11235e != this.A) {
            throw new ConcurrentModificationException();
        }
        Object next = super.next();
        this.f11865f = next;
        this.f11866z = true;
        return next;
    }

    @Override // mj.e, java.util.Iterator
    public final void remove() {
        if (!this.f11866z) {
            throw new IllegalStateException();
        }
        Object obj = this.f11865f;
        c cVar = this.f11864e;
        y.a(cVar).remove(obj);
        this.f11865f = null;
        this.f11866z = false;
        this.A = cVar.f11863d.f11235e;
        this.f11822c--;
    }
}
