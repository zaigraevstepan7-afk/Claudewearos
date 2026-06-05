package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f4170a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4170a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f4170a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
