package ub;

import ak.v;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o implements rb.f {

    /* renamed from: a, reason: collision with root package name */
    public final Set f16974a;

    /* renamed from: b, reason: collision with root package name */
    public final i f16975b;

    /* renamed from: c, reason: collision with root package name */
    public final p f16976c;

    public o(Set set, i iVar, p pVar) {
        this.f16974a = set;
        this.f16975b = iVar;
        this.f16976c = pVar;
    }

    public final v a(String str, rb.c cVar, rb.e eVar) {
        Set set = this.f16974a;
        if (set.contains(cVar)) {
            return new v(this.f16975b, str, cVar, eVar, this.f16976c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
