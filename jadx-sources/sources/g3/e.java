package g3;

import java.util.Comparator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7074a;

    public /* synthetic */ e(int i10) {
        this.f7074a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f7074a) {
        }
        return mk.b.l(Integer.valueOf(((d) obj).f7046b), Integer.valueOf(((d) obj2).f7046b));
    }
}
