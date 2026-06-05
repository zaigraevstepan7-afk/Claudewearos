package m1;

import fj.y;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class f extends d {

    /* renamed from: d, reason: collision with root package name */
    public final e f11237d;

    /* renamed from: e, reason: collision with root package name */
    public Object f11238e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11239f;

    /* renamed from: z, reason: collision with root package name */
    public int f11240z;

    public f(e eVar, n[] nVarArr) {
        super(eVar.f11233c, nVarArr);
        this.f11237d = eVar;
        this.f11240z = eVar.f11235e;
    }

    public final void c(int i10, m mVar, Object obj, int i11) {
        int i12 = i11 * 5;
        n[] nVarArr = this.f11228a;
        if (i12 <= 30) {
            int iF = 1 << uk.c.F(i10, i12);
            if (mVar.h(iF)) {
                nVarArr[i11].a(mVar.f11252d, Integer.bitCount(mVar.f11249a) * 2, mVar.f(iF));
                this.f11229b = i11;
                return;
            } else {
                int iT = mVar.t(iF);
                m mVarS = mVar.s(iT);
                nVarArr[i11].a(mVar.f11252d, Integer.bitCount(mVar.f11249a) * 2, iT);
                c(i10, mVarS, obj, i11 + 1);
                return;
            }
        }
        n nVar = nVarArr[i11];
        Object[] objArr = mVar.f11252d;
        nVar.a(objArr, objArr.length, 0);
        while (true) {
            n nVar2 = nVarArr[i11];
            if (fj.l.b(nVar2.f11253a[nVar2.f11255c], obj)) {
                this.f11229b = i11;
                return;
            } else {
                nVarArr[i11].f11255c += 2;
            }
        }
    }

    @Override // m1.d, java.util.Iterator
    public final Object next() {
        if (this.f11237d.f11235e != this.f11240z) {
            throw new ConcurrentModificationException();
        }
        if (!this.f11230c) {
            throw new NoSuchElementException();
        }
        n nVar = this.f11228a[this.f11229b];
        this.f11238e = nVar.f11253a[nVar.f11255c];
        this.f11239f = true;
        return super.next();
    }

    @Override // m1.d, java.util.Iterator
    public final void remove() {
        if (!this.f11239f) {
            throw new IllegalStateException();
        }
        boolean z2 = this.f11230c;
        e eVar = this.f11237d;
        if (!z2) {
            y.b(eVar).remove(this.f11238e);
        } else {
            if (!z2) {
                throw new NoSuchElementException();
            }
            n nVar = this.f11228a[this.f11229b];
            Object obj = nVar.f11253a[nVar.f11255c];
            y.b(eVar).remove(this.f11238e);
            c(obj != null ? obj.hashCode() : 0, eVar.f11233c, obj, 0);
        }
        this.f11238e = null;
        this.f11239f = false;
        this.f11240z = eVar.f11235e;
    }
}
