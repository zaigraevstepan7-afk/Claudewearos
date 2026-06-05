package l1;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: c, reason: collision with root package name */
    public final f f9868c;

    /* renamed from: d, reason: collision with root package name */
    public int f9869d;

    /* renamed from: e, reason: collision with root package name */
    public j f9870e;

    /* renamed from: f, reason: collision with root package name */
    public int f9871f;

    public h(f fVar, int i10) {
        super(i10, fVar.A);
        this.f9868c = fVar;
        this.f9869d = fVar.x();
        this.f9871f = -1;
        b();
    }

    public final void a() {
        if (this.f9869d != this.f9868c.x()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // l1.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i10 = this.f9849a;
        f fVar = this.f9868c;
        fVar.add(i10, obj);
        this.f9849a++;
        this.f9850b = fVar.b();
        this.f9869d = fVar.x();
        this.f9871f = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        f fVar = this.f9868c;
        Object[] objArr = fVar.f9864f;
        if (objArr == null) {
            this.f9870e = null;
            return;
        }
        int i10 = (fVar.A - 1) & (-32);
        int i11 = this.f9849a;
        if (i11 > i10) {
            i11 = i10;
        }
        int i12 = (fVar.f9862d / 5) + 1;
        j jVar = this.f9870e;
        if (jVar == null) {
            this.f9870e = new j(objArr, i11, i10, i12);
            return;
        }
        jVar.f9849a = i11;
        jVar.f9850b = i10;
        jVar.f9874c = i12;
        if (jVar.f9875d.length < i12) {
            jVar.f9875d = new Object[i12];
        }
        jVar.f9875d[0] = objArr;
        ?? r62 = i11 == i10 ? 1 : 0;
        jVar.f9876e = r62;
        jVar.b(i11 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f9849a;
        this.f9871f = i10;
        j jVar = this.f9870e;
        f fVar = this.f9868c;
        if (jVar == null) {
            Object[] objArr = fVar.f9865z;
            this.f9849a = i10 + 1;
            return objArr[i10];
        }
        if (jVar.hasNext()) {
            this.f9849a++;
            return jVar.next();
        }
        Object[] objArr2 = fVar.f9865z;
        int i11 = this.f9849a;
        this.f9849a = i11 + 1;
        return objArr2[i11 - jVar.f9850b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f9849a;
        this.f9871f = i10 - 1;
        j jVar = this.f9870e;
        f fVar = this.f9868c;
        if (jVar == null) {
            Object[] objArr = fVar.f9865z;
            int i11 = i10 - 1;
            this.f9849a = i11;
            return objArr[i11];
        }
        int i12 = jVar.f9850b;
        if (i10 <= i12) {
            this.f9849a = i10 - 1;
            return jVar.previous();
        }
        Object[] objArr2 = fVar.f9865z;
        int i13 = i10 - 1;
        this.f9849a = i13;
        return objArr2[i13 - i12];
    }

    @Override // l1.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i10 = this.f9871f;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f9868c;
        fVar.e(i10);
        int i11 = this.f9871f;
        if (i11 < this.f9849a) {
            this.f9849a = i11;
        }
        this.f9850b = fVar.b();
        this.f9869d = fVar.x();
        this.f9871f = -1;
        b();
    }

    @Override // l1.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i10 = this.f9871f;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f9868c;
        fVar.set(i10, obj);
        this.f9869d = fVar.x();
        b();
    }
}
