package k3;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public List f9360a;

    /* renamed from: b, reason: collision with root package name */
    public y f9361b;

    /* renamed from: c, reason: collision with root package name */
    public int f9362c;

    /* renamed from: d, reason: collision with root package name */
    public int f9363d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f9364e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f9365f;

    /* renamed from: z, reason: collision with root package name */
    public int f9366z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, vi.c cVar) {
        super(cVar);
        this.f9365f = dVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f9364e = obj;
        this.f9366z |= Integer.MIN_VALUE;
        return this.f9365f.b(this);
    }
}
