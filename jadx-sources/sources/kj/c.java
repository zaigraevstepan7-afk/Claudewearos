package kj;

import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c extends a implements e {
    static {
        new c((char) 1, (char) 0);
    }

    @Override // kj.e
    public final Comparable b() {
        return Character.valueOf(this.f9656a);
    }

    @Override // kj.e
    public final Comparable e() {
        return Character.valueOf(this.f9657b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.f9656a == cVar.f9656a && this.f9657b == cVar.f9657b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f9656a * 31) + this.f9657b;
    }

    @Override // kj.e
    public final boolean isEmpty() {
        return l.h(this.f9656a, this.f9657b) > 0;
    }

    public final String toString() {
        return this.f9656a + ".." + this.f9657b;
    }
}
