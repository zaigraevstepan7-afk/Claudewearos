package e0;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final g f5304a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5305b;

    /* renamed from: c, reason: collision with root package name */
    public int f5306c;

    /* renamed from: d, reason: collision with root package name */
    public int f5307d;

    /* renamed from: e, reason: collision with root package name */
    public int f5308e;

    /* renamed from: f, reason: collision with root package name */
    public int f5309f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f5310g;

    /* renamed from: h, reason: collision with root package name */
    public Object f5311h;

    /* renamed from: i, reason: collision with root package name */
    public int f5312i;

    public r(g gVar) {
        this.f5304a = gVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new o(0, 0));
        this.f5305b = arrayList;
        this.f5309f = -1;
        this.f5310g = new ArrayList();
        this.f5311h = qi.s.f13520a;
    }

    public final int a() {
        return ((int) Math.sqrt((d() * 1.0d) / this.f5312i)) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public final q b(int i10) {
        ArrayList arrayList;
        int i11 = this.f5312i;
        int i12 = i10 * i11;
        int iD = d() - i12;
        if (i11 > iD) {
            i11 = iD;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if (i11 == this.f5311h.size()) {
            arrayList = this.f5311h;
        } else {
            ArrayList arrayList2 = new ArrayList(i11);
            for (int i13 = 0; i13 < i11; i13++) {
                arrayList2.add(new b(1));
            }
            this.f5311h = arrayList2;
            arrayList = arrayList2;
        }
        return new q(i12, arrayList);
    }

    public final int c(int i10) {
        if (d() <= 0) {
            return 0;
        }
        if (i10 >= d()) {
            a0.a.a("ItemIndex > total count");
        }
        return i10 / this.f5312i;
    }

    public final int d() {
        return this.f5304a.f5238c.f742b;
    }

    public final int e(int i10) {
        f0.l lVarD = this.f5304a.f5238c.d(i10);
        int i11 = i10 - lVarD.f6163a;
        return (int) ((b) ((f) lVarD.f6165c).f5233b.invoke(p.f5301a, Integer.valueOf(i11))).f5219a;
    }
}
