package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e0 extends b implements f0, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4157b;

    static {
        new e0(10).f4139a = false;
    }

    public e0(int i10) {
        this(new ArrayList(i10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final List a() {
        return Collections.unmodifiableList(this.f4157b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        b();
        this.f4157b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f4157b.size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f4157b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z
    public final z f(int i10) {
        ArrayList arrayList = this.f4157b;
        if (i10 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i10);
        arrayList2.addAll(arrayList);
        return new e0(arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        String str;
        ArrayList arrayList = this.f4157b;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof i)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, a0.f4133a);
            if (q1.f4215a.O(0, bArr, bArr.length)) {
                arrayList.set(i10, str2);
            }
            return str2;
        }
        i iVar = (i) obj;
        Charset charset = a0.f4133a;
        if (iVar.size() == 0) {
            str = "";
        } else {
            h hVar = (h) iVar;
            str = new String(hVar.f4169d, hVar.y(), hVar.size(), charset);
        }
        h hVar2 = (h) iVar;
        int iY = hVar2.y();
        if (q1.f4215a.O(iY, hVar2.f4169d, hVar2.size() + iY)) {
            arrayList.set(i10, str);
        }
        return str;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final void o(i iVar) {
        b();
        this.f4157b.add(iVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final f0 p() {
        return this.f4139a ? new i1(this) : this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final Object r(int i10) {
        return this.f4157b.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        b();
        Object objRemove = this.f4157b.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof i)) {
            return new String((byte[]) objRemove, a0.f4133a);
        }
        i iVar = (i) objRemove;
        Charset charset = a0.f4133a;
        if (iVar.size() == 0) {
            return "";
        }
        h hVar = (h) iVar;
        return new String(hVar.f4169d, hVar.y(), hVar.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        b();
        Object obj2 = this.f4157b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof i)) {
            return new String((byte[]) obj2, a0.f4133a);
        }
        i iVar = (i) obj2;
        Charset charset = a0.f4133a;
        if (iVar.size() == 0) {
            return "";
        }
        h hVar = (h) iVar;
        return new String(hVar.f4169d, hVar.y(), hVar.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4157b.size();
    }

    public e0(ArrayList arrayList) {
        this.f4157b = arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        b();
        if (collection instanceof f0) {
            collection = ((f0) collection).a();
        }
        boolean zAddAll = this.f4157b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
