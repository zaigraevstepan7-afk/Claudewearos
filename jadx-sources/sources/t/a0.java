package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public interface a0 extends j {
    @Override // t.j
    default q1 a(p1 p1Var) {
        return new a8.j(this);
    }

    float b(long j, float f10, float f11, float f12);

    long c(float f10, float f11, float f12);

    default float d(float f10, float f11, float f12) {
        return b(c(f10, f11, f12), f10, f11, f12);
    }

    float e(long j, float f10, float f11, float f12);
}
