package kg;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f9601a = null;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f9602b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f9603c;

    /* renamed from: d, reason: collision with root package name */
    public int f9604d;

    /* renamed from: e, reason: collision with root package name */
    public int f9605e;

    /* renamed from: f, reason: collision with root package name */
    public e f9606f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f9607g;

    public a(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f9602b = hashSet;
        this.f9603c = new HashSet();
        this.f9604d = 0;
        this.f9605e = 0;
        this.f9607g = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            yd.f.n(cls2, "Null interface");
            this.f9602b.add(r.a(cls2));
        }
    }

    public final void a(j jVar) {
        if (this.f9602b.contains(jVar.f9630a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.f9603c.add(jVar);
    }

    public final b b() {
        if (this.f9606f != null) {
            return new b(this.f9601a, new HashSet(this.f9602b), new HashSet(this.f9603c), this.f9604d, this.f9605e, this.f9606f, this.f9607g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public final void c(int i10) {
        if (!(this.f9604d == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.f9604d = i10;
    }

    public a(r rVar, r[] rVarArr) {
        HashSet hashSet = new HashSet();
        this.f9602b = hashSet;
        this.f9603c = new HashSet();
        this.f9604d = 0;
        this.f9605e = 0;
        this.f9607g = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            yd.f.n(rVar2, "Null interface");
        }
        Collections.addAll(this.f9602b, rVarArr);
    }
}
