package og;

import java.util.AbstractMap;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f12506a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12507b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f12508c;

    public a(b bVar, int i10, boolean z2) {
        this.f12508c = bVar;
        this.f12507b = z2;
        this.f12506a = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12507b ? this.f12506a >= 0 : this.f12506a < this.f12508c.f12509a.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b bVar = this.f12508c;
        Object[] objArr = bVar.f12509a;
        int i10 = this.f12506a;
        Object obj = objArr[i10];
        Object obj2 = bVar.f12510b[i10];
        this.f12506a = this.f12507b ? i10 - 1 : i10 + 1;
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
    }
}
