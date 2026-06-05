package nd;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f12296b;

    public o(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f12296b = bArr;
    }

    @Override // nd.n
    public final byte[] u() {
        return this.f12296b;
    }
}
