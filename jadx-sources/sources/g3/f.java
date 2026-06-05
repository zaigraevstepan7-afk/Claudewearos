package g3;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    public final List f7080a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7081b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7082c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7083d;

    static {
        qh.c cVar = d0.f7049a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        r1.a(r3.f7047c);
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(java.util.List r9, java.lang.String r10) {
        /*
            r8 = this;
            r8.<init>()
            r8.f7080a = r9
            r8.f7081b = r10
            r10 = 0
            r0 = 0
            if (r9 == 0) goto L3c
            int r1 = r9.size()
            r2 = r10
            r3 = r0
            r4 = r3
        L12:
            if (r2 >= r1) goto L3e
            java.lang.Object r5 = r9.get(r2)
            g3.d r5 = (g3.d) r5
            java.lang.Object r6 = r5.f7045a
            boolean r7 = r6 instanceof g3.f0
            if (r7 == 0) goto L2b
            if (r3 != 0) goto L27
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L27:
            r3.add(r5)
            goto L39
        L2b:
            boolean r6 = r6 instanceof g3.t
            if (r6 == 0) goto L39
            if (r4 != 0) goto L36
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L36:
            r4.add(r5)
        L39:
            int r2 = r2 + 1
            goto L12
        L3c:
            r3 = r0
            r4 = r3
        L3e:
            r8.f7082c = r3
            r8.f7083d = r4
            if (r4 == 0) goto L4e
            g3.e r9 = new g3.e
            r9.<init>(r10)
            java.util.List r9 = qi.l.L0(r9, r4)
            goto L4f
        L4e:
            r9 = r0
        L4f:
            if (r9 == 0) goto Lba
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L58
            goto Lba
        L58:
            java.lang.Object r10 = qi.l.z0(r9)
            g3.d r10 = (g3.d) r10
            int r10 = r10.f7047c
            q.u r1 = q.j.f13093a
            q.u r1 = new q.u
            r2 = 1
            r1.<init>(r2)
            r1.a(r10)
            int r10 = r9.size()
        L6f:
            if (r2 >= r10) goto Lba
            java.lang.Object r3 = r9.get(r2)
            g3.d r3 = (g3.d) r3
        L77:
            int r4 = r1.f13137b
            if (r4 == 0) goto Lb2
            if (r4 == 0) goto Lac
            int[] r5 = r1.f13136a
            int r6 = r4 + (-1)
            r5 = r5[r6]
            int r6 = r3.f7046b
            int r7 = r3.f7047c
            if (r6 < r5) goto L8f
            int r4 = r4 + (-1)
            r1.d(r4)
            goto L77
        L8f:
            if (r7 > r5) goto L92
            goto Lb2
        L92:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Paragraph overlap not allowed, end "
            r4.<init>(r6)
            r4.append(r7)
            java.lang.String r6 = " should be less than or equal to "
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            m3.a.a(r4)
            goto Lb2
        Lac:
            java.lang.String r9 = "IntList is empty."
            r.a.e(r9)
            throw r0
        Lb2:
            int r3 = r3.f7047c
            r1.a(r3)
            int r2 = r2 + 1
            goto L6f
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.f.<init>(java.util.List, java.lang.String):void");
    }

    public final List a(int i10) {
        List list = this.f7080a;
        if (list == null) {
            return qi.s.f13520a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            d dVar = (d) obj;
            if ((dVar.f7045a instanceof l) && g.b(0, i10, dVar.f7046b, dVar.f7047c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final f b(ej.c cVar) {
        c cVar2 = new c(this);
        ArrayList arrayList = cVar2.f7042c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) cVar.invoke(((b) arrayList.get(i10)).a(Integer.MIN_VALUE));
            arrayList.set(i10, new b(dVar.f7045a, dVar.f7046b, dVar.f7047c, dVar.f7048d));
        }
        return cVar2.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    @Override // java.lang.CharSequence
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final g3.f subSequence(int r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 > r12) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            r2 = 41
            java.lang.String r3 = "start ("
            if (r1 != 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r11)
            java.lang.String r4 = ") should be less or equal to end ("
            r1.append(r4)
            r1.append(r12)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            m3.a.a(r1)
        L26:
            java.lang.String r1 = r10.f7081b
            if (r11 != 0) goto L31
            int r4 = r1.length()
            if (r12 != r4) goto L31
            return r10
        L31:
            java.lang.String r1 = r1.substring(r11, r12)
            java.lang.String r4 = "substring(...)"
            fj.l.e(r1, r4)
            g3.f r4 = g3.g.f7099a
            if (r11 > r12) goto L3f
            goto L59
        L3f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r11)
            java.lang.String r3 = ") should be less than or equal to end ("
            r4.append(r3)
            r4.append(r12)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            m3.a.a(r2)
        L59:
            java.util.List r2 = r10.f7080a
            if (r2 != 0) goto L5e
            goto L9e
        L5e:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.size()
            r3.<init>(r4)
            int r4 = r2.size()
        L6b:
            if (r0 >= r4) goto L98
            java.lang.Object r5 = r2.get(r0)
            g3.d r5 = (g3.d) r5
            int r6 = r5.f7046b
            int r7 = r5.f7047c
            boolean r6 = g3.g.b(r11, r12, r6, r7)
            if (r6 == 0) goto L95
            g3.d r6 = new g3.d
            java.lang.Object r8 = r5.f7045a
            int r9 = r5.f7046b
            int r9 = java.lang.Math.max(r11, r9)
            int r9 = r9 - r11
            int r7 = java.lang.Math.min(r12, r7)
            int r7 = r7 - r11
            java.lang.String r5 = r5.f7048d
            r6.<init>(r8, r9, r7, r5)
            r3.add(r6)
        L95:
            int r0 = r0 + 1
            goto L6b
        L98:
            boolean r11 = r3.isEmpty()
            if (r11 == 0) goto L9f
        L9e:
            r3 = 0
        L9f:
            g3.f r11 = new g3.f
            r11.<init>(r3, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.f.subSequence(int, int):g3.f");
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f7081b.charAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fj.l.b(this.f7081b, fVar.f7081b) && fj.l.b(this.f7080a, fVar.f7080a);
    }

    public final int hashCode() {
        int iHashCode = this.f7081b.hashCode() * 31;
        List list = this.f7080a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f7081b.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f7081b;
    }

    public /* synthetic */ f(String str) {
        this(str, qi.s.f13520a);
    }

    public f(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
