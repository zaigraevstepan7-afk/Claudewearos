package jb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final h f8837b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f8838c;

    /* renamed from: d, reason: collision with root package name */
    public static final h f8839d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ h[] f8840e;

    /* renamed from: a, reason: collision with root package name */
    public final float f8841a;

    static {
        h hVar = new h("Unrotated", 0, 0.0f);
        f8837b = hVar;
        h hVar2 = new h("RotatedLeft", 1, -90.0f);
        f8838c = hVar2;
        h hVar3 = new h("RotatedRight", 2, 90.0f);
        f8839d = hVar3;
        h[] hVarArr = {hVar, hVar2, hVar3};
        f8840e = hVarArr;
        u0.c.j(hVarArr);
    }

    public h(String str, int i10, float f10) {
        this.f8841a = f10;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f8840e.clone();
    }
}
