package q;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f13036a;

    /* renamed from: b, reason: collision with root package name */
    public int f13037b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13038c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f13039d;

    public c(e eVar) {
        this.f13039d = eVar;
        this.f13036a = eVar.f13117c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f13038c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i10 = this.f13037b;
        e eVar = this.f13039d;
        return fj.l.b(key, eVar.f(i10)) && fj.l.b(entry.getValue(), eVar.i(this.f13037b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f13038c) {
            return this.f13039d.f(this.f13037b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f13038c) {
            return this.f13039d.i(this.f13037b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13037b < this.f13036a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f13038c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i10 = this.f13037b;
        e eVar = this.f13039d;
        Object objF = eVar.f(i10);
        Object objI = eVar.i(this.f13037b);
        return (objF == null ? 0 : objF.hashCode()) ^ (objI != null ? objI.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f13037b++;
        this.f13038c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f13038c) {
            throw new IllegalStateException();
        }
        this.f13039d.g(this.f13037b);
        this.f13037b--;
        this.f13036a--;
        this.f13038c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f13038c) {
            return this.f13039d.h(this.f13037b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
