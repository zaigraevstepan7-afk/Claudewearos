package og;

import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class m implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final long f12526a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12527b;

    public m(int i10) {
        int i11 = i10 + 1;
        int iFloor = (int) Math.floor(Math.log(i11) / Math.log(2.0d));
        this.f12527b = iFloor;
        this.f12526a = (((long) Math.pow(2.0d, iFloor)) - 1) & i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new l(this);
    }
}
