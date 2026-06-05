package t1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z implements Iterator, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final t f15520a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f15521b;

    /* renamed from: c, reason: collision with root package name */
    public int f15522c;

    /* renamed from: d, reason: collision with root package name */
    public Map.Entry f15523d;

    /* renamed from: e, reason: collision with root package name */
    public Map.Entry f15524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15525f;

    public z(t tVar, Iterator it, int i10) {
        this.f15525f = i10;
        this.f15520a = tVar;
        this.f15521b = it;
        this.f15522c = tVar.c().f15487d;
        a();
    }

    public final void a() {
        this.f15523d = this.f15524e;
        Iterator it = this.f15521b;
        this.f15524e = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15524e != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f15525f) {
            case 0:
                a();
                if (this.f15523d != null) {
                    return new y(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.f15524e;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry.getKey();
            default:
                Map.Entry entry2 = this.f15524e;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry2.getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        t tVar = this.f15520a;
        if (tVar.c().f15487d != this.f15522c) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.f15523d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        tVar.remove(entry.getKey());
        this.f15523d = null;
        this.f15522c = tVar.c().f15487d;
    }
}
