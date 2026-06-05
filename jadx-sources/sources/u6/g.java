package u6;

import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import k0.h1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final u f16699a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f16700b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f16701c;

    /* renamed from: d, reason: collision with root package name */
    public final ReentrantLock f16702d;

    /* renamed from: e, reason: collision with root package name */
    public final s1.g f16703e;

    /* renamed from: f, reason: collision with root package name */
    public final f f16704f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f16705g;

    /* JADX WARN: Type inference failed for: r1v5, types: [u6.f] */
    public g(u uVar, HashMap map, HashMap map2, String... strArr) {
        this.f16699a = uVar;
        n0 n0Var = new n0(uVar, map, map2, strArr, uVar.j, new h1(1, this, g.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 0, 10));
        this.f16700b = n0Var;
        this.f16701c = new LinkedHashMap();
        this.f16702d = new ReentrantLock();
        this.f16703e = new s1.g(this, 6);
        final int i10 = 0;
        this.f16704f = new ej.a(this) { // from class: u6.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f16698b;

            {
                this.f16698b = this;
            }

            @Override // ej.a
            public final Object a() {
                switch (i10) {
                    case 0:
                        this.f16698b.getClass();
                        return pi.o.f13011a;
                    default:
                        g gVar = this.f16698b;
                        return Boolean.valueOf(!gVar.f16699a.m() || gVar.f16699a.p());
                }
            }
        };
        fj.l.e(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(...)");
        this.f16705g = new Object();
        final int i11 = 1;
        n0Var.j = new ej.a(this) { // from class: u6.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f16698b;

            {
                this.f16698b = this;
            }

            @Override // ej.a
            public final Object a() {
                switch (i11) {
                    case 0:
                        this.f16698b.getClass();
                        return pi.o.f13011a;
                    default:
                        g gVar = this.f16698b;
                        return Boolean.valueOf(!gVar.f16699a.m() || gVar.f16699a.p());
                }
            }
        };
    }
}
