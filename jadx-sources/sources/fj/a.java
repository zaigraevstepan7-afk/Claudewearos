package fj;

import java.io.Serializable;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class a implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6780a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f6781b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6782c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6783d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6784e = false;

    /* renamed from: f, reason: collision with root package name */
    public final int f6785f;

    /* renamed from: z, reason: collision with root package name */
    public final int f6786z;

    public a(int i10, int i11, Class cls, Object obj, String str, String str2) {
        this.f6780a = obj;
        this.f6781b = cls;
        this.f6782c = str;
        this.f6783d = str2;
        this.f6785f = i10;
        this.f6786z = i11 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6784e == aVar.f6784e && this.f6785f == aVar.f6785f && this.f6786z == aVar.f6786z && this.f6780a.equals(aVar.f6780a) && this.f6781b.equals(aVar.f6781b) && this.f6782c.equals(aVar.f6782c) && this.f6783d.equals(aVar.f6783d);
    }

    @Override // fj.i
    public final int getArity() {
        return this.f6785f;
    }

    public final int hashCode() {
        return ((((m1.c(m1.c((this.f6781b.hashCode() + (this.f6780a.hashCode() * 31)) * 31, 31, this.f6782c), 31, this.f6783d) + (this.f6784e ? 1231 : 1237)) * 31) + this.f6785f) * 31) + this.f6786z;
    }

    public final String toString() {
        w.f6808a.getClass();
        return x.a(this);
    }
}
