package kj;

import fj.l;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b implements Iterator, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f9659a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9660b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9661c;

    /* renamed from: d, reason: collision with root package name */
    public int f9662d;

    public b(char c6, char c10, int i10) {
        this.f9659a = i10;
        this.f9660b = c10;
        boolean z2 = false;
        if (i10 <= 0 ? l.h(c6, c10) >= 0 : l.h(c6, c10) <= 0) {
            z2 = true;
        }
        this.f9661c = z2;
        this.f9662d = z2 ? c6 : c10;
    }

    public final char a() {
        int i10 = this.f9662d;
        if (i10 != this.f9660b) {
            this.f9662d = this.f9659a + i10;
        } else {
            if (!this.f9661c) {
                throw new NoSuchElementException();
            }
            this.f9661c = false;
        }
        return (char) i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9661c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
