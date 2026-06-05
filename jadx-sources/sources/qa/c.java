package qa;

import ja.h;
import qj.b0;
import tj.h0;
import tj.i0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final h f13324a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f13325b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f13326c = i0.a(0, 6, null);

    /* renamed from: d, reason: collision with root package name */
    public final h0 f13327d = i0.a(0, 6, null);

    /* renamed from: e, reason: collision with root package name */
    public final h0 f13328e = i0.a(0, 7, null);

    public c(h hVar) {
        this.f13324a = hVar;
    }

    public final void a(f6.a aVar) {
        if (this.f13325b) {
            return;
        }
        ti.c cVar = null;
        b0.w(aVar, null, new b(this, aVar, cVar, 0), 3);
        b0.w(aVar, null, new b(this, aVar, cVar, 1), 3);
        this.f13325b = true;
    }
}
