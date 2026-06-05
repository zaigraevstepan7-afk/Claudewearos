package og;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f12512a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12513b;

    public d(i iVar, Comparator comparator, boolean z2) {
        this.f12513b = z2;
        while (!iVar.isEmpty()) {
            this.f12512a.push((k) iVar);
            iVar = z2 ? iVar.g() : iVar.a();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12512a.size() > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ArrayDeque arrayDeque = this.f12512a;
        try {
            k kVar = (k) arrayDeque.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(kVar.f12519a, kVar.f12520b);
            if (this.f12513b) {
                for (i iVarG = kVar.f12521c; !iVarG.isEmpty(); iVarG = iVarG.g()) {
                    arrayDeque.push((k) iVarG);
                }
            } else {
                for (i iVarA = kVar.f12522d; !iVarA.isEmpty(); iVarA = iVarA.a()) {
                    arrayDeque.push((k) iVarA);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
