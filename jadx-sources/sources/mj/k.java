package mj;

import i1.l;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class k implements Iterable, gj.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f11829a;

    public k(d dVar) {
        this.f11829a = dVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new l(this.f11829a);
    }
}
