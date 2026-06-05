package f0;

import java.util.Comparator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ak.x f6202b;

    public /* synthetic */ x(ak.x xVar, int i10) {
        this.f6201a = i10;
        this.f6202b = xVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f6201a) {
            case 0:
                Object key = ((h0) obj).getKey();
                ak.x xVar = this.f6202b;
                return mk.b.l(Integer.valueOf(xVar.e(key)), Integer.valueOf(xVar.e(((h0) obj2).getKey())));
            case 1:
                Object key2 = ((h0) obj).getKey();
                ak.x xVar2 = this.f6202b;
                return mk.b.l(Integer.valueOf(xVar2.e(key2)), Integer.valueOf(xVar2.e(((h0) obj2).getKey())));
            case 2:
                Object key3 = ((h0) obj2).getKey();
                ak.x xVar3 = this.f6202b;
                return mk.b.l(Integer.valueOf(xVar3.e(key3)), Integer.valueOf(xVar3.e(((h0) obj).getKey())));
            default:
                Object key4 = ((h0) obj2).getKey();
                ak.x xVar4 = this.f6202b;
                return mk.b.l(Integer.valueOf(xVar4.e(key4)), Integer.valueOf(xVar4.e(((h0) obj).getKey())));
        }
    }
}
