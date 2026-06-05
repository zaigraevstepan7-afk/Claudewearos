package jh;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kg.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final oh.b f8927a;

    /* renamed from: b, reason: collision with root package name */
    public final oh.b f8928b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f8929c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public final Executor f8930d;

    public a(oh.b bVar, oh.b bVar2, p pVar, Executor executor) {
        this.f8927a = bVar;
        this.f8928b = bVar2;
        this.f8930d = executor;
        pVar.a(new ac.h(this, 12));
    }
}
