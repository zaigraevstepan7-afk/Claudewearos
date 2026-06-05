package v;

import android.widget.Magnifier;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class p1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final Magnifier f17258a;

    public p1(Magnifier magnifier) {
        this.f17258a = magnifier;
    }

    @Override // v.n1
    public void a(long j, long j4) {
        this.f17258a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final void b() {
        this.f17258a.dismiss();
    }

    public final long c() {
        return (this.f17258a.getHeight() & 4294967295L) | (this.f17258a.getWidth() << 32);
    }

    public final void d() {
        this.f17258a.update();
    }
}
