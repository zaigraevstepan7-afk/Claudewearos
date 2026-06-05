package gk;

import java.util.Locale;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final kk.i f7439d;

    /* renamed from: e, reason: collision with root package name */
    public static final kk.i f7440e;

    /* renamed from: f, reason: collision with root package name */
    public static final kk.i f7441f;

    /* renamed from: g, reason: collision with root package name */
    public static final kk.i f7442g;

    /* renamed from: h, reason: collision with root package name */
    public static final kk.i f7443h;

    /* renamed from: i, reason: collision with root package name */
    public static final kk.i f7444i;

    /* renamed from: a, reason: collision with root package name */
    public final kk.i f7445a;

    /* renamed from: b, reason: collision with root package name */
    public final kk.i f7446b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7447c;

    static {
        kk.i iVar = kk.i.f9700d;
        f7439d = mk.b.p(":");
        f7440e = mk.b.p(":status");
        f7441f = mk.b.p(":method");
        f7442g = mk.b.p(":path");
        f7443h = mk.b.p(":scheme");
        f7444i = mk.b.p(":authority");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2) {
        this(mk.b.p(str), mk.b.p(str2));
        kk.i iVar = kk.i.f9700d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f7445a.equals(cVar.f7445a) && this.f7446b.equals(cVar.f7446b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7446b.hashCode() + ((this.f7445a.hashCode() + 527) * 31);
    }

    public final String toString() {
        String strD = this.f7445a.D();
        String strD2 = this.f7446b.D();
        byte[] bArr = bk.d.f1785a;
        Locale locale = Locale.US;
        return m1.w(strD, ": ", strD2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(kk.i iVar, String str) {
        this(iVar, mk.b.p(str));
        kk.i iVar2 = kk.i.f9700d;
    }

    public c(kk.i iVar, kk.i iVar2) {
        this.f7445a = iVar;
        this.f7446b = iVar2;
        this.f7447c = iVar2.e() + iVar.e() + 32;
    }
}
