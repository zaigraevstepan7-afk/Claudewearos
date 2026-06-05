package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r1 extends p1 {
    @Override // v.p1, v.n1
    public final void a(long j, long j4) {
        if (!Float.isNaN(Float.NaN)) {
            this.f17258a.setZoom(Float.NaN);
        }
        if ((9223372034707292159L & j4) != 9205357640488583168L) {
            this.f17258a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)));
        } else {
            this.f17258a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }
}
