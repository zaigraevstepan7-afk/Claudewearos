package t2;

import java.io.Serializable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15616a;

    /* renamed from: b, reason: collision with root package name */
    public final o f15617b;

    /* renamed from: c, reason: collision with root package name */
    public final o f15618c;

    /* renamed from: d, reason: collision with root package name */
    public final o f15619d;

    /* renamed from: e, reason: collision with root package name */
    public final o f15620e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f15621f;

    public p(String str) {
        this.f15616a = 1;
        this.f15621f = str;
        this.f15617b = new o(1, null);
        this.f15618c = new o(0, null);
        this.f15619d = new o(1, null);
        this.f15620e = new o(0, null);
    }

    public final o a() {
        switch (this.f15616a) {
        }
        return this.f15620e;
    }

    public final o b() {
        switch (this.f15616a) {
        }
        return this.f15617b;
    }

    public final o c() {
        switch (this.f15616a) {
        }
        return this.f15619d;
    }

    public final o d() {
        switch (this.f15616a) {
        }
        return this.f15618c;
    }

    public final String toString() {
        switch (this.f15616a) {
            case 0:
                return qi.k.s0((p[]) this.f15621f, "innermostOf(", ")", 57);
            default:
                String str = (String) this.f15621f;
                if (str == null) {
                    return super.toString();
                }
                return "RectRulers(" + str + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(p[] pVarArr) {
        this.f15616a = 0;
        this.f15621f = pVarArr;
        int length = pVarArr.length;
        o[] oVarArr = new o[length];
        for (int i10 = 0; i10 < length; i10++) {
            oVarArr[i10] = ((p[]) this.f15621f)[i10].b();
        }
        this.f15617b = new o(1, new t1(oVarArr, 0));
        int length2 = ((p[]) this.f15621f).length;
        o[] oVarArr2 = new o[length2];
        for (int i11 = 0; i11 < length2; i11++) {
            oVarArr2[i11] = ((p[]) this.f15621f)[i11].d();
        }
        this.f15618c = new o(0, new n(oVarArr2, 0));
        int length3 = ((p[]) this.f15621f).length;
        o[] oVarArr3 = new o[length3];
        for (int i12 = 0; i12 < length3; i12++) {
            oVarArr3[i12] = ((p[]) this.f15621f)[i12].c();
        }
        this.f15619d = new o(1, new t1(oVarArr3, 1));
        int length4 = ((p[]) this.f15621f).length;
        o[] oVarArr4 = new o[length4];
        for (int i13 = 0; i13 < length4; i13++) {
            oVarArr4[i13] = ((p[]) this.f15621f)[i13].a();
        }
        this.f15620e = new o(0, new n(oVarArr4, 1));
    }
}
