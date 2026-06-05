package ri;

import fj.l;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g implements Map, Serializable, gj.d {
    public static final g G;
    public int A;
    public int B;
    public h C;
    public m1.i D;
    public h E;
    public boolean F;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f14539a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f14540b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f14541c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f14542d;

    /* renamed from: e, reason: collision with root package name */
    public int f14543e;

    /* renamed from: f, reason: collision with root package name */
    public int f14544f;

    /* renamed from: z, reason: collision with root package name */
    public int f14545z;

    static {
        g gVar = new g(0);
        gVar.F = true;
        G = gVar;
    }

    public g() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iJ = j(obj);
            int i10 = this.f14543e * 2;
            int length = this.f14542d.length / 2;
            if (i10 > length) {
                i10 = length;
            }
            int i11 = 0;
            while (true) {
                int[] iArr = this.f14542d;
                int i12 = iArr[iJ];
                if (i12 <= 0) {
                    int i13 = this.f14544f;
                    Object[] objArr = this.f14539a;
                    if (i13 < objArr.length) {
                        int i14 = i13 + 1;
                        this.f14544f = i14;
                        objArr[i13] = obj;
                        this.f14541c[i13] = iJ;
                        iArr[iJ] = i14;
                        this.B++;
                        this.A++;
                        if (i11 > this.f14543e) {
                            this.f14543e = i11;
                        }
                        return i13;
                    }
                    g(1);
                } else {
                    if (l.b(this.f14539a[i12 - 1], obj)) {
                        return -i12;
                    }
                    i11++;
                    if (i11 > i10) {
                        k(this.f14542d.length * 2);
                        break;
                    }
                    iJ = iJ == 0 ? this.f14542d.length - 1 : iJ - 1;
                }
            }
        }
    }

    public final g b() {
        c();
        this.F = true;
        if (this.B > 0) {
            return this;
        }
        g gVar = G;
        l.d(gVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return gVar;
    }

    public final void c() {
        if (this.F) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i10 = this.f14544f - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f14541c;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f14542d[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        mk.b.C(this.f14539a, 0, this.f14544f);
        Object[] objArr = this.f14540b;
        if (objArr != null) {
            mk.b.C(objArr, 0, this.f14544f);
        }
        this.B = 0;
        this.f14544f = 0;
        this.A++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z2) {
        int i10;
        Object[] objArr = this.f14540b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f14544f;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f14541c;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                Object[] objArr2 = this.f14539a;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                if (z2) {
                    iArr[i12] = i13;
                    this.f14542d[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        mk.b.C(this.f14539a, i12, i10);
        if (objArr != null) {
            mk.b.C(objArr, i12, this.f14544f);
        }
        this.f14544f = i12;
    }

    public final boolean e(Collection collection) {
        l.f(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        h hVar = this.E;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 0);
        this.E = hVar2;
        return hVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.B == map.size() && e(map.entrySet());
    }

    public final boolean f(Map.Entry entry) {
        l.f(entry, "entry");
        int iH = h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = this.f14540b;
        l.c(objArr);
        return l.b(objArr[iH], entry.getValue());
    }

    public final void g(int i10) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f14539a;
        int length = objArr.length;
        int i11 = this.f14544f;
        int i12 = length - i11;
        int i13 = i11 - this.B;
        if (i12 < i10 && i12 + i13 >= i10 && i13 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i14 = i11 + i10;
        if (i14 < 0) {
            throw new OutOfMemoryError();
        }
        if (i14 > objArr.length) {
            int length2 = objArr.length;
            int i15 = length2 + (length2 >> 1);
            if (i15 - i14 < 0) {
                i15 = i14;
            }
            if (i15 - 2147483639 > 0) {
                i15 = i14 > 2147483639 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i15);
            l.e(objArrCopyOf2, "copyOf(...)");
            this.f14539a = objArrCopyOf2;
            Object[] objArr2 = this.f14540b;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i15);
                l.e(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f14540b = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f14541c, i15);
            l.e(iArrCopyOf, "copyOf(...)");
            this.f14541c = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i15 >= 1 ? i15 : 1) * 3);
            if (iHighestOneBit > this.f14542d.length) {
                k(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f14540b;
        l.c(objArr);
        return objArr[iH];
    }

    public final int h(Object obj) {
        int iJ = j(obj);
        int i10 = this.f14543e;
        while (true) {
            int i11 = this.f14542d[iJ];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (l.b(this.f14539a[i12], obj)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iJ = iJ == 0 ? this.f14542d.length - 1 : iJ - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        d dVar = new d(this, 0);
        int i10 = 0;
        while (dVar.hasNext()) {
            int i11 = dVar.f14535a;
            g gVar = (g) dVar.f14538d;
            if (i11 >= gVar.f14544f) {
                throw new NoSuchElementException();
            }
            dVar.f14535a = i11 + 1;
            dVar.f14536b = i11;
            Object obj = gVar.f14539a[i11];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = gVar.f14540b;
            l.c(objArr);
            Object obj2 = objArr[dVar.f14536b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            dVar.e();
            i10 += iHashCode ^ iHashCode2;
        }
        return i10;
    }

    public final int i(Object obj) {
        int i10 = this.f14544f;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f14541c[i10] >= 0) {
                Object[] objArr = this.f14540b;
                l.c(objArr);
                if (l.b(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.B == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f14545z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f14541c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r6) {
        /*
            r5 = this;
            int r0 = r5.A
            int r0 = r0 + 1
            r5.A = r0
            int r0 = r5.f14544f
            int r1 = r5.B
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f14542d = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f14545z = r6
        L1c:
            int r6 = r5.f14544f
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f14539a
            r0 = r0[r2]
            int r0 = r5.j(r0)
            int r1 = r5.f14543e
        L2c:
            int[] r3 = r5.f14542d
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f14541c
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ri.g.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        h hVar = this.C;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this, 1);
        this.C = hVar2;
        return hVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0024->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f14539a
            java.lang.String r1 = "<this>"
            fj.l.f(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f14540b
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.f14541c
            r0 = r0[r12]
            int r1 = r11.f14543e
            int r1 = r1 * 2
            int[] r2 = r11.f14542d
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L20
            r1 = r2
        L20:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L24:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2e
            int[] r0 = r11.f14542d
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.f14543e
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.f14542d
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.f14542d
            r7 = r5[r0]
            if (r7 != 0) goto L44
            r5[r1] = r2
            goto L6c
        L44:
            if (r7 >= 0) goto L4b
            r5[r1] = r6
        L48:
            r1 = r0
            r4 = r2
            goto L65
        L4b:
            java.lang.Object[] r5 = r11.f14539a
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.j(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f14542d
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.f14541c
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.f14542d
            r0[r1] = r6
        L6c:
            int[] r0 = r11.f14541c
            r0[r12] = r6
            int r12 = r11.B
            int r12 = r12 + r6
            r11.B = r12
            int r12 = r11.A
            int r12 = r12 + 1
            r11.A = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ri.g.l(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.f14540b;
        if (objArr == null) {
            int length = this.f14539a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f14540b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i10 = (-iA) - 1;
        Object obj3 = objArr[i10];
        objArr[i10] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        l.f(map, "from");
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        g(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f14540b;
            if (objArr == null) {
                int length = this.f14539a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f14540b = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i10 = (-iA) - 1;
                if (!l.b(entry.getValue(), objArr[i10])) {
                    objArr[i10] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f14540b;
        l.c(objArr);
        Object obj2 = objArr[iH];
        l(iH);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.B;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.B * 3) + 2);
        sb2.append("{");
        int i10 = 0;
        d dVar = new d(this, 0);
        while (dVar.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            int i11 = dVar.f14535a;
            g gVar = (g) dVar.f14538d;
            if (i11 >= gVar.f14544f) {
                throw new NoSuchElementException();
            }
            dVar.f14535a = i11 + 1;
            dVar.f14536b = i11;
            Object obj = gVar.f14539a[i11];
            if (obj == gVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = gVar.f14540b;
            l.c(objArr);
            Object obj2 = objArr[dVar.f14536b];
            if (obj2 == gVar) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            dVar.e();
            i10++;
        }
        sb2.append("}");
        String string = sb2.toString();
        l.e(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        m1.i iVar = this.D;
        if (iVar != null) {
            return iVar;
        }
        m1.i iVar2 = new m1.i(this, 1);
        this.D = iVar2;
        return iVar2;
    }

    public g(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i10];
        int[] iArr = new int[i10];
        int iHighestOneBit = Integer.highestOneBit((i10 < 1 ? 1 : i10) * 3);
        this.f14539a = objArr;
        this.f14540b = null;
        this.f14541c = iArr;
        this.f14542d = new int[iHighestOneBit];
        this.f14543e = 2;
        this.f14544f = 0;
        this.f14545z = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
