package ub;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final rb.c f16970a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f16971b;

    public l(rb.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f16970a = cVar;
        this.f16971b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f16970a.equals(lVar.f16970a)) {
            return Arrays.equals(this.f16971b, lVar.f16971b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f16970a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f16971b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f16970a + ", bytes=[...]}";
    }
}
