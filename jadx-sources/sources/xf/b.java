package xf;

import java.util.Objects;
import nf.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final f f20048a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20049b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20050c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20051d;

    public b(f fVar, int i10, String str, String str2) {
        this.f20048a = fVar;
        this.f20049b = i10;
        this.f20050c = str;
        this.f20051d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f20048a == bVar.f20048a && this.f20049b == bVar.f20049b && this.f20050c.equals(bVar.f20050c) && this.f20051d.equals(bVar.f20051d);
    }

    public final int hashCode() {
        return Objects.hash(this.f20048a, Integer.valueOf(this.f20049b), this.f20050c, this.f20051d);
    }

    public final String toString() {
        return "(status=" + this.f20048a + ", keyId=" + this.f20049b + ", keyType='" + this.f20050c + "', keyPrefix='" + this.f20051d + "')";
    }
}
