package m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11256d;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f11256d) {
            case 0:
                int i10 = this.f11255c;
                this.f11255c = i10 + 2;
                Object[] objArr = this.f11253a;
                return new a(0, objArr[i10], objArr[i10 + 1]);
            case 1:
                int i11 = this.f11255c;
                this.f11255c = i11 + 2;
                return this.f11253a[i11];
            default:
                int i12 = this.f11255c;
                this.f11255c = i12 + 2;
                return this.f11253a[i12 + 1];
        }
    }
}
