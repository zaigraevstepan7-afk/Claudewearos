package fj;

import java.io.Serializable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class d implements lj.a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient lj.a f6791a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6792b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f6793c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6794d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6795e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6796f;

    public d(Object obj, Class cls, String str, String str2, boolean z2) {
        this.f6792b = obj;
        this.f6793c = cls;
        this.f6794d = str;
        this.f6795e = str2;
        this.f6796f = z2;
    }

    public abstract lj.a b();

    public final e f() {
        boolean z2 = this.f6796f;
        Class cls = this.f6793c;
        if (!z2) {
            return w.a(cls);
        }
        w.f6808a.getClass();
        return new p(cls);
    }
}
