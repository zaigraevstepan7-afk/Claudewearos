package ij;

import fj.l;
import java.util.Random;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b extends a {

    /* renamed from: b, reason: collision with root package name */
    public final ag.a f8597b = new ag.a(8);

    @Override // ij.a
    public final Random a() {
        Object obj = this.f8597b.get();
        l.e(obj, "get(...)");
        return (Random) obj;
    }
}
