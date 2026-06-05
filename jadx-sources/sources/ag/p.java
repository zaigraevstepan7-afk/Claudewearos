package ag;

import java.security.SecureRandom;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final a f456a = new a(3);

    public static byte[] a(int i10) {
        byte[] bArr = new byte[i10];
        ((SecureRandom) f456a.get()).nextBytes(bArr);
        return bArr;
    }
}
