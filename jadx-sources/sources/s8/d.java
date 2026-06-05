package s8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f14780a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f14781b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d[] f14782c;

    static {
        d dVar = new d("EXACT", 0);
        f14780a = dVar;
        d dVar2 = new d("INEXACT", 1);
        f14781b = dVar2;
        d[] dVarArr = {dVar, dVar2};
        f14782c = dVarArr;
        u0.c.j(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f14782c.clone();
    }
}
