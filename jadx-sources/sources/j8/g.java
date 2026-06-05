package j8;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final long f8752a = s3.b.b(0, 0, 0, 0, 5);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8753b = 0;

    public static final long a(long j) {
        return (hj.a.H(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (hj.a.H(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static void b(String str) {
        throw new IllegalArgumentException(y8.f.b("Unsupported type: ", str, ". ", m1.j("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }
}
