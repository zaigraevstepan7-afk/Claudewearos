package m1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class d implements Iterator, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final n[] f11228a;

    /* renamed from: b, reason: collision with root package name */
    public int f11229b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11230c = true;

    public d(m mVar, n[] nVarArr) {
        this.f11228a = nVarArr;
        nVarArr[0].a(mVar.f11252d, Integer.bitCount(mVar.f11249a) * 2, 0);
        this.f11229b = 0;
        a();
    }

    public final void a() {
        int i10 = this.f11229b;
        n[] nVarArr = this.f11228a;
        n nVar = nVarArr[i10];
        if (nVar.f11255c < nVar.f11254b) {
            return;
        }
        while (-1 < i10) {
            int iB = b(i10);
            if (iB == -1) {
                n nVar2 = nVarArr[i10];
                int i11 = nVar2.f11255c;
                Object[] objArr = nVar2.f11253a;
                if (i11 < objArr.length) {
                    int length = objArr.length;
                    nVar2.f11255c = i11 + 1;
                    iB = b(i10);
                }
            }
            if (iB != -1) {
                this.f11229b = iB;
                return;
            }
            if (i10 > 0) {
                n nVar3 = nVarArr[i10 - 1];
                int i12 = nVar3.f11255c;
                int length2 = nVar3.f11253a.length;
                nVar3.f11255c = i12 + 1;
            }
            nVarArr[i10].a(m.f11248e.f11252d, 0, 0);
            i10--;
        }
        this.f11230c = false;
    }

    public final int b(int i10) {
        n[] nVarArr = this.f11228a;
        n nVar = nVarArr[i10];
        int i11 = nVar.f11255c;
        if (i11 < nVar.f11254b) {
            return i10;
        }
        Object[] objArr = nVar.f11253a;
        if (i11 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i11];
        fj.l.d(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        m mVar = (m) obj;
        if (i10 == 6) {
            n nVar2 = nVarArr[i10 + 1];
            Object[] objArr2 = mVar.f11252d;
            nVar2.a(objArr2, objArr2.length, 0);
        } else {
            nVarArr[i10 + 1].a(mVar.f11252d, Integer.bitCount(mVar.f11249a) * 2, 0);
        }
        return b(i10 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11230c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f11230c) {
            throw new NoSuchElementException();
        }
        Object next = this.f11228a[this.f11229b].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
