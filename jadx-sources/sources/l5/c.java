package l5;

import android.graphics.Rect;
import java.util.Comparator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f9987a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f9988b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9989c;

    /* renamed from: d, reason: collision with root package name */
    public final x9.b f9990d;

    public c(boolean z2, x9.b bVar) {
        this.f9989c = z2;
        this.f9990d = bVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f9990d.getClass();
        Rect rect = this.f9987a;
        ((u4.e) obj).f(rect);
        Rect rect2 = this.f9988b;
        ((u4.e) obj2).f(rect2);
        int i10 = rect.top;
        int i11 = rect2.top;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int i12 = rect.left;
        int i13 = rect2.left;
        boolean z2 = this.f9989c;
        if (i12 < i13) {
            return z2 ? 1 : -1;
        }
        if (i12 > i13) {
            return z2 ? -1 : 1;
        }
        int i14 = rect.bottom;
        int i15 = rect2.bottom;
        if (i14 < i15) {
            return -1;
        }
        if (i14 > i15) {
            return 1;
        }
        int i16 = rect.right;
        int i17 = rect2.right;
        if (i16 < i17) {
            return z2 ? 1 : -1;
        }
        if (i16 > i17) {
            return z2 ? -1 : 1;
        }
        return 0;
    }
}
