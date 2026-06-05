package o;

import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f12359a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12360b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f12361c;

    public d(f fVar) {
        this.f12361c = fVar;
    }

    @Override // o.e
    public final void a(c cVar) {
        c cVar2 = this.f12359a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f12358d;
            this.f12359a = cVar3;
            this.f12360b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f12360b) {
            return this.f12361c.f12362a != null;
        }
        c cVar = this.f12359a;
        return (cVar == null || cVar.f12357c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f12360b) {
            this.f12360b = false;
            this.f12359a = this.f12361c.f12362a;
        } else {
            c cVar = this.f12359a;
            this.f12359a = cVar != null ? cVar.f12357c : null;
        }
        return this.f12359a;
    }
}
