package d0;

import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f4337a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4338b;

    /* renamed from: c, reason: collision with root package name */
    public int f4339c;

    /* renamed from: d, reason: collision with root package name */
    public float f4340d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4341e;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    public static int a(e0.l lVar, boolean z2) {
        return z2 ? ((e0.m) qi.l.F0(lVar.f5268m)).f5275a + 1 : ((e0.m) qi.l.z0(lVar.f5268m)).f5275a - 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    public static int b(o oVar, boolean z2) {
        return z2 ? ((p) qi.l.F0(oVar.f4402k)).f4409a + 1 : ((p) qi.l.z0(oVar.f4402k)).f4409a - 1;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    public static int c(e0.l lVar, boolean z2) {
        if (z2) {
            e0.m mVar = (e0.m) qi.l.F0(lVar.f5268m);
            return (lVar.f5272q == o1.f19664a ? mVar.f5289p : mVar.f5290q) + 1;
        }
        e0.m mVar2 = (e0.m) qi.l.z0(lVar.f5268m);
        return (lVar.f5272q == o1.f19664a ? mVar2.f5289p : mVar2.f5290q) - 1;
    }
}
