package ub;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f16961a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f16962b;

    /* renamed from: c, reason: collision with root package name */
    public final rb.d f16963c;

    public i(String str, byte[] bArr, rb.d dVar) {
        this.f16961a = str;
        this.f16962b = bArr;
        this.f16963c = dVar;
    }

    public static p1.l a() {
        p1.l lVar = new p1.l(10, false);
        lVar.f12662d = rb.d.f14317a;
        return lVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f16961a.equals(iVar.f16961a) && Arrays.equals(this.f16962b, iVar.f16962b) && this.f16963c.equals(iVar.f16963c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f16961a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f16962b)) * 1000003) ^ this.f16963c.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.f16962b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(this.f16961a);
        sb2.append(", ");
        sb2.append(this.f16963c);
        sb2.append(", ");
        return m6.a.j(sb2, strEncodeToString, ")");
    }
}
