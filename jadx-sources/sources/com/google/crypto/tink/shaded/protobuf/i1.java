package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i1 extends AbstractList implements f0, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f4176a;

    public i1(e0 e0Var) {
        this.f4176a = e0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final List a() {
        return Collections.unmodifiableList(this.f4176a.f4157b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f4176a.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        h1 h1Var = new h1();
        h1Var.f4170a = this.f4176a.iterator();
        return h1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        g1 g1Var = new g1();
        g1Var.f4168a = this.f4176a.listIterator(i10);
        return g1Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final void o(i iVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object r(int i10) {
        return this.f4176a.f4157b.get(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4176a.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final f0 p() {
        return this;
    }
}
