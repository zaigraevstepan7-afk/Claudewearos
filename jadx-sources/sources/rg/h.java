package rg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h implements Iterable, Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final h f14414d = new h("");

    /* renamed from: a, reason: collision with root package name */
    public final zg.c[] f14415a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14416b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14417c;

    public h(zg.c... cVarArr) {
        this.f14415a = (zg.c[]) Arrays.copyOf(cVarArr, cVarArr.length);
        this.f14416b = 0;
        this.f14417c = cVarArr.length;
        for (zg.c cVar : cVarArr) {
            ug.l.b("Can't construct a path with a null value!", cVar != null);
        }
    }

    public static h B(h hVar, h hVar2) {
        zg.c cVarZ = hVar.z();
        zg.c cVarZ2 = hVar2.z();
        if (cVarZ == null) {
            return hVar2;
        }
        if (cVarZ.equals(cVarZ2)) {
            return B(hVar.C(), hVar2.C());
        }
        throw new mg.c("INTERNAL ERROR: " + hVar2 + " is not contained in " + hVar);
    }

    public final h A() {
        if (isEmpty()) {
            return null;
        }
        return new h(this.f14415a, this.f14416b, this.f14417c - 1);
    }

    public final h C() {
        boolean zIsEmpty = isEmpty();
        int i10 = this.f14416b;
        if (!zIsEmpty) {
            i10++;
        }
        return new h(this.f14415a, i10, this.f14417c);
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(size());
        og.l lVar = new og.l(this);
        while (lVar.hasNext()) {
            arrayList.add(((zg.c) lVar.next()).f20592a);
        }
        return arrayList;
    }

    public final h e(h hVar) {
        int size = hVar.size() + size();
        zg.c[] cVarArr = new zg.c[size];
        System.arraycopy(this.f14415a, this.f14416b, cVarArr, 0, size());
        System.arraycopy(hVar.f14415a, hVar.f14416b, cVarArr, size(), hVar.size());
        return new h(cVarArr, 0, size);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        h hVar = (h) obj;
        if (size() != hVar.size()) {
            return false;
        }
        int i10 = this.f14416b;
        for (int i11 = hVar.f14416b; i10 < this.f14417c && i11 < hVar.f14417c; i11++) {
            if (!this.f14415a[i10].equals(hVar.f14415a[i11])) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (int i10 = this.f14416b; i10 < this.f14417c; i10++) {
            iHashCode = (iHashCode * 37) + this.f14415a[i10].f20592a.hashCode();
        }
        return iHashCode;
    }

    public final h i(zg.c cVar) {
        int size = size();
        int i10 = size + 1;
        zg.c[] cVarArr = new zg.c[i10];
        System.arraycopy(this.f14415a, this.f14416b, cVarArr, 0, size);
        cVarArr[size] = cVar;
        return new h(cVarArr, 0, i10);
    }

    public final boolean isEmpty() {
        return this.f14416b >= this.f14417c;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new og.l(this);
    }

    public final int size() {
        return this.f14417c - this.f14416b;
    }

    public final String toString() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = this.f14416b; i10 < this.f14417c; i10++) {
            sb2.append("/");
            sb2.append(this.f14415a[i10].f20592a);
        }
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r2 != r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0 != r1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        if (r2 != r3) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        return 1;
     */
    @Override // java.lang.Comparable
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(rg.h r6) {
        /*
            r5 = this;
            int r0 = r6.f14416b
            int r1 = r6.f14417c
            int r2 = r5.f14416b
        L6:
            int r3 = r5.f14417c
            if (r2 >= r3) goto L20
            if (r0 >= r1) goto L20
            zg.c[] r3 = r5.f14415a
            r3 = r3[r2]
            zg.c[] r4 = r6.f14415a
            r4 = r4[r0]
            int r3 = r3.compareTo(r4)
            if (r3 == 0) goto L1b
            return r3
        L1b:
            int r2 = r2 + 1
            int r0 = r0 + 1
            goto L6
        L20:
            if (r2 != r3) goto L26
            if (r0 != r1) goto L26
            r6 = 0
            return r6
        L26:
            if (r2 != r3) goto L2a
            r6 = -1
            return r6
        L2a:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rg.h.compareTo(rg.h):int");
    }

    public final boolean x(h hVar) {
        if (size() > hVar.size()) {
            return false;
        }
        int i10 = hVar.f14416b;
        int i11 = this.f14416b;
        while (i11 < this.f14417c) {
            if (!this.f14415a[i11].equals(hVar.f14415a[i10])) {
                return false;
            }
            i11++;
            i10++;
        }
        return true;
    }

    public final zg.c y() {
        if (isEmpty()) {
            return null;
        }
        return this.f14415a[this.f14417c - 1];
    }

    public final zg.c z() {
        if (isEmpty()) {
            return null;
        }
        return this.f14415a[this.f14416b];
    }

    public h(List list) {
        this.f14415a = new zg.c[list.size()];
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            this.f14415a[i10] = zg.c.b((String) it.next());
            i10++;
        }
        this.f14416b = 0;
        this.f14417c = list.size();
    }

    public h(String str) {
        String[] strArrSplit = str.split("/", -1);
        int i10 = 0;
        for (String str2 : strArrSplit) {
            if (str2.length() > 0) {
                i10++;
            }
        }
        this.f14415a = new zg.c[i10];
        int i11 = 0;
        for (String str3 : strArrSplit) {
            if (str3.length() > 0) {
                this.f14415a[i11] = zg.c.b(str3);
                i11++;
            }
        }
        this.f14416b = 0;
        this.f14417c = this.f14415a.length;
    }

    public h(zg.c[] cVarArr, int i10, int i11) {
        this.f14415a = cVarArr;
        this.f14416b = i10;
        this.f14417c = i11;
    }
}
