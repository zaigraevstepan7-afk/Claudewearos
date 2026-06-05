package n6;

import ab.s;
import android.net.Uri;
import android.view.InputEvent;
import androidx.lifecycle.h0;
import c1.z2;
import fj.l;
import p6.d;
import qj.b0;
import qj.m0;
import ti.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final p6.b f11900a;

    public a(p6.b bVar) {
        this.f11900a = bVar;
    }

    @Override // n6.b
    public mf.a b(Uri uri, InputEvent inputEvent) {
        l.f(uri, "attributionSource");
        return cg.b.h(b0.d(b0.b(m0.f13601a), null, new s(this, uri, inputEvent, (c) null, 15), 3));
    }

    public mf.a c(p6.a aVar) {
        l.f(aVar, "deletionRequest");
        throw null;
    }

    public mf.a d() {
        return cg.b.h(b0.d(b0.b(m0.f13601a), null, new z2(this, null, 10), 3));
    }

    public mf.a e(Uri uri) {
        l.f(uri, "trigger");
        return cg.b.h(b0.d(b0.b(m0.f13601a), null, new h0(this, uri, null, 23), 3));
    }

    public mf.a f(p6.c cVar) {
        l.f(cVar, "request");
        throw null;
    }

    public mf.a g(d dVar) {
        l.f(dVar, "request");
        throw null;
    }
}
