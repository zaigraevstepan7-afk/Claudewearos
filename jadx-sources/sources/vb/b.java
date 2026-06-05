package vb;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18013a;

    /* renamed from: b, reason: collision with root package name */
    public final dc.a f18014b;

    /* renamed from: c, reason: collision with root package name */
    public final dc.a f18015c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18016d;

    public b(Context context, dc.a aVar, dc.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f18013a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f18014b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f18015c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f18016d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            b bVar = (b) ((c) obj);
            if (this.f18013a.equals(bVar.f18013a) && this.f18014b.equals(bVar.f18014b) && this.f18015c.equals(bVar.f18015c) && this.f18016d.equals(bVar.f18016d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f18013a.hashCode() ^ 1000003) * 1000003) ^ this.f18014b.hashCode()) * 1000003) ^ this.f18015c.hashCode()) * 1000003) ^ this.f18016d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f18013a);
        sb2.append(", wallClock=");
        sb2.append(this.f18014b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f18015c);
        sb2.append(", backendName=");
        return m6.a.j(sb2, this.f18016d, "}");
    }
}
