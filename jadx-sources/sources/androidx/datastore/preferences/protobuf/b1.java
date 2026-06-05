package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f903a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f904b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f905c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0 f906d;

    public b1(z0 z0Var) {
        this.f906d = z0Var;
    }

    public final Iterator a() {
        if (this.f905c == null) {
            this.f905c = this.f906d.f1042b.entrySet().iterator();
        }
        return this.f905c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f903a + 1;
        z0 z0Var = this.f906d;
        return i10 < z0Var.f1041a.size() || (!z0Var.f1042b.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f904b = true;
        int i10 = this.f903a + 1;
        this.f903a = i10;
        z0 z0Var = this.f906d;
        return i10 < z0Var.f1041a.size() ? (Map.Entry) z0Var.f1041a.get(this.f903a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f904b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f904b = false;
        int i10 = z0.f1040f;
        z0 z0Var = this.f906d;
        z0Var.b();
        if (this.f903a >= z0Var.f1041a.size()) {
            a().remove();
            return;
        }
        int i11 = this.f903a;
        this.f903a = i11 - 1;
        z0Var.h(i11);
    }
}
