package z5;

import android.content.res.TypedArray;
import android.view.ViewGroup;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends ViewGroup.MarginLayoutParams {

    /* renamed from: c, reason: collision with root package name */
    public static final int f20416c = (-2147483647) - Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public static final int f20417d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f20418e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f20419f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f20420g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f20421h = 6;

    /* renamed from: i, reason: collision with root package name */
    public static final int f20422i = 7;
    public static final int j = 8;

    /* renamed from: k, reason: collision with root package name */
    public static final int f20423k = 9;

    /* renamed from: l, reason: collision with root package name */
    public static final int f20424l = 11;

    /* renamed from: m, reason: collision with root package name */
    public static final int f20425m = 12;

    /* renamed from: n, reason: collision with root package name */
    public static final int f20426n = 13;

    /* renamed from: o, reason: collision with root package name */
    public static final int f20427o = 10;

    /* renamed from: a, reason: collision with root package name */
    public l f20428a;

    /* renamed from: b, reason: collision with root package name */
    public l f20429b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f20429b.equals(jVar.f20429b) && this.f20428a.equals(jVar.f20428a);
    }

    public final int hashCode() {
        return this.f20429b.hashCode() + (this.f20428a.hashCode() * 31);
    }

    @Override // android.view.ViewGroup.LayoutParams
    public final void setBaseAttributes(TypedArray typedArray, int i10, int i11) {
        ((ViewGroup.MarginLayoutParams) this).width = typedArray.getLayoutDimension(i10, -2);
        ((ViewGroup.MarginLayoutParams) this).height = typedArray.getLayoutDimension(i11, -2);
    }
}
