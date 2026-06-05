package ak;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f603a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f604b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f605c;

    public c0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f603a = aVar;
        this.f604b = proxy;
        this.f605c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return c0Var.f603a.equals(this.f603a) && c0Var.f604b.equals(this.f604b) && c0Var.f605c.equals(this.f605c);
    }

    public final int hashCode() {
        return this.f605c.hashCode() + ((this.f604b.hashCode() + ((this.f603a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f605c + "}";
    }
}
