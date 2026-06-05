package k3;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s implements Comparable {
    public static final s A;
    public static final s B;
    public static final s C;
    public static final s D;
    public static final List E;

    /* renamed from: b, reason: collision with root package name */
    public static final s f9395b;

    /* renamed from: c, reason: collision with root package name */
    public static final s f9396c;

    /* renamed from: d, reason: collision with root package name */
    public static final s f9397d;

    /* renamed from: e, reason: collision with root package name */
    public static final s f9398e;

    /* renamed from: f, reason: collision with root package name */
    public static final s f9399f;

    /* renamed from: z, reason: collision with root package name */
    public static final s f9400z;

    /* renamed from: a, reason: collision with root package name */
    public final int f9401a;

    static {
        s sVar = new s(100);
        s sVar2 = new s(200);
        s sVar3 = new s(300);
        s sVar4 = new s(400);
        f9395b = sVar4;
        s sVar5 = new s(500);
        f9396c = sVar5;
        s sVar6 = new s(600);
        f9397d = sVar6;
        s sVar7 = new s(700);
        s sVar8 = new s(800);
        s sVar9 = new s(900);
        f9398e = sVar3;
        f9399f = sVar4;
        f9400z = sVar5;
        A = sVar6;
        B = sVar7;
        C = sVar8;
        D = sVar9;
        E = qi.k.c0(new s[]{sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9});
    }

    public s(int i10) {
        this.f9401a = i10;
        boolean z2 = false;
        if (1 <= i10 && i10 < 1001) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        m3.a.a("Font weight can be in range [1, 1000]. Current value: " + i10);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(s sVar) {
        return fj.l.h(this.f9401a, sVar.f9401a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            return this.f9401a == ((s) obj).f9401a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9401a;
    }

    public final String toString() {
        return m6.a.g(new StringBuilder("FontWeight(weight="), this.f9401a, ')');
    }
}
